package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPRocess;
import pages.Registration;

public class Test {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.opencart.com/");

	
HomePage home= new HomePage(driver);
home.MaxmizeWindows();
home.GOTOMyProfile();
home.SignInButton();

 
LoginPRocess Login =new LoginPRocess(driver);
home.GOTOMyProfile();
Login.clickRegister();

//Login.EnterEmail("Kaushikdwivedi22@gmail.com");
//Login.EnterPassword("Abhi@9702");
//Login.ClickLogin(); 
//driver.quit();

Registration RegrtationButtionClick =new  Registration(driver);
RegrtationButtionClick.GoToRegistrationPage();

 









}
}