package launchingDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchingSafari {

	public static void main(String[] args) {

		System.setProperty("webdriver.safari.driver", "//Applications//safaridriver");
		WebDriver driver = new SafariDriver();
		driver.get("http://www.google.com/");
		
	}

}
