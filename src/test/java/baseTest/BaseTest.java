package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import org.testng.annotations.AfterSuite;

// Base class for test classes, contains common setup and teardown methods
public class BaseTest {

    // WebDriver instance for browser automation
    public static WebDriver driver;

    // Method to initialize the browser
    public void OpenBrowser() {
        // Initialize WebDriver with ChromeDriver
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the URL of the application
        driver.get("http://localhost:80/ecomm");

        // Delete all cookies to start with a clean state
        driver.manage().deleteAllCookies();

        // Set page load timeout to 5 seconds
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    }



}