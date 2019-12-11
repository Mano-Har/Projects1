package dy5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q3Fpk {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 Actions ca=new Actions(driver); 
		WebElement s=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		ca.click();
        WebElement s2=driver.findElement(By.xpath("//li[@class='Wbt_B2 _1YVU3_'][6]"));
        ca.moveToElement(s2).perform();
        WebElement s3=driver.findElement(By.xpath("//a[@title='Chairs']"));
        ca.doubleClick(s3).perform();
        WebElement s4=driver.findElement(By.xpath("//a[@title='Onlineshoppee Sheesham Wood Solid Wood 1 Seater Rocking Chairs']"));
      
        ca.doubleClick(s4).perform();
        WebElement s5=driver.findElement(By.xpath(" //button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
        ca.doubleClick(s5).perform();
        
        
     
	}

}
