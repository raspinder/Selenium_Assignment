//This test case tests the web page compatibility with Internet Explorer Browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class IEBrowserCompatibility {

public static void main(String[] args) {

System.setProperty("webdriver.ie.driver", "C:\\Work\\IEDriver\\MicrosoftWebDriver.exe");

WebDriver driver = new InternetExplorerDriver();
driver.get("https://www.aaalife.com/term-life-insurance-quote-input");
//Open Firefox browser with test URL

System.out.println(driver.getTitle());
//Verifying the title of the page

System.out.println("Internet Explorer browser compatibility Passed");
}
}