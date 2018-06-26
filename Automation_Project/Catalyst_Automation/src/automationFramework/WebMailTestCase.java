package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMailTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Usama\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.binaryvibes.com:2095/");
			
			driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("mohammad.usama@binaryvibes.com");
			System.out.println("UserName");
			
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("IncorrectPassword");
			System.out.println("Password .....");
			
			driver.findElement(By.xpath("//*[@id=\"login_submit\"]")).click();
			System.out.println("Login Succesfully");
			
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[@id=\"lblLogout\"]")).click();
			System.out.println("Lgout");
			
			//driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error . . . "+e);
		}
	}

}
