package dy5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sprint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		WebElement e1=driver.findElement(By.xpath("(//a[@class='sprint-menu__root-link'])[4]"));
		Actions as=new Actions(driver);
		as.moveToElement(e1).perform();

	}

}
