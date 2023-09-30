package seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager") ;
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("My Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select dd_ind = new Select(industry); 
		dd_ind.selectByIndex(3);
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dd_owner =new Select(ownership);
		dd_owner.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select dd_source = new Select(source);
		dd_source.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select dd_market = new Select(marketing);
		dd_market.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd_state = new Select(state);
		dd_state.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		
		

}
}