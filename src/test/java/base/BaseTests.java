package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {

    //create a Webdriver Object
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        //Launch the browser
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

        //change the window size//
        //driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //in a particular size like display in iphone, samsung or etc
        //driver.manage().window().setSize(new Dimension(375,812));
        //get the title of the webpage
        //System.out.println(driver.getTitle());

        //close the browser window and end the session

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
