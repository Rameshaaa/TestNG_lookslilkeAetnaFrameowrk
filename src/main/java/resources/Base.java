package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Base extends Reporter{
		
	public WebDriver driver;
	public Properties prop;
	FileInputStream fis;
	String data;
	String browserName;
	String baseURL;
	
	
public WebDriver launchURL() throws IOException
	
	{
		
prop = new Properties();
data = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
fis = new FileInputStream(data);
prop.load(fis);
browserName = prop.getProperty("browser");
System.out.println(browserName);



if (browserName.equals("chrome")) 
	
{
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\561877\\drivers\\chromedriver.exe");
ChromeOptions options = new ChromeOptions();
//options.addArguments("headless");
options.addArguments("start-maximized");
driver =new ChromeDriver(options);
	
} 

else if(browserName.equals("IE"))
	
{
	System.setProperty("webdriver.ie.driver", "C:\\Users\\561877\\IEDriverServer.exe");  
	
	driver=new InternetExplorerDriver();	
	
} 

else if(browserName.equals("FF"))
	
{
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\561877\\geckodriver.exe");
	driver = new FirefoxDriver();
}

baseURL = prop.getProperty("url");
		driver.get(baseURL);
		return driver;
		
} 
	
public WebElement enterText(By obj, String Str1)

{
	WebElement element = null;

	try {
		
		element = driver.findElement(obj);
		element.sendKeys(Str1);
		
	} 
	
	catch (Exception  e)
	{
		Reporter.log("Webelement is not available");
		
	}
	return element;
}

public WebElement Click(By str) {
	
	WebElement element = driver.findElement(str);
	element.click();
	return element;
	
	
}

public Select SelectDDropDown(By Str, String str2)

{	
	try {
		Select s = new Select(driver.findElement(Str));
		s.selectByVisibleText(str2);
		return s;
	} 
	catch (Exception e)
	{
		Reporter.log("Nothing");
	}
	return null;
	
}

public String getText(By Str)
{
	String element = driver.findElement(Str).getText();
	return element;
	
}

public void close()

{
	driver.close();
}

public void ExplicityWait(By obj, int maxTimeout) {
	
	WebDriverWait wait = new WebDriverWait(driver, maxTimeout);
	wait.until(ExpectedConditions.visibilityOfElementLocated(obj));
}


}
