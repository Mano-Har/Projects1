package dy8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2hdfc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
	  List<WebElement> li=driver.findElements(By.tagName("frameset"));
	  System.out.println(li.size());
	  driver.switchTo().frame("login_page");
	   driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		driver.switchTo().alert().accept();
	}

}
