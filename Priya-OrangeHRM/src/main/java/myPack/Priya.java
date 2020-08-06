package myPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priya {
@Test
public static void verifyLogin() {
	WebDriver driver=new ChromeDriver();
	driver.get("http://apps.qaplanet.in/hrm");
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qaplanet1");
	
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lab1");
	
	
	//click the login button...
	driver.findElement(By.xpath("//input[@type='Submit']")).click();

//driver.findElement(By.xpath("//input[@value='Login']")).click();
//compare the pageTitle with the expected value...
		if(driver.getTitle().equals("OrangeHRM")){
			System.out.println("Titles matching, VerifyLogin passed!");
		}
		else{
			System.out.println("VerifyLogin failed!");
		}
//click the logout link
		//driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
}

@Test
public static void googleSearch() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver(); 
	//WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	String ExpTitle = "Google";
	String Title1 = driver.getTitle();
	if(Title1.equals(ExpTitle)) {
		System.out.println("Titles are matching, TC passed!");
	}
		else { 
			
			System.out.println("Titles are not matching, TC failed!");
	}
	//driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	WebElement Searchbox = driver.findElement(By.name("q"));
	Searchbox.sendKeys("selenium");
	Searchbox.submit();
	//driver.findElement(By.name("btnk")).click();
	//driver.findElement(By.className("gLFyf")).sendKeys("selenium");
	//driver.findElement(By.linkText("Gmail")).click();
	//driver.findElement(By.linkText("SIGN IN")).click();
	//driver.findElement(By.partialLinkText("ma")).click();
	//int linkCount =driver.findElements(By.tagName("a")).size();
	//System.out.println("The number of links in google homepage are " + linkCount);
	driver.manage().window().maximize(); 
	Thread.sleep(3000);
	driver.quit();
}
@Test
public static void AddEmp() {
	System.out.println("New employee has been added successfully");
}
@Test
public static void EditEmp() {
	System.out.println("Employee details has been edited successfully");
}
}
