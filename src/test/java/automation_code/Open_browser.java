package automation_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_browser {
	public static WebDriver driver;

	
		public static void main(String [] args)
		{
		

		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://amazon.com");
			
		    driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://walmart.com");
			
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://costco.com");
			
	}

}
