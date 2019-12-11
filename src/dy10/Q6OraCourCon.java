package dy10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q6OraCourCon {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIPRO\\eclipse-workspace\\SeleniumGt\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		Actions acc=new Actions(driver);
		WebElement e2=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		acc.contextClick(e2).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String mw=driver.getWindowHandle();
		Set<String> alw=driver.getWindowHandles();
		for(String s:alw) {
			if(!mw.equals(s)) {
				driver.switchTo().window(s);
			}
		}
		
		WebElement e1=driver.findElement(By.xpath("(//a[text()='Courses '])[1]"));
		acc.doubleClick(e1).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Course Content'])[1]")).click();
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File s=ts1.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File d=new File("C:\\Users\\WIPRO\\eclipse-workspace\\SeleniumGt\\pics\\orlce.png");
		FileUtils.copyFile(s, d);
		

	}

}
