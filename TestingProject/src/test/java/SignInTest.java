import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import static org.hamcrest.CoreMatchers.is;  
import static org.hamcrest.MatcherAssert.assertThat;  
import static org.hamcrest.core.IsEqual.equalTo;

import org.codehaus.groovy.vmplugin.v7.Selector;

import resources.TestAPILocators;
import utils.TestingFwk;

public class SignInTest {
  TestingFwk testingApi;
  
  @DataProvider(name = "Authentication")
  
  public static Object[][] credentials() {
 
        return new Object[][] { { "lizeth.heredia@gmail.com", "somebody" }, { "testuser_1", "Test1" }, { " ", " " },{ "testuser_2", "Test2"}};
 
  }
  
  @Test(dataProvider = "Authentication")
  public void SignInWithOutRegister(String sUsername, String sPassword) {
	  testingApi.initialize();
	  testingApi.get("https://home.openweathermap.org/users/sign_in");  
	  assertThat(testingApi.getElement(TestAPILocators.H3_SIGNIN, "XPATH").getText(), is(equalTo("Sign In"))); 
	  testingApi.getElement(TestAPILocators.EMAIL_SIGNIN, "ID").sendKeys(sUsername);
	  testingApi.getElement(TestAPILocators.PWD_SIGNIN, "ID").sendKeys(sPassword);
	  testingApi.getElement(TestAPILocators.SUBMIT_SIGNIN, "NAME").click();
	  assertThat(testingApi.getElement(TestAPILocators.ALERT1_SIGNIN, "XPATH").getText(), is(equalTo("Invalid email or password."))); 
  }
//  @Test
//  public void SignInCreateAccount(){
//	  testingApi.initialize();
//	  testingApi.get("https://home.openweathermap.org/users/sign_in");  
//	  assertThat(testingApi.getElement(TestAPILocators.H3_SIGNIN, "XPATH").getText(), is(equalTo("Sign In")));
//	  //Click on Create Account
//	  testingApi.getElement(TestAPILocators.CREATE_ACCOUNT, "XPATH").click();
//	  assertThat(testingApi.getElement(TestAPILocators.H3_SIGNIN, "XPATH").getText(), is(equalTo("Sign Up")));
//	  testingApi.getElement(TestAPILocators.USER_SIGNUP, "ID").sendKeys("lizethheredia");
//	  testingApi.getElement(TestAPILocators.EMAIL_SIGNIN, "ID").sendKeys("lizeth.heredia@gmail.com");
//	  testingApi.getElement(TestAPILocators.PWD_SIGNIN, "ID").sendKeys("somebody");
//	  testingApi.getElement(TestAPILocators.USER_PWD_CONF, "ID").sendKeys("somebody");
//	  testingApi.getElement(TestAPILocators.USER_AGREEMENT, "ID").click();
//	  testingApi.getElement(TestAPILocators.SUBMIT_SIGNIN, "NAME").click();
// 	  testingApi.getElement(TestAPILocators.COMPANY, "ID").sendKeys("Wizeline");
// 	  Select select = new Select(testingApi.getElement(TestAPILocators.PURPOSE, "ID"));
//	  select.deselectAll();
//	  select.selectByVisibleText("Advertising");
//	  testingApi.getElement(TestAPILocators.SAVEHOWANDWHERE, "NAME").click();
//	  assertThat(testingApi.getElement(TestAPILocators.H3_SIGNIN, "XPATH").getText(), is(equalTo("My Home")));
//  }
  
  @BeforeMethod
  public void beforeMethod() {
	  testingApi = new TestingFwk(); 
  }

  @AfterMethod
  public void afterMethod() {
	  testingApi.close(); 
  }



}
