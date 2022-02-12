package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
	WebDriver driver;

	public Registration(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By RegButtion= By.xpath("/html/body/header/nav/div/div[2]/div/a[2]");
	
	public void GoToRegistrationPage() {
		driver.findElement(RegButtion).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
