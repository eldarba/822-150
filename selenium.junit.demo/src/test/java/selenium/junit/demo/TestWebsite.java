package selenium.junit.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestWebsite {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	@Order(1)
	void test1() {
		System.out.println("test 1");
		driver.get("http://127.0.0.1:5500/index.html");
		String expectedTitle = "Eldar's Website 1";	
		String actualTitle = driver.getTitle();
		String errorMsg = "wrong page title";
		// JUnit test:
		Assertions.assertEquals(expectedTitle, actualTitle, errorMsg);
	}
	
	@Test
	@Order(2)
	void test2() {
		System.out.println("test 2");
	}

}
