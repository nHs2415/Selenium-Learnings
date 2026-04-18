package day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class HandleFrames {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         /*
            How to handle frames in Selenium?
            1. Switch to the frame using its name or id attribute
            2. Switch to the frame using its index
            3. Switch to the frame using its WebElement
         */

        // 1. Switch to the frame using its name or id attribute

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

        // 2. Switch to the frame1
        driver.switchTo().frame(frame1); //passed frame as a webelement

        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello World!");

        // 3. `Switch to frame 2
        //driver.findElement(By.xpath("//[input@name='mytext2']")).sendKeys("Selenium"); // here get noSuchElement exception because we are still in frame 1

        // Switch back to the main page
        driver.switchTo().defaultContent(); // this will switch back to the main page

        // Now we can switch to frame 2 and interact with the elements inside it
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2); // here we can switch to frame 2 using its name or id attribute
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");

        // inner iframe

        driver.switchTo().defaultContent(); // switch back to the main page
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3); // switch to frame 3 using its webelement
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("java");

        // switch to inner iframe
        driver.switchTo().frame(0); // switch to the first iframe inside frame 3 using its index
        driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();

    }


/*
frames / iframes

driver.switchTo().frame() --> this method is used to switch to a frame or iframe
driver.switchTo().defaultContent() --> this method is used to switch back to the main page
driver.switchTo().frame(name/id) --> this method is used to switch to a frame using its name or id attribute
driver.switchTo().frame(index) --> this method is used to switch to a frame using its index . when have one single frame
driver.switchTo().frame(WebElement) --> this method is used to switch to a frame using its WebElement

 */

/*
3 types of switching methods

1) browser windows
driver.switchTo().window() --> this method is used to switch to a different browser window or tab

2) alerts
driver.switchTo().alert() --> this method is used to switch to an alert pop-up

3) frames/iframes
driver.switchTo().frame() --> this method is used to switch to a frame or iframe

 */

}
