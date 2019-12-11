package otherprms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphoneslist  {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys("iphone7",Keys.ENTER);
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		
		int count=li.size();
		System.out.println(count);
		for(WebElement x:li) {
			String text=x.getText();
			System.out.println(text);
		}
		
		

	}

}
