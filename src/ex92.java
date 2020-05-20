import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex92 {
	public static void main(String[] args) throws InterruptedException {

//ChromeDriver is a separate executable that Selenium WebDriver uses to control Chrome.
		System.setProperty("webdriver.chrome.driver", "/Users/dmitrynakhabtsev/Documents/wwes/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		Thread.sleep(1000);


		String expected1 = "HOME";
		String expected2 = "ALL PRODUCTS";

		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob0label\"]")).click();
		String actualTitle1 = driver.getTitle();
		String actualUrl1 = driver.getCurrentUrl();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		String actualTitle2 = driver.getTitle();
		String actualUrl2 = driver.getCurrentUrl();

		// Test Case 001- verification 1st main menu tab TITLE
		System.out.println("Test Case 001- verification 1st main menu tab TITLE");
		if (expected1.equals(actualTitle1)) {
			System.out.println("PASS");
			System.out.println("Actual result is: " + actualTitle1);
			System.out.println("Expected result is: " + expected1);
		} else {
			System.out.println("FAIL");
			System.out.println("Actual result is: " + actualTitle1);
			System.out.println("Expected result is: " + expected1);
		}
		System.out.println("**************************************************");

		driver.close();
	}
}
