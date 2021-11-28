package regression;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import softwaretestingproject3.baseclass;

public class propertiesNewTest extends baseclass {
 
	
	
	
	
@Test
  public void f() {
	Properties prop = new Properties();
	  FileInputStream ob= new FileInputStream("C:\\Users\\VAADMIN\\git\\peopleandtechWeekend2021TestNG\eleniumproject4parametersdata.properties");
	  prop.load(ob);
	  
	 String emailid= prop.getProperty("Email");
	 String passtxt= prop.getProperty("Password");
	 
	 System.out.println(emailid);
	 System.out.println(passtxt);
	 
	 System.out.println(emailid);
	  }


	}

