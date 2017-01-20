package utils;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.testng.annotations.BeforeMethod;


import org.testng.annotations.AfterMethod;
import static org.hamcrest.CoreMatchers.is;  
import static org.hamcrest.MatcherAssert.assertThat;  
import static org.hamcrest.core.IsEqual.equalTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class TestingFwk {
	
	public Logger logger;
	public Reporter reporter;
	public WebDriver webdriver;
	WebDriverWait wait;
	
	/**
     * This constructor is used by Webdriver driver
     *
     * @param webdriver
     * @param logger
     * @param reporter
     */
    public TestingFwk(WebDriver webdriver, Logger logger) {
        
        this.webdriver  = webdriver;
        this.logger 	= logger;
        
    }
    
    public TestingFwk() {
		// TODO Auto-generated constructor stub
	}

	public void initialize() {
		webdriver = new FirefoxDriver();
		webdriver.manage().window().maximize(); 
		wait=new WebDriverWait(webdriver, 3000);
		logger = Logger.getLogger(TestingFwk.class);
		reporter = new Reporter();        
    }
	
	public void get(String url){
		webdriver.get(url);
		logger.info("Web page launched : " +  url);
		Reporter.log("Web page launched : " +  url);
	}
	public void close(){
		webdriver.quit();
		logger.info("Quit driver");
		Reporter.log("Quit driver");
	}
	public String getTitle(){
		logger.info("Get title from page launched");
		Reporter.log("Get title from page launched : "+ webdriver.getTitle());
		return webdriver.getTitle();
	}
	public WebElement getElement(String locator, String findBy){
		logger.info("Find element : "+ locator + " by " +  findBy);
		Reporter.log("Find element : "+ locator + " by " +  findBy);
		WebElement element = null;
		switch(findBy){
			case "ID" : 
				element = webdriver.findElement(By.id(locator));
				
				break;
			case "XPATH" : 
				element = webdriver.findElement(By.xpath(locator));
				break;
			case "NAME":
				element = webdriver.findElement(By.name(locator));
				break;
		}
		return element;
	}
	
	
	
}
