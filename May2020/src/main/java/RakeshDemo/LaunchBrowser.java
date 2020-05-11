package RakeshDemo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.google.com/";
		driver.get(url);
		System.out.print(driver.getCurrentUrl());
		System.out.print(driver.getTitle());
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Power Bank");
		//List<WebElement> list = driver.findElements(By.cssSelector("div.sbab"));
		
		List<WebElement> list =driver.findElements(By.cssSelector("div.aajZCb ul li"));
		
		
        for(int i=0;i<list.size();i++)
        {
        	//System.out.print("Done");
        	WebElement e = list.get(i);
        	System.out.println(i+""+e.getText());
        }
		//driver.findElements(arg0);
	}

}
