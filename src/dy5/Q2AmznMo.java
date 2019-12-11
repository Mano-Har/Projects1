package dy5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2AmznMo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://www.amazon.in");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.xpath("//span[@class='nav-a-content']"));
        Actions ca=new Actions(driver);
        ca.moveToElement(s).perform();
	}

}
