package projectartifact.salesforcebase;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
	WebDriver driver;
	FileInputStream fis ;
	Properties prop ;
	
	public void open () {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 try {
			 fis= new FileInputStream("D:\\programs java\\salesforce\\src\\main\\java\\projectartifact\\salesforcebase\\objectrepository.propetiesfile");
			 prop=new Properties ();
			prop.load(fis);
			 
		 } catch (Exception e) {
			e.printStackTrace();
	}
	}
	public void url(String httpurl) {
		driver.get(httpurl);
		
	}

	public void input(String testdata, String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(testdata);
		
	}
	public void click(String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();
		}
	
	public void closebrowser() {
		driver.close();
		
	}
	public void inputbyname(String testdata, String objectname) {
		driver.findElement(By.name(prop.getProperty(objectname))).sendKeys(testdata);
		
	}
	
		
		
	}


