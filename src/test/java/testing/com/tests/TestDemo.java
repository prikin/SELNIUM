package testing.com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo {
WebDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Test
	public void add()
	{
		
		driver.get("https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html");
		sleep();
		driver.findElement(By.xpath("//input[@value='C']")).click();
		driver.findElement(By.xpath("//input[@value='9']")).click();
		driver.findElement(By.xpath("//input[@value='+']")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='=']")).click();
		Assert.assertEquals("10", driver.findElement(By.xpath("//div[@id='display']/div[1]")).getText());
		
	
	}
	@Test
	public void multiply()
	{
		
		driver.get("https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html");
		sleep();
		driver.findElement(By.xpath("//input[@value='C']")).click();
		driver.findElement(By.xpath("//input[@value='9']")).click();
		driver.findElement(By.id("multiply")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='=']")).click();
		Assert.assertEquals("9", driver.findElement(By.xpath("//div[@id='display']/div[1]")).getText());
			
	}
	@Test
	public void substract()
	{
		
		driver.get("https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html");
		sleep();
		driver.findElement(By.xpath("//input[@value='C']")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='-']")).click();
		driver.findElement(By.xpath("//input[@value='9']")).click();
		driver.findElement(By.xpath("//input[@value='=']")).click();
		Assert.assertEquals("-8", driver.findElement(By.xpath("//div[@id='display']/div[1]")).getText());
		
		
	
	}
	@Test
	public void divideWith0()
	{
		
		driver.get("https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html");
		sleep();
		driver.findElement(By.xpath("//input[@value='C']")).click();
		driver.findElement(By.xpath("//input[@value='9']")).click();
		driver.findElement(By.id("divide")).click();
		driver.findElement(By.xpath("//input[@value='0']")).click();
		driver.findElement(By.xpath("//input[@value='=']")).click();
		Assert.assertEquals("Error", driver.findElement(By.xpath("//div[@id='display']/div[1]")).getText());
		
		
	
	}
	@Test
	public void divide()
	{
		
		driver.get("https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html");
		sleep();
		driver.findElement(By.xpath("//input[@value='C']")).click();
		driver.findElement(By.xpath("//input[@value='9']")).click();
		driver.findElement(By.id("divide")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='0']")).click();
		driver.findElement(By.xpath("//input[@value='=']")).click();
		Assert.assertEquals("0.9", driver.findElement(By.xpath("//div[@id='display']/div[1]")).getText());
		
		
	
	}
	public void sleep()
	{
		 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
