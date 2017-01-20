import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import static org.hamcrest.CoreMatchers.is;  
import static org.hamcrest.MatcherAssert.assertThat;  
import static org.hamcrest.core.IsEqual.equalTo;
import resources.TestAPILocators;
import utils.TestingFwk;

public class NewTest {
  TestingFwk testingApi;
  
  @Test()
  public void f() {
	  testingApi.initialize();
	  testingApi.get("http://the-internet.herokuapp.com/login");
	  assertThat(testingApi.getTitle(), is(equalTo("The Internet")));  
	  testingApi.getElement("username", "ID").sendKeys("hola");
	  testingApi.getElement("password", "ID").sendKeys("hola2");
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
