package stepDefinations;

/*import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
*/
public class EnterValuesIntoApp{
	Utilities EnerValue = new Utilities();
	public void loginApplication() {
		EnerValue.lunchAppl();	
	}
	//static WebDriver driver = new FirefoxDriver();
	//WebElement objsreach = driver.findElement(By.xpath("//div[@id='example_filter']/label/input"));
	public void EnterValuesTextBox( String objsreach,String value){
		
		EnerValue.EnterValuesInTB(objsreach, value);
				
	}
}
