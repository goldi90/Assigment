package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver;

/// Cunstructor  that   wll be called as soon as the object of the Class is created
public HomePage(WebDriver driver) {
	super();
	this.driver = driver;
}

By LoginBtn =By.xpath("/html/body/header/nav/div/div[2]/div/a[1]");
public void GOTOLogin() {
	// TODO Auto-generated constructor stub
	driver.findElement(LoginBtn).click();
	
}


}
