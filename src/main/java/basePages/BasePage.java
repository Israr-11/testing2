package basePages;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;

    // Constructor for the BasePage class
    public BasePage(WebDriver driver) {
        // Assigning the WebDriver instance passed as parameter to the local driver variable
        this.driver = driver;
        // Initializing elements using PageFactory to enable Page Object Model
        PageFactory.initElements(driver, this);
    }

    // Method to wait explicitly for visibility of an element
    public void explicitWaitForVisibility(WebElement element) {
        // Creating WebDriverWait instance with a timeout of 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        // Waiting until the element is visible
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}