import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Git_Jenkins_Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\libraries\\Chrome driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx\r\n");
		
		
		WebElement username =driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
		 username.sendKeys("Tester");
		
		 WebElement password =driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
		 password.sendKeys("test");

		WebElement Loginbutton =driver.findElement(By.xpath("//input[@class='button']"));
		Loginbutton.click(); 
	}

}
