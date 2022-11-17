package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	private List<String> words = new ArrayList<>();

	@GetMapping("/find-word")
	public String getWord(int index) {
		if (index >= 0 && index < words.size()) {
			return words.get(index);
		} else {
			return "word not found";
		}
	}

	@PostMapping("/add-word")
	public void addWord(@RequestParam String word) {
		words.add(word);
		System.out.println(words);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String helloWorld() {
		return "Hello World !";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/num")
	public int luckyNumber() {
		return (int) (Math.random() * 101);
	}

	@GetMapping("/greet")
	public String greet(@RequestParam String name) {
		return "Hello " + name;
	}

	@GetMapping("/sum")
	public int sum(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}

}
