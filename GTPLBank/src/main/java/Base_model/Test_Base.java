package Base_model;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Test_Base {

	public static WebDriver Driver;
	
	@BeforeSuite
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Driver.get("http://demo.guru99.com/V1/index.php");
	}
	
	
	@AfterSuite
	public void Ending () throws InterruptedException {
		Thread.sleep(3000);
		Test_Base.Driver.quit();
	}
	
}