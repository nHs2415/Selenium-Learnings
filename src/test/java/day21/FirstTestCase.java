package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTestCase {

    /*
    --------------------------------
    1) Launch browser (chrome)
    2) Navigate to url "https://opensource-demo.orangehrmlive.com/"
    3) Validate title should be "OrangeHRM"
    4) Close browser

     */

    public static void main(String[] args) {

        //1) Launch browser (chrome)
        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        // WebDriver driver = new EdgeDriver();

        // Open the URL
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Validate title should be "OrangeHRM"
        String act_title = driver.getTitle();
        System.out.println("Title is: "+ act_title);

        if(act_title.equals("OrangeHRM")){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
            System.out.println(act_title);
        }


        // Close browser
        // driver.close();
         driver.quit();
    }
}
