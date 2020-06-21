package tests;

import testSettings.BrowserSettings;
import testSettings.BrowserSettings.BrowserName;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class InitialTest {

  @Test
  public void openURL() {
    final WebDriver webDriver = BrowserSettings.setDriver(BrowserName.CHROME);
    webDriver.get("https://octopus.com");
    webDriver.quit();
  }
}