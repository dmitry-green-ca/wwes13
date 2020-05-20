import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex93 {
	public static void main(String[] args) throws InterruptedException {

//ChromeDriver is a separate executable that Selenium WebDriver uses to control Chrome.
		System.setProperty("webdriver.chrome.driver", "/Users/dmitrynakhabtsev/Documents/wwes/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String expected2 = "ALL PRODUCTS";

		driver.findElement(By.xpath("//*[@id=\"comp-jcfv4kob1label\"]")).click();
		Thread.sleep(2000);		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[4]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/aside/section/ul/li[3]/button/span[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"TPASection_jcfu7llo\"]/div/div/div/aside/section/ul/li[3]/div/div/div/ul/li[2]/label/span")).click();
		Thread.sleep(2000);
		
		System.out.println("click by brand");
		System.out.println("***************************");		
		
		
		
		
		
		
		
		
		
		
		
		List<WebElement> All_product = driver.findElements(By.className("_2BULo"));
		System.out.println("Arduino all-products " + (All_product.size()));
		
		int actualTotalNumbers=All_product.size();
		System.out.println(actualTotalNumbers);
		
		
		
		System.out.println("***************************");		
		System.out.println("Arduino items names:");
		System.out.println();	
		
		for (int i=0;i<All_product.size();i++){
		System.out.println(All_product.get(i).getText());
		}

		

		driver.close();
	}
}
