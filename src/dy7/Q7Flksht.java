package dy7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q7Flksht {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 Actions ca=new Actions(driver); 
		WebElement s=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		s.click();
		WebElement d1=driver.findElement(By.xpath("//input[@name='q']"));
		d1.sendKeys("iphones");
		WebElement d2=driver.findElement(By.xpath("//button[@type='submit']"));
		d2.click();
		int tf=driver.findElements(By.tagName("iframes")).size();
		System.out.println(tf);
		//WebElement d3=driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 7 Plus (Black, 32 GB)')]\r\n" + 
		//		""));
		//d3.click();
		//ca.doubleClick(d3).build().perform();


	}

}//div[text()='Apple iPhone 7 Plus (Black, 32 GB)']
//div[contains(text(),'Apple iPhone 7 Plus (Black, 32 GB)')]
