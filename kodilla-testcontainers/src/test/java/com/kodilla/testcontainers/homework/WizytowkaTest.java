package com.kodilla.testcontainers.homework;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;
import org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode;
import org.testcontainers.containers.DefaultRecordingFileFactory;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
public class WizytowkaTest {

    // Tworzymy nową instancję Network (nie za pomocą @Container)
    public Network network = Network.newNetwork();

    @Container
    public GenericContainer<?> webServer =
            new GenericContainer<>(
                    new ImageFromDockerfile()
                            .withFileFromClasspath("index.html", "index.html")
                            .withDockerfileFromBuilder(builder ->
                                    builder
                                            .from("httpd:2.4")
                                            .copy("index.html", "/usr/local/apache2/htdocs/")
                                            .build()))
                    .withNetwork(network)
                    .withNetworkAliases("my-server")
                    .withExposedPorts(80);

    @Container
    public BrowserWebDriverContainer<?> chrome =
            new BrowserWebDriverContainer<>()
                    .withNetwork(network)
                    .withRecordingMode(VncRecordingMode.SKIP, null)
                    .withCapabilities(new ChromeOptions());

    @Container
    public BrowserWebDriverContainer<?> firefox =
            new BrowserWebDriverContainer<>()
                    .withNetwork(network)
                    .withRecordingMode(VncRecordingMode.RECORD_ALL, new File("./build/"))
                    .withRecordingFileFactory(new DefaultRecordingFileFactory())
                    .withCapabilities(new FirefoxOptions());

    @Test
    public void customImageTest() throws IOException {
        // Test with Chrome
        RemoteWebDriver driver = chrome.getWebDriver();
        driver.get("http://my-server/");

        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        assertTrue(driver.getPageSource().contains("Barbara"));

        // Test with Firefox
        driver = firefox.getWebDriver();
        driver.get("http://my-server/");

        screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        assertTrue(driver.getPageSource().contains("Barbara"));
    }
}