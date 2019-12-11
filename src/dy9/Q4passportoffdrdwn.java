package dy9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q4passportoffdrdwn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		driver.manage().window().maximize();
		WebElement pspto=driver.findElement(By.id("dcdrLocation"));
		Select s=new Select(pspto);
		List<WebElement> ops=s.getOptions();
		int count=ops.size();
		System.out.println(count);
		for(int i=0;i<ops.size();i++) {
			WebElement w1=ops.get(i);
			if(i%2==0) {
			String txt=w1.getText();
			System.out.println(txt);
			}
		
		}

	}

}
