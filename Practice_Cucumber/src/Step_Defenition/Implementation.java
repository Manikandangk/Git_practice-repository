package Step_Defenition;

import java.io.FileInputStream;
import java.sql.Driver;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation {
	
	WebDriver driver;
	 Properties pr;
	
	@Given("^User Launch the Chrome Browser$")
	public void user_Launch_the_Chrome_Browser() throws Throwable {
		
		FileInputStream fis_op=new FileInputStream("E:\\automation\\Javafile2\\Practice_Cucumber\\ObjectRepository.properties");
		
		  pr= new Properties();
		  pr.load(fis_op);
		  
		  
		 
		
		
		System.setProperty("webdriver.chrome.driver","E:\\libraries\\Chrome driver\\chromedriver.exe");
	
		 driver =new ChromeDriver();
		
		
	}

	@When("^User Enter the Url$")
	public void user_Enter_the_Url() throws Throwable {
	   
		driver.get(pr.getProperty("Browser_Url"));
		
	}


	
	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
		
	WebElement username =driver.findElement(By.xpath(pr.getProperty("UsernamePath")));
	 username.sendKeys("Tester");
	
	 WebElement password =driver.findElement(By.xpath(pr.getProperty("Passpath")));
	 password.sendKeys("test");
	 
	}

	
	
	@When("^Click on the Login$")
	public void click_on_the_Login() throws Throwable {
		
	WebElement Loginbutton =	driver.findElement(By.xpath(pr.getProperty("Clickpath")));
	Loginbutton.click(); 
	
	}

	
	@Then("^Verify the Login$")
	public void verify_the_Login() throws Throwable {
	   
	WebElement order =driver.findElement(By.xpath(pr.getProperty("Verifypath")));
		if (order.isDisplayed())
		{
			System.out.println("Login is success");
		}
		else
		{
			System.out.println("Login is Fail");
		}
	
	
	}


@When("^User enter the Order button$")
public void user_enter_the_Order_button() throws Throwable {

WebElement orderclick=driver.findElement(By.xpath(pr.getProperty("Orderclickpath")));
orderclick.click();
	
}

@When("^Enter the product and Quality information$")
public void enter_the_product_and_Quality_information() throws Throwable {
    WebElement product = driver.findElement(By.id(pr.getProperty("Productpath")));
    product.sendKeys("FamilyAlbum");
	
    WebElement Quantity = driver.findElement(By.name(pr.getProperty("Quantitypath")));
    Quantity.sendKeys("3");
}

@When("^Enter the price,Discout and total$")
public void enter_the_price_Discout_and_total() throws Throwable {
  
	WebElement price = driver.findElement(By.xpath(pr.getProperty("pricepath")));
    price.sendKeys("80");
	
    WebElement discount = driver.findElement(By.xpath(pr.getProperty("discountpath")));
    discount.sendKeys("10");
	
}

@When("^Enter the Address Information$")
public void enter_the_Address_Information() throws Throwable {
    
	WebElement name = driver.findElement(By.cssSelector(pr.getProperty("namepath")));
	name.sendKeys("Manikandan");
	
    WebElement street = driver.findElement(By.cssSelector(pr.getProperty("streetpath")));
    street.sendKeys("Voc");
	
	WebElement city = driver.findElement(By.xpath(pr.getProperty("citypath")));
	city.sendKeys("Tindivanam");
	
    WebElement state = driver.findElement(By.name(pr.getProperty("statepath")));
    state.sendKeys("Tamilnadu");
  
    WebElement pincode = driver.findElement(By.xpath(pr.getProperty("pincodepath")));
    pincode.sendKeys("604001");
	
}

@When("^Enter the Payment Information$")
public void enter_the_Payment_Information() throws Throwable {

	
	WebElement card=driver.findElement(By.xpath(pr.getProperty("cardpath")));
	card.click();

	WebElement cardNO=driver.findElement(By.xpath(pr.getProperty("cardnopath")));
	cardNO.sendKeys("5647382910");
	
	WebElement date=driver.findElement(By.xpath(pr.getProperty("datepath")));
	date.sendKeys("02/21");
	
}

@When("^Click on the Process$")
public void click_on_the_Process() throws Throwable {
	
	WebElement processClick= driver.findElement(By.className(pr.getProperty("processclickpath")));
	processClick.click();
	
	
	}

@Then("^Verify the process$")
public void verify_the_process() throws Throwable {
   
	WebElement verifyprocess= driver.findElement(By.xpath(pr.getProperty("verifyprocesspath")));
	
	if (verifyprocess.isDisplayed())
	{
		System.out.println("process is succes");
	}
	
	else
	{
		System.out.println("process is failed");
	}
}
	
//--------------------------------------------------------------------------------------------------------------------

//Module 1 programs (for my personal referance)
//*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[2]
//*[@id="ctl00_MainContent_orderGrid"]/tbody/tr[3]



@When("^Enter the url \"([^\"]*)\"$")
public void enter_the_url(String URL) throws Throwable {
	driver.get(URL);
   
}

@When("^Enter the username \"([^\"]*)\"$")
public void enter_the_username(String user) throws Throwable {
    
	WebElement username =driver.findElement(By.xpath(pr.getProperty("UsernamePath")));
	 username.sendKeys(user);
	
	
}

@When("^Enter the password \"([^\"]*)\"$")
public void enter_the_password(String pass) throws Throwable {
    
	 WebElement password =driver.findElement(By.xpath(pr.getProperty("Passpath")));
	 password.sendKeys(pass);
	 
}

@When("^get the data from the webtable$")
public void get_the_data_from_the_webtable() throws Throwable {
  
	 WebElement webtable =driver.findElement(By.xpath(pr.getProperty("webtable")));
	String Detail= webtable.getText();
	System.out.print(Detail);
 	
}

//--------------------------------------------------------------------------------------------------------------------
//Module 2 program

@When("^Enter the url$")
public void enter_the_url(DataTable Data1) throws Throwable {

	List<List<String>> link=Data1.raw();
	
	driver.get(link.get(0).get(0));

}

@When("^Enter the username and password$")
public void enter_the_username_and_password(DataTable Data2) throws Throwable {
	
	List<List<String>> Datatable=Data2.raw();
 
	WebElement username =driver.findElement(By.xpath(pr.getProperty("UsernamePath")));
	 username.sendKeys(Datatable.get(0).get(0));
	
	 WebElement password =driver.findElement(By.xpath(pr.getProperty("Passpath")));
	 password.sendKeys(Datatable.get(0).get(1));
}

}
