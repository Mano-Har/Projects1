package dy8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3CanaraBnk {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIPRO\\eclipse-workspace\\SeleniumGt\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.switchTo().alert().accept();

	}

}
