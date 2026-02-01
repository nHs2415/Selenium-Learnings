package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize(); // maximize the browser window

        //name locator
        driver.findElement(By.name("username")).sendKeys("Admin");

        //id locator
        //driver.findElement(By.id("logo")).isDisplayed();
        boolean logoDisplayedStatus = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(logoDisplayedStatus);

        // linkText locator
        driver.findElement(By.linkText("Dashboard")).click();

        // partialLinkText locator
        driver.findElement(By.partialLinkText("Dash")).click();

        // className locator --> count of elements
        List< WebElement> header = driver.findElements(By.className("class name"));
        System.out.println("total number of header links: " + header.size());

        // tagName locator
        List< WebElement> allLinks = driver.findElements(By.tagName("a"));
    }
}
