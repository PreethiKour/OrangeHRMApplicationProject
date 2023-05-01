package Base;



	import java.io.FileInputStream;
	import java.time.Duration;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
		
		
		public static WebDriver driver;
		public static Properties prop;
		
		public void initialize()
		{
			readPropertyFile();
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
			driver.get(prop.getProperty("url"));

			

		}
		
		public void tearDown()
		{
			driver.quit();
		}
		
		public void readPropertyFile()
		{
			String PropFilePath= ".\\src\\test\\java\\Config\\Config.properties";
			prop=new Properties();
			
			try
			{
				FileInputStream fis=new FileInputStream(PropFilePath);
				prop.load(fis);
				
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}










