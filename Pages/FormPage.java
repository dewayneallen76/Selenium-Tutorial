import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public static void submitForm(WebDriver driver) {
        driver.findElement(By.id("first-name")).sendKeys("Larry");

        driver.findElement(By.id("last-name")).sendKeys("Allen");

        driver.findElement(By.id("job-title")).sendKeys("QA Developer");

        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='3']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("05/23/2023");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}