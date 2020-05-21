import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnit95 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

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

// Compares Expected to Actual 1.

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

// Compares Expected to Actual 2.

		if (expectedOrangePiPrice2.equals(actualOrangePiPrice2)) {
			System.out.println("Item 2 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice2);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice2);
		} else {
			System.out.println("Item 2 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice2);
			System.out.println("Expected result is: " + expectedOrangePiPrice2);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 2.
		if (expectedOrangePiName2.equals(actualOrangePiName2)) {
			System.out.println("Item 2 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName2);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName2);
		} else {
			System.out.println("Item 2 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName2);
			System.out.println("Expected result is: " + expectedOrangePiName2);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 3.

		if (expectedOrangePiPrice3.equals(actualOrangePiPrice3)) {
			System.out.println("Item 3 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice3);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice3);
		} else {
			System.out.println("Item 3 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice3);
			System.out.println("Expected result is: " + expectedOrangePiPrice3);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 3.
		if (expectedOrangePiName3.equals(actualOrangePiName3)) {
			System.out.println("Item 3 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName3);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName3);
		} else {
			System.out.println("Item 3 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName3);
			System.out.println("Expected result is: " + expectedOrangePiName3);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 4.

		if (expectedOrangePiPrice4.equals(actualOrangePiPrice4)) {
			System.out.println("Item 4 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice4);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice4);
		} else {
			System.out.println("Item 4 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice4);
			System.out.println("Expected result is: " + expectedOrangePiPrice4);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 4.
		if (expectedOrangePiName4.equals(actualOrangePiName4)) {
			System.out.println("Item 4 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName4);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName4);
		} else {
			System.out.println("Item 4 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName4);
			System.out.println("Expected result is: " + expectedOrangePiName4);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 5.

		if (expectedOrangePiPrice5.equals(actualOrangePiPrice5)) {
			System.out.println("Item 5 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice5);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice5);
		} else {
			System.out.println("Item 5 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice5);
			System.out.println("Expected result is: " + expectedOrangePiPrice5);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 5.
		if (expectedOrangePiName5.equals(actualOrangePiName5)) {
			System.out.println("Item 5 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName5);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName5);
		} else {
			System.out.println("Item 5 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName5);
			System.out.println("Expected result is: " + expectedOrangePiName5);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 6.

		if (expectedOrangePiPrice6.equals(actualOrangePiPrice6)) {
			System.out.println("Item 6 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice6);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice6);
		} else {
			System.out.println("Item 6 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice6);
			System.out.println("Expected result is: " + expectedOrangePiPrice6);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 6.
		if (expectedOrangePiName6.equals(actualOrangePiName6)) {
			System.out.println("Item 6 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName6);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName6);
		} else {
			System.out.println("Item 6 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName6);
			System.out.println("Expected result is: " + expectedOrangePiName6);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 7.

		if (expectedOrangePiPrice7.equals(actualOrangePiPrice7)) {
			System.out.println("Item 7 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice7);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice7);
		} else {
			System.out.println("Item 7 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice7);
			System.out.println("Expected result is: " + expectedOrangePiPrice7);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 7.
		if (expectedOrangePiName7.equals(actualOrangePiName7)) {
			System.out.println("Item 7 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName7);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName7);
		} else {
			System.out.println("Item 7 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName7);
			System.out.println("Expected result is: " + expectedOrangePiName7);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 8.

		if (expectedOrangePiPrice8.equals(actualOrangePiPrice8)) {
			System.out.println("Item 8 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice8);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice8);
		} else {
			System.out.println("Item 8 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice8);
			System.out.println("Expected result is: " + expectedOrangePiPrice8);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 8.
		if (expectedOrangePiName8.equals(actualOrangePiName8)) {
			System.out.println("Item 8 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName8);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName8);
		} else {
			System.out.println("Item 8 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName8);
			System.out.println("Expected result is: " + expectedOrangePiName8);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 9.

		if (expectedOrangePiPrice9.equals(actualOrangePiPrice9)) {
			System.out.println("Item 9 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice9);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice9);
		} else {
			System.out.println("Item 9 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice9);
			System.out.println("Expected result is: " + expectedOrangePiPrice9);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 9.
		if (expectedOrangePiName9.equals(actualOrangePiName9)) {
			System.out.println("Item 9 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName9);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName9);
		} else {
			System.out.println("Item 9 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName9);
			System.out.println("Expected result is: " + expectedOrangePiName9);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 10.

		if (expectedOrangePiPrice10.equals(actualOrangePiPrice10)) {
			System.out.println("Item 10 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice10);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice10);
		} else {
			System.out.println("Item 10 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice10);
			System.out.println("Expected result is: " + expectedOrangePiPrice10);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 10.
		if (expectedOrangePiName10.equals(actualOrangePiName10)) {
			System.out.println("Item 10 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName10);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName10);
		} else {
			System.out.println("Item 10 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName10);
			System.out.println("Expected result is: " + expectedOrangePiName10);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 11.

		if (expectedOrangePiPrice11.equals(actualOrangePiPrice11)) {
			System.out.println("Item 11 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice11);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice11);
		} else {
			System.out.println("Item 11 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice11);
			System.out.println("Expected result is: " + expectedOrangePiPrice11);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 11.
		if (expectedOrangePiName11.equals(actualOrangePiName11)) {
			System.out.println("Item 11 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName11);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName11);
		} else {
			System.out.println("Item 11 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName11);
			System.out.println("Expected result is: " + expectedOrangePiName11);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 12.

		if (expectedOrangePiPrice12.equals(actualOrangePiPrice12)) {
			System.out.println("Item 12 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice12);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice12);
		} else {
			System.out.println("Item 12 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice12);
			System.out.println("Expected result is: " + expectedOrangePiPrice12);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 12.
		if (expectedOrangePiName12.equals(actualOrangePiName12)) {
			System.out.println("Item 12 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName12);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName12);
		} else {
			System.out.println("Item 12 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName12);
			System.out.println("Expected result is: " + expectedOrangePiName12);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 13.

		if (expectedOrangePiPrice13.equals(actualOrangePiPrice13)) {
			System.out.println("Item 13 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice13);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice13);
		} else {
			System.out.println("Item 13 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice13);
			System.out.println("Expected result is: " + expectedOrangePiPrice13);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 13.
		if (expectedOrangePiName13.equals(actualOrangePiName13)) {
			System.out.println("Item 13 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName13);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName13);
		} else {
			System.out.println("Item 13 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName13);
			System.out.println("Expected result is: " + expectedOrangePiName13);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 14.

		if (expectedOrangePiPrice14.equals(actualOrangePiPrice14)) {
			System.out.println("Item 14 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice14);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice14);
		} else {
			System.out.println("Item 14 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice14);
			System.out.println("Expected result is: " + expectedOrangePiPrice14);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 14.
		if (expectedOrangePiName14.equals(actualOrangePiName14)) {
			System.out.println("Item 14 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName14);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName14);
		} else {
			System.out.println("Item 14 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName14);
			System.out.println("Expected result is: " + expectedOrangePiName14);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual 15.

		if (expectedOrangePiPrice15.equals(actualOrangePiPrice15)) {
			System.out.println("Item 15 Price");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiPrice15);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiPrice15);
		} else {
			System.out.println("Item 15 Price");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiPrice15);
			System.out.println("Expected result is: " + expectedOrangePiPrice15);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price 15.
		if (expectedOrangePiName15.equals(actualOrangePiName15)) {
			System.out.println("Item 15 Name");
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualOrangePiName15);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedOrangePiName15);
		} else {
			System.out.println("Item 15 Name");
			System.out.println("FAIL");

			System.out.println("Actual result is: " + actualOrangePiName15);
			System.out.println("Expected result is: " + expectedOrangePiName15);
		}
		System.out.println("***************************************************");
//********************************************************************ORANGEPI**********************************************************************************

		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[25]/label/span"))
				.click();
		Thread.sleep(2000);

// ********************************************************************RASPBERRYPI******************************************************************************
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[30]/label/span"))
				.click();
		Thread.sleep(2000);

// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> AllRaspberryPi = driver.findElements(By.className("_2BULo"));

// System.out.println("AllRaspberryPi all-products quantity " +
// (AllRaspberryPi.size()));

		Thread.sleep(2500);

// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> AllRaspberryPiPrice = driver.findElements(By.className("_23ArP"));

// place expected and actual Names into value into strings.

		String actualRaspberryPiName1 = AllRaspberryPi.get(0).getText();
		String actualRaspberryPiName2 = AllRaspberryPi.get(1).getText();
		String actualRaspberryPiName3 = AllRaspberryPi.get(2).getText();
		String actualRaspberryPiName4 = AllRaspberryPi.get(3).getText();

		String actualRaspberryPiPrice1 = AllRaspberryPiPrice.get(0).getText();
		String actualRaspberryPiPrice2 = AllRaspberryPiPrice.get(1).getText();
		String actualRaspberryPiPrice3 = AllRaspberryPiPrice.get(2).getText();
		String actualRaspberryPiPrice4 = AllRaspberryPiPrice.get(3).getText();

// add expected result
		String expectedRaspberryPiName1 = "Raspberry Pi 3 Model B+";
		String expectedRaspberryPiName2 = "Raspberry Pi 3 Model B";
		String expectedRaspberryPiName3 = "Raspberry Pi Zero W / Zero WH";
		String expectedRaspberryPiName4 = "Raspberry Pi Zero";

		String expectedRaspberryPiPrice1 = "$30.00";
		String expectedRaspberryPiPrice2 = "$30.00";
		String expectedRaspberryPiPrice3 = "$10.00";
		String expectedRaspberryPiPrice4 = "$5.00";

// Compares Expected to Actual Name1.

		if (expectedRaspberryPiPrice1.equals(actualRaspberryPiPrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiPrice1);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiPrice1);
			System.out.println("Expected result is: " + expectedRaspberryPiPrice1);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price1.
		if (expectedRaspberryPiName1.equals(actualRaspberryPiName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiName1);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiName1);
			System.out.println("Expected result is: " + expectedRaspberryPiName1);
		}
		System.out.println("***************************************************");

// ********2

// Compares Expected to Actual Price 2.
		if (expectedRaspberryPiPrice2.equals(actualRaspberryPiPrice2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiPrice2);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiPrice2);
			System.out.println("Expected result is: " + expectedRaspberryPiPrice2);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Name 2.
		if (expectedRaspberryPiName2.equals(actualRaspberryPiName2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiName2);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiName2);
			System.out.println("Expected result is: " + expectedRaspberryPiName2);
		}
		System.out.println("***************************************************");

// ********3

// Compares Expected to Actual Price 3.
		if (expectedRaspberryPiPrice3.equals(actualRaspberryPiPrice3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiPrice3);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiPrice3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiPrice3);
			System.out.println("Expected result is: " + expectedRaspberryPiPrice3);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Name 3.
		if (expectedRaspberryPiName3.equals(actualRaspberryPiName3)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiName3);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiName3);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiName3);
			System.out.println("Expected result is: " + expectedRaspberryPiName3);
		}
		System.out.println("***************************************************");

// ********4

// Compares Expected to Actual Price 4.
		if (expectedRaspberryPiPrice4.equals(actualRaspberryPiPrice4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiPrice4);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiPrice4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiPrice4);
			System.out.println("Expected result is: " + expectedRaspberryPiPrice4);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Name 3.
		if (expectedRaspberryPiName4.equals(actualRaspberryPiName4)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualRaspberryPiName4);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedRaspberryPiName4);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualRaspberryPiName4);
			System.out.println("Expected result is: " + expectedRaspberryPiName4);
		}
		System.out.println("***************************************************");
// ********************************************************************RASPBERRYPI******************************************************************************
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[30]/label/span"))
				.click();
		Thread.sleep(2000);
// ********************************************************************PICOPI**********************************************************************
// Driver Selects "Brand" PICOPi
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[28]/label/span"))
				.click();
		Thread.sleep(2000);

// Load more
// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Pico = driver.findElements(By.className("_2BULo"));

// System.out.println("Pico all-products quantity " +
// (Pico.size()));

// Thread.sleep(2500);

// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> PicoPrice = driver.findElements(By.className("_23ArP"));

// place expected and actual Names into value into strings.

		String actualPicoPiName1 = Pico.get(0).getText();
		String actualPicoPiName2 = Pico.get(1).getText();
// String actualPicoPiName3 = Pico.get(2).getText();
// String actualPicoPiName4 = Pico.get(3).getText();

		String actualPicoPiPrice1 = PicoPrice.get(0).getText();
		String actualPicoPiPrice2 = PicoPrice.get(1).getText();
// String actualPicoPiPrice3 = PicoPrice.get(2).getText();
// String actualPicoPiPrice4 = PicoPrice.get(3).getText();

// add expected result
		String expectedPicoPiName1 = "PICO-PI-IMX7";
		String expectedPicoPiName2 = "PICO-PI-IMX6UL";
// String expectedPicoPiName3 = "Pico Zero W / Zero WH";
// String expectedPicoPiName4 = "Pico Zero";

		String expectedPicoPiPrice1 = "$79.00";
		String expectedPicoPiPrice2 = "$69.00";
// String expectedPicoPiPrice3 = "$10.00";
// String expectedPicoPiPrice4 = "$5.00";

// Compares Expected to Actual Name 1.

		if (expectedPicoPiPrice1.equals(actualPicoPiPrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiPrice1);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiPrice1);
			System.out.println("Expected result is: " + expectedPicoPiPrice1);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price1.
		if (expectedPicoPiName1.equals(actualPicoPiName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiName1);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiName1);
			System.out.println("Expected result is: " + expectedPicoPiName1);
		}
		System.out.println("***************************************************");

// ********2

// Compares Expected to Actual Price 2.
		if (expectedPicoPiPrice2.equals(actualPicoPiPrice2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiPrice2);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiPrice2);
			System.out.println("Expected result is: " + expectedPicoPiPrice2);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Name 2.
		if (expectedPicoPiName2.equals(actualPicoPiName2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPicoPiName2);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPicoPiName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPicoPiName2);
			System.out.println("Expected result is: " + expectedPicoPiName2);
		}
		System.out.println("***************************************************");

// ********************************************************************PICOPI**********************************************************************

// Driver deselects Privious selection
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[28]/label/span"))
				.click();
		Thread.sleep(2000);

// ********************************************************************PINE**********************************************************************
// Driver Selects "Brand" Pine

		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[29]/label/span"))
				.click();
		Thread.sleep(2000);

// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Pine = driver.findElements(By.className("_2BULo"));

// System.out.println("Pine all-products quantity " +
// (Pine.size()));

// Thread.sleep(2500);

// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> PinePrice = driver.findElements(By.className("_23ArP"));

// place expected and actual Names into value into strings.

		String actualPineName1 = Pine.get(0).getText();
		String actualPineName2 = Pine.get(1).getText();
// String actualPineName3 = Pine.get(2).getText();
// String actualPineName4 = Pine.get(3).getText();

		String actualPinePrice1 = PinePrice.get(0).getText();
		String actualPinePrice2 = PinePrice.get(1).getText();
// String actualPinePrice3 = PinePrice.get(2).getText();
// String actualPinePrice4 = PinePrice.get(3).getText();

// add expected result
		String expectedPineName1 = "Pine H64";
		String expectedPineName2 = "Pine A64 / A64-LTS";
// String expectedPineName3 = "Pine Zero W / Zero WH";
// String expectedPineName4 = "Pine Zero";

		String expectedPinePrice1 = "$26.00";
		String expectedPinePrice2 = "$15.00";
// String expectedPinePrice3 = "$10.00";
// String expectedPinePrice4 = "$5.00";

// Compares Expected to Actual Name 1.

		if (expectedPinePrice1.equals(actualPinePrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPinePrice1);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPinePrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPinePrice1);
			System.out.println("Expected result is: " + expectedPinePrice1);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price1.
		if (expectedPineName1.equals(actualPineName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPineName1);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPineName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPineName1);
			System.out.println("Expected result is: " + expectedPineName1);
		}
		System.out.println("***************************************************");

// ********2

// Compares Expected to Actual Price 2.
		if (expectedPinePrice2.equals(actualPinePrice2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPinePrice2);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPinePrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPinePrice2);
			System.out.println("Expected result is: " + expectedPinePrice2);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Name 2.
		if (expectedPineName2.equals(actualPineName2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPineName2);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPineName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPineName2);
			System.out.println("Expected result is: " + expectedPineName2);
		}
		System.out.println("***************************************************");

// ********************************************************************PINE**********************************************************************

		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[29]/label/span"))
				.click();
		Thread.sleep(2000);

// ********************************************************************PEPPER**********************************************************************

// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[27]/label/span"))
				.click();
		Thread.sleep(2000);

// Load more
// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Pepper = driver.findElements(By.className("_2BULo"));

// System.out.println("Pepper all-products quantity " +
// (Pepper.size()));

// Thread.sleep(2500);

// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> PepperPrice = driver.findElements(By.className("_23ArP"));

// place expected and actual Names into value into strings.

		String actualPepperName1 = Pepper.get(0).getText();
		String actualPepperName2 = Pepper.get(1).getText();
// String actualPepperName3 = Pepper.get(2).getText();
// String actualPepperName4 = Pepper.get(3).getText();

		String actualPepperPrice1 = PepperPrice.get(0).getText();
		String actualPepperPrice2 = PepperPrice.get(1).getText();
// String actualPepperPrice3 = PepperPrice.get(2).getText();
// String actualPepperPrice4 = PepperPrice.get(3).getText();

// add expected result
		String expectedPepperName1 = "Pepper DVI-D";
		String expectedPepperName2 = "Pepper 43R / 43C";
// String expectedPepperName3 = "Pepper Zero W / Zero WH";
// String expectedPepperName4 = "Pepper Zero";

		String expectedPepperPrice1 = "$119.00";
		String expectedPepperPrice2 = "$169.00";
// String expectedPepperPrice3 = "$10.00";
// String expectedPepperPrice4 = "$5.00";

// Compares Expected to Actual Name 1.

		if (expectedPepperPrice1.equals(actualPepperPrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperPrice1);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperPrice1);
			System.out.println("Expected result is: " + expectedPepperPrice1);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price1.
		if (expectedPepperName1.equals(actualPepperName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperName1);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperName1);
			System.out.println("Expected result is: " + expectedPepperName1);
		}
		System.out.println("***************************************************");

// ********2

// Compares Expected to Actual Price 2.
		if (expectedPepperPrice2.equals(actualPepperPrice2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperPrice2);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperPrice2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperPrice2);
			System.out.println("Expected result is: " + expectedPepperPrice2);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Name 2.
		if (expectedPepperName2.equals(actualPepperName2)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualPepperName2);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedPepperName2);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualPepperName2);
			System.out.println("Expected result is: " + expectedPepperName2);
		}
		System.out.println("***************************************************");
// ********************************************************************PEPPER**********************************************************************

		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[27]/label/span"))
				.click();
		Thread.sleep(2000);

// ********************************************************************PARALLELLA**********************************************************************

// Driver Selects which "Brand" is needed
		driver.findElement(By.xpath(
				"//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[26]/label/span"))
				.click();
		Thread.sleep(2000);

// Load more
// driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/div/section/div/button")).click();

		Thread.sleep(4000);

// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> Parallella = driver.findElements(By.className("_2BULo"));

// System.out.println("Parallella all-products quantity " +
// (Parallella.size()));

// Thread.sleep(2500);

// Find all elements with class named "_2BULo" and put them in a list.
		List<WebElement> ParallellaPrice = driver.findElements(By.className("_23ArP"));

// place expected and actual Names into value into strings.

		String actualParallellaName1 = Parallella.get(0).getText();
// String actualParallellaName2 = Parallella.get(1).getText();
// String actualParallellaName3 = Parallella.get(2).getText();
// String actualParallellaName4 = Parallella.get(3).getText();

		String actualParallellaPrice1 = ParallellaPrice.get(0).getText();
// String actualParallellaPrice2 = ParallellaPrice.get(1).getText();
// String actualParallellaPrice3 = ParallellaPrice.get(2).getText();
// String actualParallellaPrice4 = ParallellaPrice.get(3).getText();

// add expected result
		String expectedParallellaName1 = "Parallella";
// String expectedParallellaName2 = "Parallella 43R / 43C";
// String expectedParallellaName3 = "Parallella Zero W / Zero WH";
// String expectedParallellaName4 = "Parallella Zero";

		String expectedParallellaPrice1 = "$128.00";
// String expectedParallellaPrice2 = "$169.00";
// String expectedParallellaPrice3 = "$10.00";
// String expectedParallellaPrice4 = "$5.00";

// Compares Expected to Actual Name 1.

		if (expectedParallellaPrice1.equals(actualParallellaPrice1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualParallellaPrice1);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedParallellaPrice1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualParallellaPrice1);
			System.out.println("Expected result is: " + expectedParallellaPrice1);
		}
		System.out.println("***************************************************");

// Compares Expected to Actual Price1.
		if (expectedParallellaName1.equals(actualParallellaName1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualParallellaName1);
// Print number of List Elements
			System.out.println("Expected result is: " + expectedParallellaName1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualParallellaName1);
			System.out.println("Expected result is: " + expectedParallellaName1);
		}
		System.out.println("***************************************************");

// ********************************************************************PARALLELLA**********************************************************************

// Press Command+Shift+F to even-out text
// Double click word to highlight
// Command+F to replace all words

		driver.quit();
	}
// SALE original price class="_23IPr">
// SALE discount price class="_23ArP">
	
// all products        class="_23ArP">	
	
	
	
// //*[@id="comp-jcoi1bzo"]/div/div/div/div/section/div/ul/li[1]/div/a/div[1]/span
	// //*[@id="comp-jcoi1bzo"]/div/div/div/div/section/div/ul/li[3]/div/a/div[1]/span
}
