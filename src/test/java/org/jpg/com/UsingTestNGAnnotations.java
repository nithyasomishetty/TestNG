package org.jpg.com;

import java.awt.AWTException;
import java.io.IOException;

import org.com.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class UsingTestNGAnnotations extends BaseClass {
	static BaseClass base = new BaseClass();
	@BeforeClass
	public static void browserlaunch() {
		base.broswerLaunch();
		System.out.println("Browser Launched Successsfully");
	}
	
	@AfterClass
	public static void quitBrowserMethod() {
		base.quitBrowser();
		System.out.println("Browser quit Successsfully");
	}
	@BeforeMethod
	public void maxinize() {
		base.maximizeWindow();
		System.out.println("Browser maxinize Successsfully");
	}
	@AfterMethod
	public void TakingSC() throws IOException {
		base.screenShot();
		System.out.println("Browser SC Successsfully");
	}
	@Test(description = "Will execute the faceBook LoginPage", enabled=true, priority=0)
	public void facebook() {
		base.getUrl("https://www.facebook.com/");
		System.out.println("FB launch Successsfully");
		base.textBox(By.name("email"), "Kamala");
		base.textBox(By.name("pass"), "12345678");
		WebElement login = base.element(By.name("login"));
		base.click(login);

	}
	@Test(description = "In Google search Engine search for ramcaharan",enabled=true, priority=1)
	public void google() throws AWTException, InterruptedException {
		base.getUrl("https://www.google.com/");
		System.out.println("Gooogle launch Successsfully");
		base.textBox(By.name("q"), "ramcharan");
		base.robot();

	}
	

	

	

	

	

	}

	


