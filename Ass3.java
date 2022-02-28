package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass3 {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement elementCompanyname =driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyname.sendKeys("TestLeaf");
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Sampreeta");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sampreeta");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ISE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Working in ISE");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sampreeta.hari@gmail.com");
		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd= new Select(dropdown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement elementCompanyNameEdit =driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyNameEdit.clear();
		elementCompanyNameEdit.sendKeys("HCL");
		WebElement elementFirstNameEdit = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstNameEdit.clear();
		elementFirstNameEdit.sendKeys("Sastik");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
	}

}
