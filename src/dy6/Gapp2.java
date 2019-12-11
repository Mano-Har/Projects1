package dy6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gapp2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement sign=driver.findElement(By.xpath("//a[@title='Google apps']"));
		sign.click();
		int totalifame=driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalifame);
		driver.switchTo().frame(0);
		WebElement se1=driver.findElement(By.xpath("//span[text()='YouTube']"));
		se1.click();

	}

}
