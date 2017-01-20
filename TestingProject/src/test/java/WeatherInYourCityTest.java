import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import static org.hamcrest.CoreMatchers.is;  
import static org.hamcrest.MatcherAssert.assertThat;  
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.anyOf;

import org.codehaus.groovy.vmplugin.v7.Selector;

import resources.TestAPILocators;
import utils.TestingFwk;

public class WeatherInYourCityTest {
  TestingFwk testingApi;
  
  @DataProvider(name = "Authentication")
  
  public static Object[][] credentials() {
 
        return new Object[][] { { "adrianafloresdelgado1@gmail.com", "somebody" }};
 
  }
  
  @Test(dataProvider = "Authentication")
  public void SignInRegistered(String sUsername, String sPassword) {
	  testingApi.initialize();
	  testingApi.get("https://home.openweathermap.org/users/sign_in");  
	  assertThat(testingApi.getElement(TestAPILocators.H3_SIGNIN, "XPATH").getText(), is(equalTo("Sign In"))); 
	  testingApi.getElement(TestAPILocators.EMAIL_SIGNIN, "ID").sendKeys(sUsername);
	  testingApi.getElement(TestAPILocators.PWD_SIGNIN, "ID").sendKeys(sPassword);
	  testingApi.getElement(TestAPILocators.SUBMIT_SIGNIN, "NAME").click();
	  assertThat(testingApi.getElement(TestAPILocators.NOTICE, "XPATH").getText(), is(equalTo("Signed in successfully."))); 
	  testingApi.getElement(TestAPILocators.NAV_SEARCH , "ID").click();
	  testingApi.getElement("q", "ID").sendKeys("Guadalajara");
	  testingApi.getElement("q", "ID").sendKeys(Keys.RETURN);
	  WebDriverWait wait = new WebDriverWait(testingApi.webdriver, 2);
      wait.until(ExpectedConditions.alertIsPresent());
      Alert alert = testingApi.webdriver.switchTo().alert();
      alert.accept();
	  //testingApi.getElement(TestAPILocators.SEARCH_BTN , "ID").click();
	  testingApi.getElement(TestAPILocators.FIRST_RESULT , "XPATH").click();
	  //assertThat(testingApi.getElement(TestAPILocators.CITY_NAME_FORECAST, "ID").getText(), containsString("Guadalajara, MX")); 
	  //Toggle temperature
	  assertThat(testingApi.getElement(TestAPILocators.INPUT_TEMP, "ID").getText(), anyOf(containsString("°C"), containsString("°F"))); 
  }
  @Test(dataProvider = "Authentication")
  public void testMenu(String sUsername, String sPassword) {
	  testingApi.initialize();
	  testingApi.get("https://home.openweathermap.org/users/sign_in");  
	  assertThat(testingApi.getElement(TestAPILocators.H3_SIGNIN, "XPATH").getText(), is(equalTo("Sign In"))); 
	  testingApi.getElement(TestAPILocators.EMAIL_SIGNIN, "ID").sendKeys(sUsername);
	  testingApi.getElement(TestAPILocators.PWD_SIGNIN, "ID").sendKeys(sPassword);
	  testingApi.getElement(TestAPILocators.SUBMIT_SIGNIN, "NAME").click();
	  assertThat(testingApi.getElement(TestAPILocators.NOTICE, "XPATH").getText(), is(equalTo("Signed in successfully."))); 
	  //Click on Menu
	  testingApi.getElement(TestAPILocators.WEATHER, "XPATH").click();
	  testingApi.getElement(TestAPILocators.API, "XPATH").click();
	  testingApi.getElement(TestAPILocators.PRICE, "XPATH").click();
	  testingApi.getElement(TestAPILocators.PARTNERS, "XPATH").click();
	  testingApi.getElement(TestAPILocators.STATIONS, "XPATH").click();
	  testingApi.getElement(TestAPILocators.NEWS, "XPATH").click();
	  
	  
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  testingApi = new TestingFwk(); 
  }

  @AfterMethod
  public void afterMethod() {
	  testingApi.close(); 
  }



}
