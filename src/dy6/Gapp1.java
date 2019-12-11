package dy6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gapp1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\"
				+ "eclipse-workspace\\SeleniumGt\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement sign=driver.findElement(By.xpath("//a[@title='Google apps']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(sign).build().perform();
		acc.doubleClick(sign).build().perform();
		

	}

}
