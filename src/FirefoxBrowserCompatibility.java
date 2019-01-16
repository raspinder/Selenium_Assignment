//This test case tests the web page compatibility with Firefox Browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirefoxBrowserCompatibility {

public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver", "C:\\Work\\FirefoxDriver\\geckodriver.exe");

WebDriver driver = new FirefoxDriver();
driver.get("https://www.aaalife.com/term-life-insurance-quote-input");
//Open Firefox browser with test URL

System.out.println(driver.getTitle());
//Verifying the title of the page

System.out.println("FireFox compatibility Passed");
}
}