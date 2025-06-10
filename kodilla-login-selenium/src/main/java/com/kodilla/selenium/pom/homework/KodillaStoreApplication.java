package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KodillaStoreApplication {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Projekty-kodilla/kodiila-course/chromedriver-win64/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");

        KodillaStoreSearchPom storeSearchPom = new KodillaStoreSearchPom(driver);
        storeSearchPom.acceptCookies();
        int count = storeSearchPom.searchAndCountResults("Powerful");

        if (count == 0){
            System.out.println("Wygląda na to, że nie mamy tego czego szukasz");
        }
        else {
        System.out.println("Znaleziono: "+ count + " wyników wyszukiwania");
        }

        driver.close();
    }
}