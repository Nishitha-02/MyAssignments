package seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbregPage {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://en-gb.facebook.com/");
		
	//
		driver.findElement(By.linkText("Create new account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Nivetha");
        driver.findElement(By.name("lastname")).sendKeys("suresh");
        driver.findElement(By.name("reg_email__")).sendKeys("testpage@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("200202");
		//
	
        WebElement date =  driver.findElement(By.id("day"));
        Select dd_date = new Select(date);
        dd_date.selectByIndex(14);
        WebElement month = driver.findElement(By.id("month"));
        Select dd_mon = new Select(month);
        dd_mon.selectByValue("4");
        WebElement year = driver.findElement(By.id("year"));
        Select dd_year = new Select(year);
        dd_year.selectByVisibleText("2003");
		
		//
        driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        driver.close();
        
		}
		

}
