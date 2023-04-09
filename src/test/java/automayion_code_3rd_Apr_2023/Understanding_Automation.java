package automayion_code_3rd_Apr_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_Automation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		
		driver.get("https://rediff.com");
		
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualTitle = driver.getTitle();
		
		String expectedCurrentUrl = "https://www.rediff.com/";
		String actualCurrentUrl = driver.getCurrentUrl();
		
		if(expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
			
			System.out.println("My url is correct");
			
		}else {
			System.out.println("The url entered is incorrect");
		}
		
		WebElement signInLink = driver.findElement(By.linkText("Sign in"));
		WebElement rediffLogoImage = driver.findElement(By.cssSelector("span.hmsprite.logo"));
		
		if(rediffLogoImage.isDisplayed() && signInLink.isEnabled()) {
			System.out.println("My Webpage is correct");
		}else {
			System.out.println("My Webpage is incorrect");
		}
		
		driver.findElement(By.linkText("Sign in")).click();
		WebElement checkBox = driver.findElement(By.id("remember"));
		
		System.out.println(checkBox.isSelected());
		
		if(checkBox.isSelected()) {
			System.out.println("My Logic is correct");
		}else {
			System.out.println("My logic is incorrect");
		}
				
				
	}

}
