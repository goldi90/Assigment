package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	WebDriver driver;

	public Registration(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By RegButtion= By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a");
	
	public void clickRegister() {
		driver.findElement(RegButtion).click();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
