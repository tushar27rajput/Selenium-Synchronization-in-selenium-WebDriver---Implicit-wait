/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnautomation_9;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author tusshar
 */
public class LearnAutomation_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                  System.setProperty("webdriver.gecko.driver","C:\\Users\\tusshar\\Downloads\\geckodriver.exe");
                  
                  WebDriver driver = new FirefoxDriver();
                  
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                  
                  driver.get("https://www.google.com");
                  
                          
                  
    }
    
}
