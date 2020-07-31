package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGmail {

	public static void main(String[] args) throws InterruptedException {
		// Write code
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-Samples\\SE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("cv.suresh.ande@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(3000);
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test got Successfully executed...");
		}
		else
		{
			System.out.println("Test gor Failed...");
		}
	}

}
