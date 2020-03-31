
package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://monosnap.com/");
        Thread.sleep(5000);

        //1.maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.findElement(By.id("email")).sendKeys("igwe_obianuju22@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("mellyberry.uju");
        driver.findElement(By.id("loginbutton")).click();

    }

    public static void main(String args[]) throws InterruptedException {
        LoginTests test= new LoginTests();
        test.setUp();


    }

}
