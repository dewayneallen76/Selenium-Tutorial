import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExecuteJavascript {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/larryallen/QA/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");
        //Selenium supports JavascriptExecutor. Javascript Executor provides two methods to run
        //Javascript on the selected window or current page.
        //executeAsyncScript = executes and asynchronous piece of Javascript. Scripts executed with
        //this method must explicitly signal they are finished by invoking the provided callback.
        //executeScript = executes Javascript as the body of an asynchronous function.
        //There are a few cases for using Javascript Executor:
        //When WebDriver fails to click on any element due to some issue.
        //It can also generate alerts and run other scripts to trigger actions on a page.
        //It can manipulate the page and perform actions like scrolling and zooming.

        //In this example we will be using it to click on an element within a modal that WebDriver
        //otherwise fails to find.
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));
        //JavascriptExecutor is a WebDriver class that will need to be imported.
        //Create an object using the Javascript Executor class.

        //So, this completes the test, and what will happen now is that the modal button will be clicked.
        // Once the modal is open, the JavascriptExecutor will execute a simple script to press the close button,
        // and then the driver will quit.
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);

        driver.quit();
    }
}
