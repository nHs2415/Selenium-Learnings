package day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    // x path = coming from xml path (address of the element)
    // DOM = document object model (html code) - can capture xpath from here

    /*
    Two types of x path
        1. Absolute xpath (full xpath) -> inspect, copy full xpath
                /html/body/main/div[1]/nav/button
                contains only tag names never use attributes
                starts with single slash (/) and followed by tag names
                traversing from root element to the target element

        2. Partial xpath (relative xpath) - recommended
               //*[@id="menu"]
                use attribute of the element
                starts with double slash (//) and followed by tag name or asterisk (*)
                directly locate the target element without traversing from root element
                //button[normalize-space()='0 item(s) - $0.00']

     */

    /*
    Relative xpath syntax:
    can generate automatically and manually

    syntax:
    //tagname[@attribute='value'] - most common
    //*[@attribute='value'] - if tag name is not important

     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // Xpath with single attribute ....
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("MacBook");

        //xpath with multiple attributes....
        //---> //input[@name='search'][@placeholder='Search']

        // Xpath with and or operators
        //input[@name='search' and @placeholder='Search']
        //input[@name='search' or @placeholder='Search']

        // Xpath with inner text - text()
        //a[text()='MacBook'] - inner text
        driver.findElement(By.xpath("//a[text()='MacBook']")).click();

        //Xpath with contains() method -->
        //input[contains(@placeholder,'Search')] - partial match with attribute value
        //Sea is starting text
        // [contains(text(), '')] - only for inner text

        //Xpath with starts-with() method
        //input[starts-with(@placeholder,'Sea')] - starts with specific text in attribute value - Sea everywhere but only at the beginning of the value
        driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Sea')]")).sendKeys("iPhone");

        // handling dynamic attributes --->
        //*[@id='start' or 'stop']
        //*[contains(@id, 'st')]
        //*[starts-with(@id, 'st')]
        //*[contains(text(), 'st')]

        //chained xpath --->
        boolean image_status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();

    }

}
