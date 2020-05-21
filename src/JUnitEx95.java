import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class JUnitEx95 {
	public static WebDriver driver;

    @BeforeClass 
    public static void onlyOnce() throws InterruptedException {

    // ChromeDriver is a separate executable that Selenium WebDriver uses to control Chrome.
    		System.setProperty("webdriver.chrome.driver", "/Users/dmitrynakhabtsev/Documents/wwes/Selenium/chromedriver");
    		WebDriver driver = new ChromeDriver();

    		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

    //Open needed web-application
    		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
    		driver.manage().window().maximize();

    // Thread.sleep(2000);

    //Driver finds and clicks on AllProducts Tab.
    		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
    // Thread.sleep(4000);

    // Driver clicks "Brand" button
    		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/button"))
    				.click();
    		Thread.sleep(2500);
    		//********************************************************************ORANGEPI**********************************************************************************
    		// Driver Selects which "Brand" is needed
    				driver.findElement(By.xpath(
    						"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[25]/label/span"))
    						.click();
    				Thread.sleep(2000);

    		// Load more
    		// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();



    		// Find all elements with class named "_2BULo" and put them in a list.
    				List<WebElement> OrangePi = driver.findElements(By.className("_2BULo"));

    		// System.out.println("OrangePi all-products quantity " +
    		// (OrangePi.size()));

    		// Thread.sleep(2500);

    		// Find all elements with class named "_2BULo" and put them in a list.
    				List<WebElement> OrangePiPrice = driver.findElements(By.className("_23ArP"));

    		// place expected and actual Names into value into strings.

    				String actualOrangePiName1 = OrangePi.get(0).getText();
    				String actualOrangePiName2 = OrangePi.get(1).getText();
    				String actualOrangePiName3 = OrangePi.get(2).getText();
    				String actualOrangePiName4 = OrangePi.get(3).getText();
    				String actualOrangePiName5 = OrangePi.get(4).getText();
    				String actualOrangePiName6 = OrangePi.get(5).getText();
    				String actualOrangePiName7 = OrangePi.get(6).getText();
    				String actualOrangePiName8 = OrangePi.get(7).getText();
    				String actualOrangePiName9 = OrangePi.get(8).getText();
    				String actualOrangePiName10 = OrangePi.get(9).getText();
    				String actualOrangePiName11 = OrangePi.get(10).getText();
    				String actualOrangePiName12 = OrangePi.get(11).getText();
    				String actualOrangePiName13 = OrangePi.get(12).getText();
    				String actualOrangePiName14 = OrangePi.get(13).getText();
    				String actualOrangePiName15 = OrangePi.get(14).getText();

    				String actualOrangePiPrice1 = OrangePiPrice.get(0).getText();
    				String actualOrangePiPrice2 = OrangePiPrice.get(1).getText();
    				String actualOrangePiPrice3 = OrangePiPrice.get(2).getText();
    				String actualOrangePiPrice4 = OrangePiPrice.get(3).getText();
    				String actualOrangePiPrice5 = OrangePiPrice.get(4).getText();
    				String actualOrangePiPrice6 = OrangePiPrice.get(5).getText();
    				String actualOrangePiPrice7 = OrangePiPrice.get(6).getText();
    				String actualOrangePiPrice8 = OrangePiPrice.get(7).getText();
    				String actualOrangePiPrice9 = OrangePiPrice.get(8).getText();
    				String actualOrangePiPrice10 = OrangePiPrice.get(9).getText();
    				String actualOrangePiPrice11 = OrangePiPrice.get(10).getText();
    				String actualOrangePiPrice12 = OrangePiPrice.get(11).getText();
    				String actualOrangePiPrice13 = OrangePiPrice.get(12).getText();
    				String actualOrangePiPrice14 = OrangePiPrice.get(13).getText();
    				String actualOrangePiPrice15 = OrangePiPrice.get(14).getText();

    		//add expected result
    				String expectedOrangePiName1 = "Orange Pi Zero H2+ / Zero Plus 2 H3 / Zero Plus 2 H5";
    				String expectedOrangePiName2 = "Orange Pi Win Plus / Win";
    				String expectedOrangePiName3 = "Orange Pi RK3399";
    				String expectedOrangePiName4 = "Orange Pi R1";
    				String expectedOrangePiName5 = "Orange Pi Prime";
    				String expectedOrangePiName6 = "Orange Pi Plus2 / Plus2E";
    				String expectedOrangePiName7 = "Orange Pi PC 2";
    				String expectedOrangePiName8 = "Orange Pi PC / PC Plus";
    				String expectedOrangePiName9 = "Orange Pi One Plus";
    				String expectedOrangePiName10 = "Orange Pi Lite2";
    				String expectedOrangePiName11 = "Orange Pi Lite";
    				String expectedOrangePiName12 = "Orange Pi i96";
    				String expectedOrangePiName13 = "Orange Pi 4G-IOT";
    				String expectedOrangePiName14 = "Orange Pi 3G-IOT";
    				String expectedOrangePiName15 = "Orange Pi 2G-IOT";

    				String expectedOrangePiPrice1 = "$8.50";
    				String expectedOrangePiPrice2 = "$36.90";
    				String expectedOrangePiPrice3 = "$109.00";
    				String expectedOrangePiPrice4 = "$13.90";
    				String expectedOrangePiPrice5 = "$35.90";
    				String expectedOrangePiPrice6 = "$49.00";
    				String expectedOrangePiPrice7 = "$20.00";
    				String expectedOrangePiPrice8 = "$15.00";
    				String expectedOrangePiPrice9 = "$20.00";
    				String expectedOrangePiPrice10 = "$25.00";
    				String expectedOrangePiPrice11 = "$12.00";
    				String expectedOrangePiPrice12 = "$8.80";
    				String expectedOrangePiPrice13 = "$45.00";
    				String expectedOrangePiPrice14 = "$24.90";
    				String expectedOrangePiPrice15 = "$9.90";
    }
    
    
	
	@Test
	void orangePiName1(Object actualOrangePiPrice1) {
		// Compares Expected to Actual 1.
		String expectedOrangePiPrice1 = "$8.50";

				if (expectedOrangePiPrice1.equals(actualOrangePiPrice1)) {
					System.out.println("Item 1 Price");
					System.out.println("PASS");
					System.out.println("Actual result is: " + actualOrangePiPrice1);
		// Print number of List Elements
					System.out.println("Expected result is: " + expectedOrangePiPrice1);
				} else {
					System.out.println("FAIL");
					System.out.println("Item 1 Price");
					System.out.println("Actual result is: " + actualOrangePiPrice1);
					System.out.println("Expected result is: " + expectedOrangePiPrice1);
				}
				System.out.println("***************************************************");
	}
	@Test
	void orangePiPrice1(Object actualOrangePiName1, Object expectedOrangePiName1) {
		// Compares Expected to Actual Price 1.
				if (expectedOrangePiName1.equals(actualOrangePiName1)) {
					System.out.println("Item 1 Name");
					System.out.println("PASS");
					System.out.println("Actual result is: " + actualOrangePiName1);
		// Print number of List Elements
					System.out.println("Expected result is: " + expectedOrangePiName1);
				} else {
					System.out.println("Item 1 Name");
					System.out.println("FAIL");

					System.out.println("Actual result is: " + actualOrangePiName1);
					System.out.println("Expected result is: " + expectedOrangePiName1);
				}
				System.out.println("***************************************************");
	}

	
	
	
	
	
	
}
