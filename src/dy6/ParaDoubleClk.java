package dy6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ParaDoubleClk {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement sign=driver.findElement(By.xpath("//h1[contains(text(),'Selenium Training in Chennai')]"));
		Actions ans=new Actions(driver);
		ans.doubleClick(sign).build().perform();
		ans.click();

	}

}
