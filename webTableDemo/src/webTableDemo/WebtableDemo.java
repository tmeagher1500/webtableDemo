package webTableDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		
		
		

	}

}
