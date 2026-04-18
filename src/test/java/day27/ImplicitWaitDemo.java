package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitDemo {
    public static void main(String[] args) {
            /*
            Implicit wait - driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            ----------------

            It is a global wait and applicable for all the web elements in the script

            It will wait for the element to be present in the DOM for the specified time duration before throwing NoSuchElementException

            If the element is found before the time duration then it will continue with the execution without waiting for the remaining time

            Advantages:
            1) Single time/ one statement
            2) it will not wait till maximum time if the element is available
            3) Applicable for all the elements
            4) easy to use

                Disadvantages:
                1) if the element is not found within the time limit then it will throw NoSuchElementException
                2) it will wait for maximum time if the element is not available. this will reduce the performance of the script
                3) it is not applicable for non web elements like alert, pop up, frame, window etc
                4) if the time is not suffitient then will get exception

            */
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait for 10 seconds

        driver.get("http://localhost:8090/shapes/editor/");
        driver.manage().window().maximize();

        WebElement btn = driver.findElement(By.cssSelector("button.flex "));
        System.out.println(btn.isDisplayed());
        btn.click();

        driver.close();

        // if the element is not found within the time limit then it will throw NoSuchElementException. maximum 10 seconds it will wait. if available element no wait

    }
}
