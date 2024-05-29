package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Loginpage extends CommonUIpage{
	WebDriver driver;
	
public Loginpage(WebDriver driver) {
	this.driver=driver;
}

public void enterusername() {
	locatexpath(prop.getProperty("usernamexpath"),prop.getProperty("usernamevalue"));
	
}
public void enterpassword() {
	locatexpath(prop.getProperty("passwordxpath"),prop.getProperty("passwordvalue"));
	
}

public void clickLoginbutton() {
	locatexpathclick(prop.getProperty("loginbuttonxpath"));
	
}
public void ishomepagedisplayed() {
	Assert.assertTrue(driver.getTitle().equals(prop.getProperty("homepage")));
}

public void locatexpath(String xpathvalue,String inputvalue) {
	
	WebElement ele=driver.findElement(By.xpath(xpathvalue));
	ele.sendKeys(inputvalue);
}
public void locatexpathclick(String xpathvalue) {
	WebElement ele=driver.findElement(By.xpath(xpathvalue));
	ele.click();
}
public void driverclose() {
	driver.close();
}


}
	
	
	







