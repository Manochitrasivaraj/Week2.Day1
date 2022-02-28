package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Eclipse\\Eclipse-Workspace\\Feb Batch\\LearnSelenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementCRM = driver.findElement(By.linkText("CRM/SFA"));
		elementCRM.click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mano");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chitra");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Manochitra");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ISE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Working in ISE");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manochitra.siva@gmail.com");
		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd= new Select(dropdown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
	}

}
