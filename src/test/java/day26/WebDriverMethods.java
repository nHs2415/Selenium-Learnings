package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WebDriverMethods {

    // Web Driver methods
    /*
    1) get methods
    2) conditional methods
    3) browser methods
    4) navigational methods
    5) wait methods
     */

    /*
    get methods - we can access these methods through webdriver instance

    get(url) - opens the url on the browser
    getTitle() - returns title of the page
    getCurrentUrl() - return URL of the page
    getPageSource() - returns source code of the page
    getWindowHandle() - returns ID of the single Browser window
    getWindowHandles() - returns ID's of the multiple browser windows
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8090/shapes/editor/");

        //System.out.println(driver.getTitle());

        //driver.getCurrentUrl(); // return in the form of string

        //String windowid = driver.getWindowHandle();
        //System.out.println(" Window Id : "+ windowid);

/*
        driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // opens new browser

        Set<String> windowids = driver.getWindowHandles();
        System.out.println(windowids);
*/
        // close() - close particular window
        // quit() - close all the windows which are opened

        /* conditional methods - access these comands through webElement
        ------------------------

        return boolean value ( true/false)

        isDisplayed() - we can check display status of the element
        isEnabled() - we can check enable /  disable status of the element / operational element
        isSelected() - we can use to check the element is selected or not
         */

        //driver.get("");
        driver.manage().window().maximize();

        // isDisplayed()
        //WebElement logo = driver.findElement(By.cssSelector("span.px-6"));
        // System.out.println("Display status of logo : " +logo.isDisplayed());

        //boolean status = driver.findElement(By.cssSelector("span.px-6")).isDisplayed();
        //System.out.println("Display status : " + status);

        // isEnabled()
        //boolean status = driver.findElement(By.cssSelector("button.flex")).isEnabled();
        //System.out.println("Display status : "+ status);

        // isSelected()
        WebElement start_rd = driver.findElement(By.xpath("//input[@id='start']"));
        WebElement end_rd = driver.findElement(By.xpath("//input[@id='end']"));

        start_rd.click();
        System.out.println(start_rd.isSelected()); // true
        end_rd.isSelected(); // false

        /* Browser methods
        -------------------
        close() - close single browser
        quit() - close multiple browsers

         */


    }
}
