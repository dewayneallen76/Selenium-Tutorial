import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/larryallen/QA/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        //This tests dragging and dropping an item to a different id
        //We have an image that will be dragged and placed into the element box
        WebElement image = driver.findElement(By.id("image"));

        WebElement box = driver.findElement(By.id("box"));
        //Build a new Actions object that takes the driver as a parameter
        Actions actions = new Actions(driver);
        //Using the new actions object we can all dragAndDrop which takes two parameters
        //in this example we are dragging image to box. Then we want to build the action and perform
        //the action.
        actions.dragAndDrop(image, box).build().perform();

        Thread.sleep(3000);


        driver.quit();
    }
}
