package dy7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1snst {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File s=ts.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\WIPRO\\eclipse-workspace\\SeleniumGt\\pics.png");
		FileUtils.copyFile(s,d);

	}

}
