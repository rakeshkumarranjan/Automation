import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.server.FirefoxDriverProvider;



public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc1= new Calculator();
		calc1.add();
		calc1.mul();
		calc1.div();
		calc1.sub();
		
		//FirefoxLauncher driver = new FirefoxLauncher(null, null, null);
		//FirefoxDriverProvider driver = new FirefoxDriverProvider();
		//GoogleChromeLauncher driver = new GoogleChromeLauncher(null, null, null, null);
		//FirefoxDriver driver =  new FirefoxDriver();
		new FirefoxDriver();
		
		
		
	}

}
