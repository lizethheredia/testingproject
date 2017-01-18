import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import static org.hamcrest.CoreMatchers.is;  
import static org.hamcrest.MatcherAssert.assertThat;  
import static org.hamcrest.core.IsEqual.equalTo;

public class NewTest {
  WebDriver driver;
  @Test()
  public void f() {
	  
	  driver.get("http://the-internet.herokuapp.com/login");  
	  assertThat(driver.getTitle(), is(equalTo("The Internet")));  
	     
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit(); 
  }



}
