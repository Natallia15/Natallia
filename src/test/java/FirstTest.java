import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTest {
    WebDriver driver;
    @BeforeTest
public void setUp(){
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.onliner.by/");

}

@Test
    public void firstTest (){


        WebElement element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/header/div[2]/div/nav/ul[1]/li[1]/a[2]/span"));
String actualResult = element.getText();
        Assert.assertEquals(actualResult, "Чушь");




        //System.out.println("test");
    //}
   /* @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("before Class");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("before groups");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before metod");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after Suite");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after Class");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("after groups");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after metod");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }*/
}}
