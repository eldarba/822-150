package app.core.services;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public int sum(int a, int b) {
		return a + b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

}
