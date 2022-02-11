package test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPRocess;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.opencart.com");

HomePage home= new HomePage(driver);
home.GOTOLogin();

LoginPRocess Login =new LoginPRocess(driver);


Login.EnterEmail("Kaushikdwivedi22@gmail.com");
Login.EnterPassword("Abhi@9702");
Login.ClickLogin();
//driver.quit();






}
}