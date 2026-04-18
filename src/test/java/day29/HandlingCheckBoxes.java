package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class HandlingCheckBoxes {

    /*
           Handling checkboxes
           ------------------
           1) isSelected() - it is used to check whether the checkbox is selected or not. it returns a boolean value.
           2) click() - it is used to select or deselect the checkbox. if the checkbox is not selected then it will select it and if the checkbox is already selected then it will deselect it.
       */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8090/shapes/editor/");
        driver.manage().window().maximize();

            /*
            1) select specific check box
            driver.findElement(By.xpath("//input[@id='sunday']")).click();

            2) select all the checkboxes
            List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

            for(int i = 0; i < checkboxes.size(); i++) {
                checkboxes.get(i).click();
             */

//            for (WebElement checkbox : checkboxes ){
//                checkbox.click();
//            }

            /*
            3) select last 3 checkboxes
            total no of checkboxes-how many checkboxes want to select = starting index
            7-3=4
            for (int i = 4; i < checkboxes.size(); i++) {
                checkboxes.get(i).click();
                }
             */

        // 4) select first 3 checkboxes
//            for (int i = 0; i < 3; i++) {
//                checkboxes.get(i).click();
//            }

        //5) unselect all the checkboxes
//            for (WebElement checkbox : checkboxes) {
//                if (checkbox.isSelected()) {
//                    checkbox.click();
//                }



    }
}
