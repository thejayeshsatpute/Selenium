package myPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementvsFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		//1
//		WebElement searchStore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//		searchStore.sendKeys("Jayesh");
//		
//		//2
//		WebElement element=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
//		System.out.println(element.getText());
		
		//findElements() REturns multiple web elements
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of elements captured :" +links.size());
		
	}

}
