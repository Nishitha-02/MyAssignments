package xpath;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		 
		driver.manage().window().maximize();
		driver.findElement(By.xpath(" //input[@name='j_idt87:console1']/following::span")).click();
		
		driver.findElement(By.xpath("//input[@value='Chennai']/following::span")).click();
		//click again for unselected
		driver.findElement(By.xpath("//input[@value='Chennai']/following::span")).click();

		WebElement unselect = driver.findElement(By.xpath("//input[@value='Chennai']/following::span"));
		boolean button = unselect.isSelected();
		System.out.println("The radio button is unselected: "+button);
		
		WebElement select = driver.findElement(By.xpath("//input[@value='Option3']/following::span"));
		boolean sel_button = select.isEnabled();
		System.out.println("The default select radio button: "+sel_button);
		
		WebElement age = driver.findElement(By.xpath("//input[@value='21-40 Years']/following::span"));
		boolean age_group = age.isSelected();
		System.out.println("select the age group: "+age_group);
	}

}
