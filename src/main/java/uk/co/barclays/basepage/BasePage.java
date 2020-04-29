package uk.co.barclays.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class BasePage {


    public static WebDriver driver;
    //constructor
    public BasePage(){

        //log4j & page factory
        PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/uk/co/barclays/resources/properties/log4j.properties");
        PageFactory.initElements(driver,this);
    }
}
