package dy5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q4Getty {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("  https://www.gettyimages.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement ea=driver.findElement(By.xpath("(//li[@class='landing-top-menu__item'])[2]"));
          Actions sd=new Actions(driver);
          
          sd.doubleClick(ea).perform();
          Thread.sleep(3000);
          WebElement e2=driver.findElement(By.xpath("//li[@class='landing-secondary-menu__item'][4]"));
         
          sd.doubleClick(e2).perform();
	}

}
