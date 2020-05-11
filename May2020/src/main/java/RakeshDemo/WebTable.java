package RakeshDemo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "https://www.isibang.ac.in/~adean/infsys/cal/time.html";
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		List<WebElement> rows=driver.findElements(By.xpath("//b[contains(text(), 'B.Math (Hons.) I,  Semester I')]/ancestor::tr/following-sibling::tr[1]//table//tr"));     List<WebElement> columns=driver.findElements(By.xpath("//b[contains(text(), 'B.Math (Hons.) I,  Semester I')]/ancestor::tr/following-sibling::tr[1]//table//tr[1]/td"));         int noRows=rows.size();     
		int noCols=columns.size();         
		for(int i=0;i<noRows;i++) {         
			List<WebElement> columnData=rows.get(i).findElements(By.tagName("td"));         
		for(int j=0;j<noCols;j++) {             
		System.out.print(columnData.get(j).getText() + "\t");                     
		}        
		System.out.println("");     
		}

	}

	

	
	
	
}
