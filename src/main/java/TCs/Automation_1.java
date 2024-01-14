package TCs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
		//TestCase = 1 - Reading inputs from code / Positive Scenario
		System.out.println("Test case 1");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		String res = driver.findElement(By.xpath("//h1[@class='post-title']")).getText();
		System.out.println(res);

		// logout
		driver.findElement(By.xpath("//*[@id='loop-container']//a")).click();

		//TestCase = 2 - Reading inputs from webPage / Positive Scenario
		System.out.println("Test case 2");
		String userName = driver.findElement(By.xpath("//b[1]")).getText();
		driver.findElement(By.id("username")).sendKeys(userName);

		String pass = driver.findElement(By.xpath("//b[2]")).getText();
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("submit")).click();
		System.out.println(res);

		// logout
		driver.findElement(By.xpath("//*[@id='loop-container']//a")).click();
		
		//TestCase = 3 / Negative Scenario
		System.out.println("Test case 3");
		driver.findElement(By.id("username")).sendKeys("incorrectUser");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		String errorResult = driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println("Error statement is: "+errorResult);
		driver.close();
		
	}

}