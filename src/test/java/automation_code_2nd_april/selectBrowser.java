package automation_code_2nd_april;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selectBrowser {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://amazon.com");
		
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://walmart.com");
			
		}else {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("http://rediff.com");
		}
	
			
	}

}
