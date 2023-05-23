import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/larryallen/QA/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        //Define a new webElement for the first radio button
        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click(); //click the 1st radio button
        //Define a new webElement for the second radio button. Since it does not have an id we will use
        //By.cssSelector and use the input and value for the second radio button.
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        //Define a new webElement for the third radio button. For this example we are going to use Xpath.
        //To get the xpathExpression first inspect the element then right click on the element in the inspector
        //in the copy option you will have several options to copy. Use copy Xpath and past that as the parameter.
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();

        driver.quit();
    }
}
