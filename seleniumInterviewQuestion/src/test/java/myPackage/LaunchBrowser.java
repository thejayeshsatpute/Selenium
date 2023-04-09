package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		WebDriver driver=new ChromeDriver(option);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/in/thejayeshsatpute/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
	}

}
