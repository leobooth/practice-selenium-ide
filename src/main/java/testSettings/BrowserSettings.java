package testSettings;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSettings {

  public enum BrowserName {
    CHROME,EDGE,FIREFOX
  }

  public static WebDriver setDriver(BrowserName browserName) {
    switch (browserName) {
      case CHROME: {
        String chromeDriverPath = "D:\\SideProjects\\SeleniumPractice\\libraries\\ChromeDriver\\v83.0.4103.39\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        return new ChromeDriver();
      }
      default: {
        throw new InvalidArgumentException("Invalid browser name provided to getDriver()");
      }
    }
  }
}
