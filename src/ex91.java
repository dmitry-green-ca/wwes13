import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex91 {
	public static void main(String[] args) throws InterruptedException{
	

//ChromeDriver is a separate executable that Selenium WebDriver uses to control Chrome.
System.setProperty("webdriver.chrome.driver", "/Users/dmitrynakhabtsev/Documents/wwes/Selenium/chromedriver");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
	Thread.sleep(2000);
	
	String title=driver.getTitle();

	System.out.println(title);
	
	
	String expected1= "HOME";
	String expected2= "ALL PRODUCTS";
	String expected3= "SINGLE BOARD COMPUTERS";
	String expected4= "NEW PRODUCTS";
	String expected5= "BESTSELLERS";
	String expected6= "SALE";
	String expected7= "FORUM";
	String expected8= "ABOUT";
	
	String actual1=driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob0label\"]")).getText();
	String actual2=driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).getText();
	String actual3=driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob2label\"]")).getText();
	String actual4=driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob3label\"]")).getText();
	String actual5=driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob4label\"]")).getText();
	String actual6=driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob5label\"]")).getText();
	String actual7=driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob6label\"]")).getText();
	String actual8=driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob7label\"]")).getText();
	
			
	//Test Case 001- verification 1st main menu tab
	System.out.println ("Test Case 001- verification 1st main menu tab");
	if (expected1.equals(actual1)) {
		System.out.println ("PASS");
	System.out.println ("Actual result is: "+actual1);
	System.out.println ("Expected result is: "+expected1);
	}
	else {
		System.out.println ("FAIL");
		System.out.println ("Actual result is: "+actual1);
		System.out.println ("Expected result is: "+expected1);
		}
	System.out.println ("**************************************************");
	//Test Case 002- verification 2nd main menu tab
	System.out.println ("Test Case 002- verification 2nd main menu tab");
	if (expected2.equals(actual2))  {
		System.out.println ("PASS");
	System.out.println ("Actual result is: "+actual2);
	System.out.println ("Expected result is: "+expected2);
	}
	else {
		System.out.println ("FAIL");
		System.out.println ("Actual result is: "+actual2);
		System.out.println ("Expected result is: "+expected2);
		}
	System.out.println ("**************************************************");
	
	//Test Case 003- verification 3st main menu tab
	System.out.println ("Test Case 003- verification 3st main menu tab");
	if (expected3.equals(actual3) ) {
		System.out.println ("PASS");
	System.out.println ("Actual result is: "+actual3);
	System.out.println ("Expected result is: "+expected3);
	}
	else {
		System.out.println ("FAIL");
		System.out.println ("Actual result is: "+actual3);
		System.out.println ("Expected result is: "+expected3);
		}
	System.out.println ("**************************************************");
	
	//Test Case 004- verification 4th main menu tab
	System.out.println ("Test Case 004- verification 4th main menu tab");
	if (expected4.equals(actual4) ) {
		System.out.println ("PASS");
	System.out.println ("Actual result is: "+actual4);
	System.out.println ("Expected result is: "+expected4);
	}
	else {
		System.out.println ("FAIL");
		System.out.println ("Actual result is: "+actual4);
		System.out.println ("Expected result is: "+expected4);
		}
	System.out.println ("**************************************************");
	
	//Test Case 005- verification 5th main menu tab
	System.out.println ("Test Case 005- verification 5th main menu tab");
	if (expected5.equals(actual5) ) {
		System.out.println ("PASS");
	System.out.println ("Actual result is: "+actual5);
	System.out.println ("Expected result is: "+expected5);
	}
	else {
		System.out.println ("FAIL");
		System.out.println ("Actual result is: "+actual5);
		System.out.println ("Expected result is: "+expected5);
		}
	System.out.println ("**************************************************");
	
	//Test Case 006- verification 6th main menu tab
	System.out.println ("Test Case 006- verification 6th main menu tab");
	if (expected6.equals(actual6) ) {
		System.out.println ("PASS");
	System.out.println ("Actual result is: "+actual6);
	System.out.println ("Expected result is: "+expected6);
	}
	else {
		System.out.println ("FAIL");
		System.out.println ("Actual result is: "+actual6);
		System.out.println ("Expected result is: "+expected6);
		}
	System.out.println ("**************************************************");

	//Test Case 007- verification 7th main menu tab
	System.out.println ("Test Case 007- verification 7th main menu tab");
	if (expected7.equals(actual7) ) {
		System.out.println ("PASS");
	System.out.println ("Actual result is: "+actual7);
	System.out.println ("Expected result is: "+expected7);
	}
	else {
		System.out.println ("FAIL");
		System.out.println ("Actual result is: "+actual1);
		System.out.println ("Expected result is: "+expected7);
		}
	System.out.println ("**************************************************");
	
	//Test Case 008- verification 8th main menu tab
	System.out.println ("Test Case 008- verification 8th main menu tab");
	if (expected8.equals(actual8) ) {
		System.out.println ("PASS");
	System.out.println ("Actual result is: "+actual8);
	System.out.println ("Expected result is: "+expected8);
	}
	else {
		System.out.println ("FAIL");
		System.out.println ("Actual result is: "+actual8);
		System.out.println ("Expected result is: "+expected8);
		}
	
	
	driver.close();
	}
	}

