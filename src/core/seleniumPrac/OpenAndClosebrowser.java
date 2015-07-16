package core.seleniumPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenAndClosebrowser {

	WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void OpenBrowser(String browser, String URL)

	{

		if (browser.equalsIgnoreCase("firefox"))

		{

			driver = new FirefoxDriver();

		}

		else if (browser.equalsIgnoreCase("Chrome"))

		{
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("IE"))

		{

			driver = new InternetExplorerDriver();

		}

		else {
			driver = new FirefoxDriver();
		}

		driver.get(URL);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void closeBrowser()

	{

		driver.quit();

	}
	
	
	/*@Test
	public void test() {
		System.out.println("Check");
	}*/

}
