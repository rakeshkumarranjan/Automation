package RakeshDemo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.spicejet.com/";
		driver.get(url);
		//Thread.sleep(1000);
		WebElement passenger=driver.findElement(By.xpath("//input['@value=RoundTrip' and '@name=ctl00$mainContent$rbtnl_Trip'])[18]']"));
		Thread.sleep(1000);
		Select s = new Select(passenger);
		passenger.getText();
		s.selectByVisibleText("Round Trip");
		//s.selectByVisibleText("Round Trip");
	passenger.click();
	//List<WebElement> list = s.selectByVisibleText("Round Trip");
		
		//passenger.click();
		//input['@value=RoundTrip' and '@name=ctl00$mainContent$rbtnl_Trip'])[18]
	}

}
