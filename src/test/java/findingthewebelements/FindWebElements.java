package findingthewebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindWebElements {

    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println(links.size());

        //WebElement inputsLink= driver.findElement(By.linkText("Inputs"));
        //inputsLink.click();
        //click on the Shifting Content-> Menu Element-> count number of menu items
        driver.findElement(By.linkText("Shifting Content")).click();
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + menuItems.size());

        //find out if we want to click an non-existing element
        //WebElement inputsLink= driver.findElement(By.linkText("Lekshmi"));
        //inputsLink.click();
        driver.quit();
    }
    public static void main(String[] args){
        FindWebElements findWeb= new FindWebElements();
        findWeb.setUp();
    }
}
