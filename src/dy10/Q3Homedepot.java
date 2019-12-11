package dy10;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3Homedepot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("headerSearch")).sendKeys("Celling fan");
		driver.findElement(By.id("headerSearchButton")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='Glendale 42 in. LED Indoor Oil-Rubbed Bronze Ceiling Fan with Light Kit']")).click();
		Thread.sleep(5000);
		String mw=driver.getWindowHandle();
		Set<String> cm=driver.getWindowHandles();
		for(String y:cm) {
			if(!mw.equals(y)) {
				driver.switchTo().window(y);
			}
		}
		driver.findElement(By.xpath("//button[@id='atc_shipIt']")).click();
		Thread.sleep(6000);
		List<WebElement> e1=driver.findElements(By.tagName("iframe"));
		System.out.println(e1.size());
		WebElement e2=driver.findElement(By.xpath("//iframe[@class='thd-overlay-frame']"));
		driver.switchTo().frame(e2);
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//div[@data-automation-id='cartTotalPrice']"));
		String amount=w1.getText();
		System.out.println(amount);
			
	}

}//(//span[@class='product-pod__title__product--text'])[3]
