package day28;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {
    @SneakyThrows
    public static void main(String[] args) throws MalformedURLException {
        // Navigational commands
        // 1) navigate().to() - it is used to navigate to a specific URL. it is similar to get() method but it does not wait for the page to load completely before returning control to the script.
        // 2) navigate().back() - it is used to navigate back to the previous page in the browser history.
        // 3) navigate().forward() - it is used to navigate forward to the next page in the browser history.
        // 4) navigate().refresh() - it is used to refresh the current page.

        WebDriver driver = new ChromeDriver();

        // driver.get("http://localhost:8090/shapes/editor/"); // accepts URL only in the string format

        driver.navigate().to("http://localhost:8090/shapes/editor/");
        driver.navigate().to("http://localhost:8090/shapes/editor/1");

        driver.navigate().back(); // it will navigate back to the previous page
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward(); // it will navigate forward to the next page

        driver.navigate().refresh(); // it will refresh the current page

        //URL url = new URL("http://localhost:8090/shapes/editor/");
        //driver.navigate().to(url); // accepts URL in the object format
    }
}
