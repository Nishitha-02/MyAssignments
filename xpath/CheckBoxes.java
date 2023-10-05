package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxes {

	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		 WebElement message = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		 boolean msg = message.isDisplayed();
		 System.out.println("expected message is displayed: "+msg);
		 
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		WebElement output = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		boolean msg_opt = output.isDisplayed();
		System.out.println("expected message is displayed: "+msg_opt);
		
        WebElement btn_check = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
        boolean unselect = btn_check.isEnabled();
        System.out.println("The checkbox is disabled: "+unselect);
        	
       driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
       driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-icon-blank']/parent::div")).click();
       driver.close();
}
}