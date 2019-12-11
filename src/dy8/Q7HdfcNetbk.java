package dy8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7HdfcNetbk {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIPRO\\eclipse-workspace\\SeleniumGt\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement e1=driver.findElement(By.name("login_page"));
		driver.switchTo().frame(e1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='pwd_field']")).sendKeys("1102233");
		driver.findElement(By.xpath("(//td[@valign='bottom'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("HAiGreens1");
		driver.findElement(By.xpath("//img[@alt='Login']")).click();
		
			}

}
