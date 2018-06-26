package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Usama\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
			
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("usama.se15@iba-suk.edu.pk");
			System.out.println("UserName");
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
			System.out.println("Clicked on next");
			for(int i=0;i<=4;i++) {
				Thread.sleep(5000);
			
			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("IncorrectPassword");
			System.out.println("Password .....");
			
			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
			System.out.println("Clicked on next");
			Thread.sleep(5000);
			System.out.println("Login Successfully");	
			
			driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
			System.out.println("Clicked on Icon");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
			System.out.println("Lgout");
			}
			//driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error . . . "+e);
		}
	}

}
