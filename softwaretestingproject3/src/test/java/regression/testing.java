package regression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class testing {
 
  @BeforeTest
  public void beforeTest(ChromeDriver driver) throws InterruptedException {
	  System.out.println( "Hello World!" );
      System.setProperty( "webdriver.chrome.driver","C:\\Users\\Kiran\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.facebook.com");
      driver.manage().window().maximize();
      Thread.sleep(10000);
  }

  
  @Test
  public void f() {
  }
  
  @AfterTest
  public void afterTest() {
  }

}
