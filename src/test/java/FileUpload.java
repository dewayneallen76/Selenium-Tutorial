import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/larryallen/QA/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        //Add a file to the project that can be uploaded and use sendKeys and the logo as the parameter
        fileUploadField.sendKeys("logo.png");

        driver.quit();
    }
}
