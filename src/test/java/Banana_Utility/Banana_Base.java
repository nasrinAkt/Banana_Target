package Banana_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class Banana_Base {

	public static WebDriver driver;
	public static Properties BanPro;
	public Banana_Base() {
	try {
		FileInputStream banFle = new FileInputStream(System.getProperty("user.dir")+("//src/test//java//Banana_Config/Banana_Config.Properties"));	
			 BanPro = new Properties();
			 BanPro.load(banFle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Please,look the code");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	public void BanBrowser() {
	String BanAllBrowser = BanPro.getProperty("BanBrowser1");
		
		if(BanAllBrowser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//Banana_ChromeDriver//chromedriver.exe"));
			   ChromeOptions mom = new ChromeOptions();
			   mom.addArguments("--remote-allow-origins=*"); 
			   driver = new ChromeDriver();
			   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Banana_Utiliti.pageLoadTimeout));
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Banana_Utiliti.implicitlyWait));
			   driver.manage().window().maximize();	
			
			
			
		}
		else if(BanAllBrowser.equalsIgnoreCase("Edge")) {
			

			System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+("//Banana_EdgeDriver//msedgedriver.exe"));
			   EdgeOptions dad = new EdgeOptions();
			   dad.addArguments("--remote-allow-origins=*"); 
			   driver = new EdgeDriver();
			   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Banana_Utiliti.pageLoadTimeout));
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Banana_Utiliti.implicitlyWait));
			   driver.manage().window().maximize();	
				
			
		}
	}
	
	public static void BanLaunchURL(String URL) {
		driver.get(BanPro.getProperty("BanURL"));
		
		
		
	}
	
}
