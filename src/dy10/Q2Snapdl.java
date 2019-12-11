package dy10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2Snapdl {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.snapdeal.com/ \r\n" + 
				"");
		driver.manage().window().maximize();
		//driver.findElement(By.id("//input[@placeholder='Enter your pincode']")).sendKeys("600053");
		//driver.findElement(By.xpath("//button[text()='Check']")).click();
		WebElement e=driver.findElement(By.id("inputValEnter"));
		e.sendKeys("iphones 7  Mobiles");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		
		driver.findElement(By.xpath("//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black'][1]")).click();
		String par=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		System.out.println(par);
		System.out.println(all);
		for(String x:all) {
			if(!par.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();
		Thread.sleep(5000);
		WebElement e2=driver.findElement(By.xpath("//div[contains(text(),'You Pay: ')]"));
		String amt=e2.getText();
		System.out.println(amt);

	}
	
}
