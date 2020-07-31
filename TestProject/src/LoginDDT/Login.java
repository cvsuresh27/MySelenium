package LoginDDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Write code 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-Samples\\SE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/admin");
		driver.manage().window().maximize();
				//Excel file stream object
				FileInputStream file = new FileInputStream("C:\\selenium-Samples\\Excel\\SampleExcel.xlsx");
				// Excel work book object
				XSSFWorkbook wb = new XSSFWorkbook(file);
				//Excel sheet object
				XSSFSheet sh = wb.getSheet("Login"); // With sheet name
				// Row count
				int rc = sh.getLastRowNum();
				System.out.println("Ror count:"+rc);
				for (int i=0;i<=rc;i++)
				{
					XSSFRow cr = sh.getRow(i);
					String uname = cr.getCell(0).getStringCellValue();
					String pwd = cr.getCell(1).getStringCellValue();
					driver.findElement(By.name("email")).clear();
					driver.findElement(By.name("email")).sendKeys(uname);
					driver.findElement(By.name("password")).clear();
					driver.findElement(By.name("password")).sendKeys(pwd);
					Thread.sleep(3000);
					System.out.println("Username:"+uname+"\t Password:"+pwd);
					Thread.sleep(3000);
				}
				driver.findElement(By.className("resultlogin")).click();;
				driver.close();

	}

}
