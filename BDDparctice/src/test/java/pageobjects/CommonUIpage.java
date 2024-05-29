package pageobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonUIpage {
	public WebDriver driver;
	public static Properties prop;
	FileInputStream file;
	
	public void propreader() {
		
		try {
			
			prop=new Properties();
			file= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\BDDparctice\\src\\test\\resources\\input.properties");
			prop.load(file);
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	
	     catch(IOException e) {
	    	 System.out.println("Input output details found");
	     }
	    	 
			
		
		
	}
	
	public WebDriver driverStartUp(String URL) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(URL);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		return driver;
	}

	
	}


