import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;

public class SeleniumTest {
    WebDriver driver;

    public static void main(String[] args) {
        final ChromeDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);

        driver.get("https://burger.crabdance.com/");
        driver.manage().window().setSize(new Dimension(1653, 1027));
        driver.findElement(By.cssSelector("#top_menu_collapse > #top_menu > .nav-item:nth-child(2) span")).click();
        driver.findElement(By.cssSelector("tr:nth-child(1) > .oe_product:nth-child(1) .img")).click();
        driver.findElement(By.name("ptal-23")).click();
        {
            WebElement dropdown = driver.findElement(By.name("ptal-23"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:Jalapenos \\+ 0,50\\s€']")).click();
        }
        driver.findElement(By.name("ptal-21")).click();
        {
            WebElement dropdown = driver.findElement(By.name("ptal-21"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:Vegan Cheese \\+ 0,80\\s€']")).click();
        }
        driver.findElement(By.name("ptal-22")).click();
        {
            WebElement dropdown = driver.findElement(By.name("ptal-22"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:BBQ \\+ 0,50\\s€']")).click();
        }
        driver.findElement(By.name("ptal-33")).click();
        {
            WebElement dropdown = driver.findElement(By.name("ptal-33"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:vegan Bacon \\+ 0,80\\s€']")).click();
        }
        driver.findElement(By.id("add_to_cart")).click();
        driver.findElement(By.cssSelector(".bg-transparent > span")).click();
        driver.findElement(By.cssSelector(".bg-transparent > span")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("prueba");
        driver.findElement(By.name("email")).sendKeys("prueba@prueba.com");
        driver.findElement(By.name("phone")).sendKeys("00000000");
        driver.findElement(By.name("street")).sendKeys("prueba 22");
        driver.findElement(By.name("city")).sendKeys("bremen");
        driver.findElement(By.name("zip")).sendKeys("28210");
        driver.findElement(By.id("country_id")).click();
        {
            WebElement dropdown = driver.findElement(By.id("country_id"));
            dropdown.findElement(By.xpath("//option[. = 'Aruba']")).click();
        }
        driver.findElement(By.cssSelector(".fa-chevron-right")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".fa-chevron-right"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }

        driver.quit();
    }

}
