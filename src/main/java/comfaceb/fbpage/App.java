package comfaceb.fbpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("kiran.prasad8897@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Vasavi@Kiran1");
        driver.manage().window().maximize();
        driver.findElement(By.id("login")).click();
        Thread.sleep(2000);
        driver.quit();
        
         	
    }
}
