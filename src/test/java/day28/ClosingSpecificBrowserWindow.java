package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ClosingSpecificBrowserWindow {
    public static void main(String[] args) {
            /*
            Closing specific browser window
            -------------------------------
            1) close() - it is used to close the current window. if there is only one window then it will close the browser. if there are multiple windows then it will close the current window and switch to the next available window.
            2) quit() - it is used to close all the windows and end the WebDriver session.
            */
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        driver.get("http://localhost:8090/shapes/editor/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector(".text-center.text-sm.font-medium")).click();

        Set<String> windowIDs = driver.getWindowHandles(); // get the window handles of all the open windows

        for(String id : windowIDs) {
            String title = driver.switchTo().window(id).getTitle();
            System.out.println(title);

            if (driver.getTitle().equals("Shapes Editor")) {
                driver.close(); // it will close the current window
                break;
            }
        }
    }
}
