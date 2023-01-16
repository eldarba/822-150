package app.core;

import org.junit.jupiter.api.Assertions;

import app.core.services.MyService;

public class TestAdmin {

	private MyService service;

	public TestAdmin(MyService service) {
		super();
		this.service = service;
	}

	public void test1() {
		int sum = this.service.sum(5, 3);
		Assertions.assertEquals(8, sum);
	}

}
