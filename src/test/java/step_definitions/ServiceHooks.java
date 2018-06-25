package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ServiceHooks {
    @Before
    public void initializeTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        // Generate the error log if the test failed
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Test Failed");
        }

        // Close the browser
        driver.close();
    }
}
