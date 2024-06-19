package Pages;

import basePages.BasePage;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Contact extends BasePage {

    WebDriver driver;

    // Constructor for ContactPage class
    public Contact(WebDriver driver) {
        super(driver);
        // Assigning the WebDriver instance passed as parameter to the local driver variable
        this.driver = driver;
        // Initializing elements using PageFactory to enable Page Object Model
        PageFactory.initElements(driver, this);


    }
}



