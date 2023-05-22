package org.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleClass {
	@Test
	public void tc01() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Thread.sleep(3000);
		WebDriver drivr = new ChromeDriver();
		drivr.manage().window().maximize();
		Thread.sleep(4000);
		drivr.get("https://adactinhotelapp.com/");
		
		System.out.println("My browser is not getting invoked");
		System.out.println("i did everything correctly. So its not my mistake");

		
		System.out.println("My second for merge conflicts");
		System.out.println("Now going to resolve the merge conflicts");
		

	}

}
