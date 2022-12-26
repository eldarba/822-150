package client;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Entry;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println("=== CLIENT ===");

		RestTemplate rt = new RestTemplate();
		String baseUrl = "http://localhost:8080/api/dictionary";

		try {
			Entry entry = rt.getForObject(baseUrl + "/get-entry?entryId=10", Entry.class);
			System.out.println(entry);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
