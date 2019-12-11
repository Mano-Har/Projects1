package dy7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class q7htc {

	public static void main(String[] args) throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement w=driver.findElement(By.xpath("//a[text()='HTC Global Services']"));
		w.click();
		Thread.sleep(3000);
		driver.navigate().forward();
		TakesScreenshot t=(TakesScreenshot)driver;
		File s1=t.getScreenshotAs(OutputType.FILE);
		File d1=new File("C:\\Users\\WIPRO\\eclipse-workspace\\SeleniumGt\\pics2.png");
		Thread.sleep(3000);
		FileUtils.copyFile(s1, d1);

	}

}
