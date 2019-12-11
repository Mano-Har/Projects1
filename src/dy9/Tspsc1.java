package dy9;




	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Tspsc1 {
	             public static void main(String[] args) {
	            	 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32v78\\chromedriver.exe" );
	         		WebDriver driver=new ChromeDriver();
	         		driver.get("https://tspsc.gov.in/TSPSCOTR2015/oneTimeRegistration.tspsc");
	         		driver.findElement(By.id("candidateName")).sendKeys("Mano S");
	         		WebElement e1=driver.findElement(By.xpath("//input[@value='M']"));
	         		         		e1.click();
	         		         		boolean status=e1.isSelected();
	         		         		System.out.println(status);    
	         		WebElement w1=driver.findElement(By.id("dob"));
	         		w1.sendKeys("12/12/92");
	         		w1.sendKeys(Keys.ENTER);
	         		WebElement w2= driver.findElement(By.name("dyna(nativeDistrict)"));
	         	    Select s1=new Select(w2);
	         	    s1.selectByIndex(2);
	         		List<WebElement> l1=s1.getOptions();
	         		System.out.println(l1.size());
	         		System.out.println(l1.get(l1.size()-1).getText());
	         		WebElement w3= driver.findElement(By.name("dyna(nativeMandal)"));
	         		Select s2=new Select(w3);
	         		s2.selectByIndex(4);
	         		List<WebElement> l2=s2.getOptions();
	         		System.out.println(l2.size());
	         		System.out.println(l2.get(l2.size()-1).getText());
	         		WebElement w5=driver.findElement(By.id("community"));
	         		Select s3=new Select(w5);
	         		s3.selectByVisibleText("BC-C");
	         		List<WebElement> l3=s3.getOptions();
	         		System.out.println(l3.size());
	         		WebElement w4=driver.findElement(By.xpath("//input[@value='N'][@title='Select Differently Abled Person']"));
	         		w4.click();
	         		driver.findElement(By.xpath("//input[@value='N'][@onclick='validatePhDetails();']")).click();   
	         		
	         		
	         		
	         	
	         		
	         		
	         		
	         		
	             }
	}


