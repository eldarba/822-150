package app.core;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import app.core.services.MyService;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class JunitDemoTestsApplicationTests {

	@Autowired
	private MyService myService;

	@BeforeAll
	public static void initTest() {
		System.out.println("==== START OF TESTS ===");
	}

	@BeforeEach
	public void beforeEachTest() {
		System.out.println(">>> about to start a test");
	}

	@AfterEach
	public void afterEachTest() {
		System.out.println("!!!!!! a test just ended");
	}

	@AfterAll
	public static void endTest() {
		System.out.println("==== END OF TESTS ===");
	}

	@Test
	@Order(1)
	void test1() {
		System.out.println("========= starting test 1");
		int a = 5, b = 8, sum = a + b;
		Assertions.assertEquals(sum, this.myService.sum(a, b));
	}

	@Test
	@Order(2)
	void test2() {
		System.out.println("========= starting test 2");
		int a = 5, b = 8, mul = a * b;
		Assertions.assertEquals(mul, this.myService.mul(a, b));
	}

	@Test
	@Order(3)
	void test3() {
		System.out.println("========= starting test 3");

		Assertions.assertThrows(ArithmeticException.class, () -> {
			this.myService.div(10, 0);
		});

		int a = 5, b = 8, div = a / b;
		Assertions.assertEquals(div, this.myService.div(a, b));
	}

	@Test
	@Order(4)
	public void adminTest() {
		System.out.println("==== starting the ADMIN TEST");
		TestAdmin admin = new TestAdmin(myService);
		admin.test1();
	}

}
