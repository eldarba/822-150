package selenium.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		// open the chosen browser
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("http://www.google.com");
		driver.get("http://127.0.0.1:5500/index.html");
		
		// get the page title
		String title = driver.getTitle();
		System.out.println(title);
		
		TimeUnit.SECONDS.sleep(1);
		// to click the button we need a reference to it
		WebElement bt = driver.findElement(By.id("bt-title"));
		bt.click();

		TimeUnit.SECONDS.sleep(1);
		// enter text to input
		WebElement input = driver.findElement(By.tagName("input"));
		input.sendKeys("this text is from selenium");


		TimeUnit.SECONDS.sleep(1);
		// enter text to input
		List<WebElement> allInputs = driver.findElements(By.tagName("input"));
		allInputs.get(0).clear();
		allInputs.get(1).sendKeys("Eldar");
		allInputs.get(2).sendKeys("eldar@mail");

		TimeUnit.SECONDS.sleep(1);
		allInputs.get(0).sendKeys("Welcome");
		bt.click();
		
		TimeUnit.SECONDS.sleep(1);
		WebElement element = driver.findElement(By.id("colors"));
		Select select = new Select(element);
		select.selectByValue("green");

		TimeUnit.SECONDS.sleep(1);
		WebElement tvCheckBox = driver.findElement(By.id("tv"));
		tvCheckBox.click();
		
		TimeUnit.SECONDS.sleep(20);
		driver.quit();
		

	}

}
