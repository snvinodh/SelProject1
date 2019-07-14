package libraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import cucumber.api.testng.AbstractTestNGCucumberTests;

public class Annotations{
	
	public String excelFileName;
	public static ChromeDriver driver;
	@Parameters({"url", "username", "password"})
	@BeforeMethod
	public void login(String url, String uName, String pwd) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		return ReadExcel.readExcelData(excelFileName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
