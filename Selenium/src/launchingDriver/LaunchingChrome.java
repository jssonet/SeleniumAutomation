package launchingDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChrome {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "//Users//abdulmomin//Documents//driver//chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
	}

}
