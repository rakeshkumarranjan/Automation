package RakeshDemo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class IndianRail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "http://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html?locale=en";
		driver.get(url);
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='quota']"));
		
		Select s = new Select(dropdown);
		dropdown.getText();
		Thread.sleep(1000);
		//s.selectByValue("PT");
		s.selectByVisibleText("Yuva Quota");
		System.out.println("Selected: "+s.getFirstSelectedOption().getText());
		//System.out.println("");
		List<WebElement> list = s.getOptions();
		for (int i=0;i<list.size();i++) {
			list.get(i).getText();
			String txt = list.get(i).getText();
			System.out.println(txt);
		}
	}

}
