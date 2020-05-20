import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		String title;
		System.setProperty("webdriver.chrome.driver", "/Users/dmitrynakhabtsev/Documents/wwes/Selenium/chromedriver");
		
		driver=new ChromeDriver();
		
		
		driver.get("https://kamenkaksk.wixsite.com/wwes-13-1");
		
		
		title=driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		
		String expected1="HOME";
		//String expected2="ALL PRODUCTS";
		
		String actual1=driver
				.findElement(By
						.xpath("//*[@id=\"comp-jcfv4kob0label\"]"))
				.getText();
		System.out.println("Actual result is: "+actual1);
		
		//String actual2=driver.findElement(By.xpath("")).getText();
		
		driver.close();

	}

}
