package dy5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement d=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement s3=driver.findElement(By.xpath("//li[@id='fourth']"));
		WebElement d3=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement s1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement d1=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		WebElement s2=driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement d2=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		for(int i=0;i<=8;i++) {
		driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
		}
		Actions ac=new Actions(driver);
		Thread.sleep(3000);
		ac.dragAndDrop(s,d).perform();
		ac.dragAndDrop(s1,d1).perform();
		ac.dragAndDrop(s2,d2).perform();
		ac.dragAndDrop(s3,d3).perform();

	}
	
}
