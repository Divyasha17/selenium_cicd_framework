import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/Login.aspx");
		WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
		userName.sendKeys("Tester");
		passWord.sendKeys("test");
		WebElement login = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
		login.click();
		Thread.sleep(10000);
		WebElement order = driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a"));
		order.click();
		Thread.sleep(10000);
		//6.dropdown select
		WebElement dropdownProduct =driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']"));
		//Thread.sleep(10000);
		//dropdownProduct.click();
		dropdownProduct.sendKeys("ScreenSaver");
		//7.to print the dropdown value in console
		List<WebElement> value=dropdownProduct.findElements(By.tagName("option"));
		for(int i=0;i<=value.size();i++)
		{
			System.out.println("option value:"+value.get(i).getText());
		}
		//Thread.sleep(10000);
	}

	
	
	}


