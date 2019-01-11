import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenralErrorMsg {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Work\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://www.aaalife.com/term-life-insurance-quote-input");
//Open Chrome browser with test URL

driver.manage().window().maximize();
//Maximize the window screen

driver.findElement(By.id("seeQuote")).click();
// Click See You Quote button

String text = "Please complete/correct the required fields";
//General Error message if information is not filled

boolean expected_error = driver.getPageSource().contains(text);
System.out.println(expected_error);

if(expected_error=true) {
    System.out.println("Test Case Passed");
}else{
    System.out.println("Test Case Failed"); 
        driver.close();
}
}
}