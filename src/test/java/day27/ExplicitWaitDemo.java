package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class ExplicitWaitDemo {
    /*
    Explicit wait  -

    1) conditional based, it will work more effectively
    2) finding element is inclusive ( for some conditions)
    3) it will wait for condition to be true, then consider the time
    4) we need to write multiple statements for multiple elements

     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("http://localhost:8090/shapes/editor/");
        driver.manage().window().maximize();

        WebElement txt_shape_module = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.px-6")));
        System.out.println(txt_shape_module.isDisplayed());

        WebElement btn = mywait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.flex")));
        btn.click();

        //WebElement btn = driver.findElement(By.cssSelector("button.flex.flex-col.items-center.justify-center.w-28.h-32.gap-1.p-2.border.border-blue-800.rounded-lg.hover:bg-gray-100"));
        //System.out.println(btn.isDisplayed());
        //btn.click();

        driver.close();
    }
}
