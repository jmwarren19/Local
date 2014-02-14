import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AskTest {

    @Test
    public void shouldAskGoogleForWebDriver() {
        WebDriver browser = new FirefoxDriver();
        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);

        browser.get("http://bing.com/");

        WebElement inputField = browser.findElement(By.id("sb_form_q"));
        inputField.sendKeys("WebDriver");

        WebElement searchButton = browser.findElement(By.id("sb_form_go"));
        searchButton.click();

        browser.close();
    }
}