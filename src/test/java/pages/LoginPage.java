package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void setUsername(String userName){
        driver.findElement(usernameField).sendKeys(userName);
    }

    public void setPassword(String passWord){
        driver.findElement(passwordField).sendKeys(passWord);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);

    }
}
