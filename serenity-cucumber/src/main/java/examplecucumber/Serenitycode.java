package examplecucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import net.thucydides.core.annotations.Step;

public class Serenitycode {
	WebDriver driver;
	@Step
	public void openwebsite() {
		System.setProperty("webdriver.chrome.driver", "C://Users//t.ayyasamy//Downloads//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.thetestroom.com/jswebapp/");
		
	}
	@Step
	public void entertext() {
		driver.findElement(By.xpath("//input[@ng-model = 'person.name']")).sendKeys("yuvaraj");
		
	}
	@Step
	public void dynamictext() {
		String Text = driver.findElement(By.className("ng-binding")).getText();
		Assert.assertEquals(Text, "yuvaraj");
	}
	@Step
	public void clickbuttonone() {
		driver.findElement(By.id("continue_button")).click();
		
	}
	@Step
	public void selectdrop() {
		Select Drop = new Select(driver.findElement(By.xpath("//select[@ng-model = 'animal']")));
		   Drop.selectByIndex(1);
		
	}
	@Step
	public void clickbuttontwo() {
		driver.findElement(By.id("continue_button")).click();
		
	}
	@Step
	public void asserturl() {
		String URLtext = driver.findElement(By.id("title")).getText();
		Assert.assertEquals(URLtext, "Thank you");
		driver.close();
	}

}
