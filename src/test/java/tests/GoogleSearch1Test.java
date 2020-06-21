package tests;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import testSettings.BrowserSettings;
import testSettings.BrowserSettings.BrowserName;

public class GoogleSearch1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = BrowserSettings.setDriver(BrowserName.CHROME);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void googleSearch1() {
    // Test name: Google Search 1
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.google.com/");
    // 2 | setWindowSize | 1283x738 | 
    driver.manage().window().setSize(new Dimension(1283, 738));
    // 3 | click | name=q | 
    driver.findElement(By.name("q")).click();
    // 4 | type | name=q | civilization 6
    driver.findElement(By.name("q")).sendKeys("civilization 6");
    // 5 | sendKeys | name=q | ${KEY_ENTER}
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
}