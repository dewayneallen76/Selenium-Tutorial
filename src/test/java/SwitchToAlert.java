import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/larryallen/QA/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        //This test is for an action that opens an alert or modal that has an action that needs to
        //be performed to close it. You can see example by navigating to the website above and
        //clicking on the Open Alert button.
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        //This uses the Alert class from webdriver. You will need to make sure that it is imported
        //if it is not imported automatically. import org.openqa.selenium.Alert;
        //Here we are switching to the alert and accepting the alert. In this case there is only
        //one button on the alert that can be accepted.
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }
}
