package testdata;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dp {
  @Test(dataProvider="dp")
  public void googleserach
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
