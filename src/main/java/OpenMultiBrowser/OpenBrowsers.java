package OpenMultiBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class OpenBrowsers {
WebDriver driver;
	
	@Test
	public void launch_chrome() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void launch_gecko() {
		System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		String expected=driver.getTitle();
		if(expected.equals("gecko")) {
			System.out.println("successful");
		}else {
			System.out.println("failure");}
		}
		@Test
		public void LaunchEdge() {
			
			System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			driver.getTitle();
		}
		
		//@Test
		public void launch_IE() {
			System.setProperty("webdriver.ie.driver", "");
			driver=new InternetExplorerDriver();
			driver.get("https://www.google.com/");
			driver.manage().window();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			driver.getTitle();
		}
		@AfterClass
		public void tearDown() {
			if(driver!=null) {
				System.out.println("Closing IE browser");
				driver.quit();
			}
	}}
	

	
		
	

	
		
	

	
		
	

	
		
		
	
	
	
	