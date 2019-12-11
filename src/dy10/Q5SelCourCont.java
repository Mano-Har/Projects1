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

public class Q5SelCourCont {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
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
		WebElement e2=driver.findElement(By.xpath("(//a[text()='Courses '])[1]"));
		ac.doubleClick(e2).build().perform();
		driver.findElement(By.xpath("(//a[text()='Course Content'])[20]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='×']")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File s=ts.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\WIPRO\\eclipse-workspace\\SeleniumGt\\pics\\selecon.png");
		Thread.sleep(3000);
		FileUtils.copyFile(s, d);
		}

}
