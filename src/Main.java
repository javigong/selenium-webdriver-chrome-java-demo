import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/javier/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.launchBrowser();
    }
}