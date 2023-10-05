package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		String title = driver.getTitle();
		if(title.contains("Dashboard"));
		driver.navigate().back();
		
		
	WebElement disable= driver.findElement(By.xpath("//button[@disabled='disabled']"));
	boolean status = disable.isEnabled();
    System.out.println("The button is disabled "+status);

    WebElement position = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
    Point location = position.getLocation();
    System.out.println("position"+location);
    
     WebElement colour = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
     String bckColour = colour.getCssValue("background-color");
     System.out.println("Background Colour: "+bckColour);
     
     WebElement height = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]"));
     int hgt = height.getSize().getHeight();
     System.out.println("Height: "+hgt);
     
     WebElement width = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]"));
     int wdh = width.getSize().getWidth();
     System.out.println("Width: "+wdh);
     
     driver.close();
}
}