import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import static org.hamcrest.CoreMatchers.is;  
import static org.hamcrest.MatcherAssert.assertThat;  
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.Matchers.equalTo;
import resources.TestAPILocators;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;

public class RestTest {
   
	                
    @Test
    
    public void testRead()
    
    {
    
    	expect().statusCode( 200 )
    
    	.when() .get ( "https://openweathermap.org/api" );
    
    }
	    

	

	  
	


	

}
