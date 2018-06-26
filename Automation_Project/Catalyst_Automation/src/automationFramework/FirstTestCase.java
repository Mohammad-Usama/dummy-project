package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Usama\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://192.168.0.16:2222/#/login/signin");
			
			driver.findElement(By.id("theFieldID")).sendKeys("superadmin@catalyst.com");
			System.out.println("UserName");
			
			driver.findElement(By.name("password")).sendKeys("1234");
			System.out.println("Password .....");
			
			driver.findElement(By.xpath("//*[@id=\"theFormID\"]/fieldset/div[5]/div/div[2]/input")).click();
			System.out.println("Login Succesfully");
			
			Thread.sleep(5000);
			
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error . . . "+e);
		}
	}

}
