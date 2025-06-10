package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KodillaStorePomTest {

    KodillaStoreSearchPom storeSearchPom;
    WebDriver driver;

    @BeforeEach
    public void setup(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storeSearchPom = new KodillaStoreSearchPom(driver);
        storeSearchPom.acceptCookies();
    }

    @AfterEach
    public void downTest(){
        driver.close();
    }

    @ParameterizedTest
    @CsvSource({
            "NoteBook, 2",
            "School, 1",
            "Brand, 1",
            "Bussines, 1",
            "Gaming, 1",
            "Powerful, 0"
    })

    public void testSearchResult (String equipmentName, int expectedResult){
        int result = storeSearchPom.searchAndCountResults(equipmentName);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({
            "nOTEBook, 2",
            "sCHool, 1",
            "braNd, 1",
            "buSSines, 1",
            "gaming, 1",
            "powerful, 0"
    })

    public void testIsIgnoreLetterSize (String equipmentName, int expectedResult){
        int result = storeSearchPom.searchAndCountResults(equipmentName);
        Assertions.assertEquals(expectedResult, result);
    }

}


