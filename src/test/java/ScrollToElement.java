import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void  main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/larryallen/QA/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        //This test is for a form that may have an element that you would need to fill out at the
        // bottom of page. Example: A form that needs a signature at the bottom of page content.
        //This uses the selenium Actions class that will need to be imported if it is not automatically
        WebElement name = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver); //New Actions using the Actions class
        actions.moveToElement(name); //Moving to the element that contains the name id
        name.sendKeys("Larry Allen");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("05/22/23");

        driver.quit();
    }
}
