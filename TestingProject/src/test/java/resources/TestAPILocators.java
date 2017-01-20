package resources;

public class TestAPILocators {
	public static final String ABOUT_PAGE_TITLE_PATH = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]";
    public static final String ABOUT_LIST_ITEM_PATH = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]";
    public static final String H3_SIGNIN = "html/body/div[3]/div[1]/div/div/div[1]/h3";
    public static final String EMAIL_SIGNIN = "user_email";
    public static final String PWD_SIGNIN = "user_password";
    public static final String SUBMIT_SIGNIN = "commit";
    public static final String ALERT1_SIGNIN = "html/body/div[3]/div[4]/div/div/div/div[2]";
    public static final String CREATE_ACCOUNT = "html/body/div[3]/div[5]/div/div/div/p/a";
    public static final String USER_SIGNUP = "user_username";
   
    public static final String USER_PWD_CONF = "user_password_confirmation";
    public static final String USER_AGREEMENT = "user_agreement";
    public static final String COMPANY = "poll_company";
    public static final String PURPOSE = "poll_purpose";
    public static final String SAVEHOWANDWHERE = "button";
    public static final String NOTICE = "html/body/div[3]/div[4]/div/div/div/div[2]";
    public static final String NAV_SEARCH = "nav-search";
    public static final String SEARCH_BTN = "searchform";
    public static final String WEATHER_IN_CITY ="html/body/div[4]/div[1]/div/div/h2/span";
    public static final String FIRST_RESULT ="//*[@id='forecast_list_ul']/table/tbody/tr[1]/td[2]/b[1]/a";
    public static final String CITY_NAME_FORECAST = "city-name-forecast";
    public static final String INPUT_TEMP = "units_check";
    
    public static final String WEATHER = "//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[1]/a";
    public static final String MAPS = "//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[2]/a";
    public static final String WEATHER_MAPS = "//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[2]/ul/li[1]/a";
    public static final String API = "//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[3]/a";
    public static final String PRICE = "//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[4]/a";
    public static final String PARTNERS = "//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[5]/a";
    public static final String STATIONS = "//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[6]/a";
    public static final String NEWS = "//*[@id='undefined-sticky-wrapper']/div/div/div[2]/ul/li[7]/a";
    private TestAPILocators(){
        throw new AssertionError();   
    }

}
