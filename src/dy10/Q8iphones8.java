package dy10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q8iphones8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIPRO\\eclipse-workspace\\SeleniumGt\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.amazon.com/");
		Actions acc=new Actions(driver);
		WebElement e2=driver.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys("iphones 8",Keys.ENTER);
		String parw=driver.getWindowHandle();
		Set<String> allw=driver.getWindowHandles(); 
		for(String cw:allw) {
			if(!cw.equals(cw)) {
				driver.switchTo().window(cw);
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 8 PLUS GSM Unlocked 256GB, Red (Renewed)']")).click();
		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[2]")).click();

	}

}
