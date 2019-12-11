package dy9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q3contoolqa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement conopt=driver.findElement(By.id("continents"));
		Select s1= new Select(conopt);
		List<WebElement> liw=s1.getOptions();
		for(int i=0;i<liw.size();i++) {
			WebElement e=liw.get(i);
			String tx=e.getText();
			System.out.println(tx);
			
		}
	}

}
