package dy10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1azmn {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphonesx");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("//span[text()='Apple iPhone Xs (64GB) - Gold']")).click();
		String par=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		System.out.println(par);
		System.out.println(all);
		for(String x:all) {
			if(!par.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	//	driver.findElement(By.xpath("//span[@id='hlb-ptc-btn']")).click();
		  Thread.sleep(5000);
		  WebElement e1=driver.findElement(By.xpath("(//div[@class='a-row a-spacing-micro'])[1]"));
		  String amt=e1.getText();
			System.out.println(amt);
		
		
		

	}  

}
