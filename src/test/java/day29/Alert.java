package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert {
    /*
            Handling alerts
            ---------------
            1) Alert is a pop-up that appears on the web page to alert the user about something. it can be an error message, a confirmation message, or a prompt message.
            2) Alert is a child class of WebDriver and it is used to handle the alerts in Selenium.
            3) Alert interface provides the following methods to handle the alerts:
                a) accept() - it is used to accept the alert. it will click on the OK button of the alert.
                b) dismiss() - it is used to dismiss the alert. it will click on the Cancel button of the alert.
                c) getText() - it is used to get the text of the alert. it returns a string value.
                d) sendKeys(String keysToSend) - it is used to send keys to the alert. it is used in case of prompt alert where we need to enter some value in the alert.
        */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8090/shapes/editor/");
        driver.manage().window().maximize();

        // Normal alert with ok button
        //driver.findElement(By.cssSelector(".text-center.text-sm.font-medium")).click();
        // Thread.sleep(3000);

        // Alert myalert = driver.switchTo().alert();
        //System.out.println(myalert.getText());
        // myalert.accept(); // it will accept the alert
        //myalert.dismiss(); // it will dismiss the alert
        //String alertText = myalert.getText(); // it will get the text of the alert
        //System.out.println(alertText);
        //myalert.sendKeys("Hello"); // it will send keys to the alert
    }

    /*
    2) Confirmation Alert - OK & cancel

    driver.findElement(By.cssSelector(".text-center.text-sm.font-medium")).click();
    Thread.sleep(3000);

    driver.switchTo().alert().accept(); // it will accept the alert using OK button
    driver.switchTo().alert().dismiss(); // it will dismiss the alert using Cancel button
     */

    /*
    3) Prompt Alert - it will have a text box to enter some value and it will have OK & cancel button
    driver.findElement(By.cssSelector(".text-center.text-sm.font-medium")).click();

    Alert myalert = driver.swiytchTo().alert();
    myalert.sendKeys("Hello"); // it will send keys to the alert
    myalert.accept(); // it will accept the alert using OK button
     */


    //driver.switchTo().alert().accept(); // it will accept the alert
    //driver.switchTo().alert().dismiss(); // it will dismiss the alert
    //String alertText = driver.switchTo().alert().getText(); // it will get the text of the alert
    //System.out.println(alertText);
    //driver.switchTo().alert().sendKeys("Hello"); // it will send keys to the alert

}
