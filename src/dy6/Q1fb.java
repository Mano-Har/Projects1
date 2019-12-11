package dy6;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1fb {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\"
				+ "eclipse-workspace\\SeleniumGt\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement sign=driver.findElement(By.xpath("//input[@id='email']"));
		sign.sendKeys("Mano");
		Robot r= new Robot();
		Actions ac=new Actions(driver);
		ac.doubleClick(sign);
		//ac.contextClick(sign).perform();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		//System.out.println(sign.getAttribute("value"));
		
		WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
		ac.doubleClick(pwd);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		System.out.println(pwd.getAttribute("value"));

	}

}
