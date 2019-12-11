package dy8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5Sprint {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\eclipse-workspace\\SeleniumGt\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		driver.findElement(By.xpath("//p[text()='Sign In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

}
