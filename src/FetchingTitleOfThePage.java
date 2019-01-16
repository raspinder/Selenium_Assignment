import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchingTitleOfThePage {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Work\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://www.aaalife.com/term-life-insurance-quote-input");
//Open Chrome browser with test URL

System.out.println(driver.getTitle());
//Verifying the title of the page
}
}