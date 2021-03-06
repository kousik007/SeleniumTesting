package SeleniumWebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1121528\\Kousik_all data\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&pageType=3984&ru=https%3A%2F%2Fmy.ebay.com%2Fws%2FeBayISAPI.dll%3FMyEbayBeta%26MyEbay%3D%26gbh%3D1%26guest%3D1&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26pageType%3D3984%26ru%3Dhttps%253A%252F%252Fmy.ebay.com%252Fws%252FeBayISAPI.dll%253FMyEbayBeta%2526MyEbay%253D%2526gbh%253D1%2526guest%253D1");
		//1.By XPATH - priority 2
		//driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Siva");
		//driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Karthik Para");
		
		//2.By id - priority 1
		//driver.findElement(By.id("firstname")).sendKeys("Kousik");
		//driver.findElement(By.id("lastname")).sendKeys("Paul");
		
		//3.By name  - priority 3
		//driver.findElement(By.name("firstname")).sendKeys("Kousik");
		//driver.findElement(By.name("lastname")).sendKeys("Paul");
		
		//4.link test
		//driver.findElement(By.linkText("Sign in")).click();
		
		//5.CSSSelector
		//rules-- 
		//a.if id is there then ....#{ID}
		//b.if class is there then----.{Class}
		//driver.findElement(By.cssSelector("#firstname")).sendKeys("Kousik");
		//driver.findElement(By.cssSelector("#lastname")).sendKeys("Paul");
		
		//6.By Class name : not useful
		//driver.findElement(By.className("sgnInTxt")).click();
		
		//7.By partial link test : less priority for link
		driver.findElement(By.partialLinkText("Sign in")).click();
		
		//driver.quit();
		
	}

}
