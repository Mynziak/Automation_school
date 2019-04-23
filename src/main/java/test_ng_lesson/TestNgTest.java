package test_ng_lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners({MyTestListener.class})
public class TestNgTest {

    private WebDriver driver;

    @BeforeClass
    public void setDriver() {>
        System.setProperty("webdriver.chrome.driver", "/Users/mynziakdmytro/Documents/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterTest() {
        driver.quit();
    }


    @Test(enabled = true)
    public void firstTestNgTest() {

        driver.get("https://mvnrepository.com/artifact/org.testng/testng/6.14.3");

    }

    //@Test
    public void secondTestNgTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/mynziakdmytro/Documents/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://github.com/pdffiller/pdffiller-tests_v2/pull/1882");
    }

    @Test
    public void thirdTestNgTest() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/Users/mynziakdmytro/Documents/chromedriver");
//        driver = new ChromeDriver();
        driver.get("https://www.pdffiller.com/en/fillable-pdf-forms-search-engine.htm?v=new&q=medical");

        Thread.sleep(3000);
        WebElement search_btn = driver.findElement(By.id("search_main_btn"));
        String actual_srch_btn_name = search_btn.getText();
        System.out.println("actual search button name = " + actual_srch_btn_name);
        Assert.assertEquals(actual_srch_btn_name, "Search");
    }

}
