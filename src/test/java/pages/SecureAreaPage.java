package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SecureAreaPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
        // Initialize WebDriverWait with 10 seconds timeout
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Existing method that gets the alert text
    public String getAlertText() {
        WebElement flashElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));
        return flashElement.getText().replace("×", "").trim();
    }

    // other methods...
}





/*package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlert = By.id("flash");
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}*/
