package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize(); // maximize the browser window

        // CSS Selector by ID --> tag#id
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T shirt");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T shirt");

        // css selector by class --> class.classname
        //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T shirt");

        //tag and attribute --> tag[attribute='value']
        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T shirt");

        // tag, class and attribute
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T shirt");


    }
}
