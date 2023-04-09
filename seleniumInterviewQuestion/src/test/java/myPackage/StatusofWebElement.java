package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusofWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed() isEnabled()
		
		WebElement searchStore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display status:"+searchStore.isDisplayed());
		System.out.println("Display status:"+searchStore.isEnabled());
	}

}
