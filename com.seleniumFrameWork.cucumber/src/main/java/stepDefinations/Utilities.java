package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {
	
	static WebDriver driver = new FirefoxDriver();
	//DefaultProperties defualtPorperties = new DefaultProperties(); 
	LoginStepDefination stepDef = new LoginStepDefination();
	public void lunchAppl() {
		//userUrl.UserUrlStepDef
		String applUrl = stepDef.UserUrlStepDef;
		driver.get("http://www.seleniumeasy.com/test/table-data-download-demo.html");
		
	}
	public void EnterValuesInTB(String objsreach, String value){
		driver.findElement(By.xpath(objsreach)).sendKeys(value);
		
	}
	
}
