import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.linkText("Apple iPhone 14 (128 GB) - Yellow")).click();



        Thread.sleep(4000);
        driver.close();
    }
}
