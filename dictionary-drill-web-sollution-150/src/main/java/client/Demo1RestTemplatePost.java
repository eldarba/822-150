package client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Entry;
import app.core.entities.Example;

public class Demo1RestTemplatePost {

	public static void main(String[] args) {
		System.out.println("=== CLIENT ===");

		RestTemplate rt = new RestTemplate();
		String baseUrl = "http://localhost:8080/api/dictionary";

		// post a request to the server to add Entry 1
		{
			List<Example> examples = new ArrayList<>();
			examples.add(new Example(0, "that cat climbed the tree", null));
			examples.add(new Example(0, "that cat drank milk", null));
			Entry entry = new Entry(0, "Cat", "a nice animal that do meow", examples);

			System.out.println(entry);
			System.out.println(entry.getExamples());
			entry = rt.postForObject(baseUrl + "/add-entry", entry, Entry.class);
			System.out.println(entry);
			System.out.println(entry.getExamples());
		}

		{
			// post a request to the server to add Entry 2
			List<Example> examples = new ArrayList<>();
			examples.add(new Example(0, "that rabbit ran around the tree", null));
			examples.add(new Example(0, "that rabbit ate carrot", null));
			Entry word = new Entry(0, "Rabbit", "a nice animal that do hops", null);
			word.setExamples(examples);

			System.out.println(word);
			System.out.println(word.getExamples());
			word = rt.postForObject(baseUrl + "/add-entry", word, Entry.class);
			System.out.println(word);
			System.out.println(word.getExamples());
		}

	}

}
