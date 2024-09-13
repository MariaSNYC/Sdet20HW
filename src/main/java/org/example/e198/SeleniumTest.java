package org.example.e198;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static void main(String[] args) {
        // Load properties using ConfigReader
        ConfigReader config = new ConfigReader();
        String browser = config.getBrowser();
        String url = config.getUrl();
        int implicitWait = config.getImplicitWait();

        WebDriver driver = null;

        // Set up WebDriver based on browser type from config.properties
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
            driver = new FirefoxDriver();
        }

        // Apply implicit wait
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);

        // Navigate to the URL
        driver.get(url);

        // Print output for verification
        System.out.println("Browser: " + browser + " URL: " + url + " Implicit Wait: " + implicitWait + " seconds");

        // Close the browser
        driver.quit();
    }
}

