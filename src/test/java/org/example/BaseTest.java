package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    @BeforeEach
    void setup() {

        String browser = System.getProperty("browser", "chrome");
        driver = createDriver(browser);
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));

        String baseUrl = System.getProperty("baseUrl", "https://qa-scooter.education-services.ru/");
        driver.get(baseUrl);
    }


    private WebDriver createDriver(String browser) {
        if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions ffOptions = new FirefoxOptions();
            ffOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
            return new FirefoxDriver(ffOptions);
        }

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        return new ChromeDriver(options);
    }


    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
