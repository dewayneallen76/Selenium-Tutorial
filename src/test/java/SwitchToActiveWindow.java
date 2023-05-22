import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/larryallen/QA/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        //When an action on the new webpage opens a new tab.
        //Find the id of the button that is opening the new tab and click the button
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle();
        //This for loop will focus on switching to the second tab that's open
        for(String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        //Here we are switch back to the original window.
        driver.switchTo().window(originalHandle);

        driver.quit();
    }
}
