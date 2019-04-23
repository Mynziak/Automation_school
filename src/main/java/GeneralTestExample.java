import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralTestExample {

    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mynziakdmytro/Documents/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://www.pdffiller.com");

        driver.get("https://google.com");
    }
}
