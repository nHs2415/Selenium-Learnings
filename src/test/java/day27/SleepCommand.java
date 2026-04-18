package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {
    /* wait command
    ------------------

    Synchronization

    Thread.sleep()

    1) implicit wait
    2) explicit wait/ fluent wait

    sleep()

    Advantages:
    1) easy to use

    Disadvantages:
    1) if the time is not suffiecient then you will get exception
    2) it will wait for maximum time out.this will reduce the performance script
    3) multiple times
     */

    /*
    NoSuchElementException - if the element is not found within the time limit
    ElementNotFoundException - if the element is not found in the DOM / incorrect xpath
     */


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8090/shapes/editor/");
        driver.manage().window().maximize();

        Thread.sleep(3000); // pause the execution

        driver.findElement(By.cssSelector(""));
    }
}
