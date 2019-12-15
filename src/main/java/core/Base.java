package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties properties;
	
	// propertiesPath will return user directory of user.
	
	private String propertiesPath = System.getProperty("user.dir");
	private String ProjectPropertyPath = propertiesPath + "\\src\\test\\resources\\Properties\\ProjectProperty.properties";
	
	
	//0 Create a constructor 
	
	public Base() {
		
		
		
		try {
			BufferedReader reader;
			reader=new BufferedReader (new FileReader(ProjectPropertyPath));
			properties = new Properties();
			try {
				properties.load(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static String browserName () {
		String browser = properties.getProperty("browserName");
		return browser;
	}
	
	public static String getURL () {
		String url= properties.getProperty("url");
		return url;
	}
	
	public static long getPageLoadTimeout() {
		String pageLoadTimeOut= properties.getProperty("pageLoadTimeOut");
		
		return Long.parseLong(pageLoadTimeOut);
	}
	
	public static long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		
		return Long.parseLong(implicitlyWait);
	}
	
	public static void inializeDriver () {
		driver.get(getURL());
	}

}
