package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class HandleAlertUsingExplicitWait {
    /*
            Handling alert using explicit wait
            --------------------------------
            1) Sometimes, the alert may take some time to appear on the web page. in that case, we can use explicit wait to wait for the alert to be present on the web page before handling it.
            2) We can use WebDriverWait class to implement explicit wait for the alert.
            3) We can use ExpectedConditions class to specify the condition for the alert to be present on the web page.
        */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // explicit wait for 10 seconds

        driver.get("http://localhost:8090/shapes/editor/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector(".text-center.text-sm.font-medium")).click();
        Thread.sleep(5000);

        wait.until(ExpectedConditions.alertIsPresent()); // wait for the alert to be present on the web page

        Alert myalert = driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept(); // it will accept the alert

    }
}
