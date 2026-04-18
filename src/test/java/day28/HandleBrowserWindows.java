package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
public class HandleBrowserWindows {
    public static void main(String[] args) {
            /*
            Handle browser windows
            ----------------------
            1) getWindowHandle() - it is used to get the unique identifier of the current window. it returns a string value which is the window handle.
            2) getWindowHandles() - it is used to get the unique identifiers of all the open windows. it returns a set of string values which are the window handles.
            3) switchTo().window() - it is used to switch to a specific window using its window handle.

            */

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://localhost:8090/shapes/editor/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector(".text-center.text-sm.font-medium")).click();

        Set<String> windowIDs = driver.getWindowHandles(); // get the window handles of all the open windows

        // Approach 1
        /*
        List<String> windowList = new ArrayList<>(windowIDs);

        if (windowList.size() > 1) {
            String parentID = windowList.get(0); // get the parent window handle
            String childID = windowList.get(1); // get the child window handle

            //switch to the child window
            driver.switchTo().window(childID);

            System.out.println(driver.getTitle());
        } else {
            System.out.println("No child window found");
        }

        driver.switchTo().window(windowList.get(0)); // switch back to the parent window
        System.out.println(driver.getTitle());
        */

        // Approach 2 - multiple windows
        for (String id : windowIDs) {
            driver.switchTo().window(id);
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
        }
    }

}
