import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/larryallen/QA/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
//Test for a textarea that has auto complete when entering information such as an address
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//When testing autocomplete you want to enter a complete address to limit the options to make the test
//easier to write and run.
        autocomplete.sendKeys("16415 Strongbox, San Antonio, TX");
//Adding this adds a "wait" of 1 second for the dropdown to appear, and then be selected.
        Thread.sleep(1000);

//NOTE: The autocomplete is not working on the example website that is being used for testing.
//After entering the address and getting the Google maps dropdown you will need to find the class
        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit();
    }
//When running this test you will see that there is an error and the test will stop with the
//webpage that you are testing open so it can be inspected again. In this example it is because
//Google Maps can't load so it is unable to find the className specified. See example below.

//Example of the error displayed in the console:
//Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element:
//Unable to locate element: {"method":"css selector","selector":".pac\-item"}
}
