package dy10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q4GrnsOmrAdr {

	public static void main(String[] args) throws AWTException, Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e1).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String par=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		System.out.println(par);
		System.out.println(all);
		for(String x:all) {
			if(!par.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		
		Thread.sleep(4000);
		 WebElement e2=driver.findElement(By.xpath("(//div[@class='address-block address-border'])[6]"));
		 String txt=e2.getText();
		 System.out.println(txt);
	}

} 
