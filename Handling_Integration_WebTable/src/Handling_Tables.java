import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/Login.aspx");
		WebElement userName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
		WebElement passWord=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
		userName.sendKeys("Tester");
		passWord.sendKeys("test");
		WebElement login=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
		login.click();
		Thread.sleep(3000);
		WebElement oneCellData= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[2]"));
	    //System.out.println(oneCellData.getText());
	    String leftBoundary2 ="//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[";
	    	String rightBoundary2="]/td[2]";
	    	
	    	for(int i=2;i<=9;i++)
	    	{
	    		 String datas=driver.findElement(By.xpath(leftBoundary2+i+rightBoundary2)).getText();
	    		 System.out.println("Datas:"+datas);
	    	}
	    	
		String leftBoundary1 ="//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[";
		String rightBoundary1="]";
	    for(int i=2;i<=12;i++)
	    {
	     String datas=driver.findElement(By.xpath(leftBoundary1+i+rightBoundary1)).getText();
   		 System.out.println("Datas:"+datas);
	    }
		//static webtable 
		
		 String xpathleftboundary ="//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[";
		 String	xpathMidBoundary ="]/td[";
         String	xpathRightBoundary="]";
         
         for(int i=2;i<=9;i++)
         {
        	    for(int j=1;j<=12;j++)
        	    {
        	    	String datas= driver.findElement(By.xpath(xpathleftboundary+i+xpathMidBoundary+j+xpathRightBoundary)).getText();
        	    	System.out.print(datas+"---");
        	    }
        	    System.out.println();
        	    
         }
		
	}
	}


