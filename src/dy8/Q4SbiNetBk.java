package dy8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4SbiNetBk {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIPRO\\eclipse-workspace\\SeleniumGt\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("(//div[@class='continue_btn'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='Button2']")).click();

	}

}
