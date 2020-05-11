package utility;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test {
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
