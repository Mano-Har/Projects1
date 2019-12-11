package otherprms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactindrapdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\"
				+ "chromedriver_win32v78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ManoharSettu");
		driver.findElement(By.id("password")).sendKeys("greens123");
		WebElement e=driver.findElement(By.id("login"));
		e.click();
	    Thread.sleep(3000);
	     WebElement area=driver.findElement(By.id("location"));
	    Select s=new Select(area);
	    s.selectByValue("London");
	    WebElement hotel=driver.findElement(By.id("hotels"));
	    Select s1=new Select(hotel);
	    s1.selectByVisibleText("Hotel Creek");
	    WebElement room=driver.findElement(By.id("room_type"));
	    Select s2=new Select(room);
	    s2.selectByVisibleText("Double");
	    WebElement nofrooms=driver.findElement(By.id("room_nos"));
	    Select s3=new Select(nofrooms);
	    s3.selectByIndex(3);
	    WebElement childperroom=driver.findElement(By.id("child_room"));
	    Select s4=new Select(childperroom);
	    s4.selectByIndex(2);
	    WebElement search=driver.findElement(By.id("Submit"));
	    search.click();
	    WebElement btn=driver.findElement(By.id("radiobutton_0"));
	    btn.click();
	    WebElement con=driver.findElement(By.id("continue"));
	    con.click();
	     driver.findElement(By.id("first_name")).sendKeys("mano");
	     driver.findElement(By.id("last_name")).sendKeys("S");
	     driver.findElement(By.id("address")).sendKeys("chennai");
	     driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
	    WebElement cardtype=driver.findElement(By.id("cc_type"));
		    Select s5=new Select(cardtype);
		    s5.selectByVisibleText("VISA");
		    WebElement cdm=driver.findElement(By.id("cc_exp_month"));
		    Select s6=new Select(cdm);
		    s6.selectByValue("5"); 
		    WebElement cdy=driver.findElement(By.id("cc_exp_year"));
		    Select s7=new Select(cdy);
		    s7.selectByValue("2019");   
		    driver.findElement(By.id("cc_cvv")).sendKeys("321");    
		    driver.findElement(By.id("book_now")).click();
		    
		    
		    Thread.sleep(15000);
		 WebElement ord=driver.findElement(By.id("order_no"));
		 String oid=ord.getAttribute("value");
		 System.out.println(oid);

		    
		 
		    
		    
		    
		    

	    
	    
		    
	   
	   

	}

}
