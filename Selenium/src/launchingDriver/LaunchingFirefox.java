package launchingDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "//Users//abdulmomin//Documents//driver//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		System.out.println("New add in fire fox");
		

		
	}

}
