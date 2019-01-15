import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Work\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://www.aaalife.com/term-life-insurance-quote-input");
//Open Chrome browser with test URL

Select gender = new Select(driver.findElement(By.id("gender")));
gender.selectByIndex(1);
//Select gender = "Male"

Select DOB = new Select(driver.findElement(By.id("month")));
DOB.selectByIndex(10);
//Select month = "Oct"

Select dat = new Select(driver.findElement(By.id("day")));
dat.selectByIndex(2);
//Select day/date = "2nd"

Select year = new Select(driver.findElement(By.id("year")));
year.selectByIndex(17);
//Select year = "1990"

Select feet = new Select(driver.findElement(By.id("feet")));
feet.selectByIndex(1);
//Select Height = "4 feet"

Select Inches = new Select(driver.findElement(By.id("inches")));
Inches.selectByIndex(4);
//Select Inches value = "3"

driver.findElement(By.id("isMemberYes")).click();
//Are you AAA member = "Yes"

driver.findElement(By.xpath("//*[@id=\"contact_email\"]")).sendKeys("ras@gmail.com");
//Enter email address = "ras@gmail.com"

driver.findElement(By.xpath("//*[@id=\"weight\"]")).sendKeys("130");
//Enter weight in lbs = "130"

Select CoverageAmount = new Select(driver.findElement(By.id("coverageAmount")));
CoverageAmount.selectByIndex(5);
//Enter Coverage Amount = "300,000"

Select TermLength = new Select(driver.findElement(By.id("termLength")));
TermLength.selectByIndex(1);
//Enter Term Length = "10 Years"

driver.findElement(By.id("nicotineUseYes")).click();
//Used Nicotine = "Yes"

driver.findElement(By.id("seeQuote")).click();
// Click See You Quote button
}

}