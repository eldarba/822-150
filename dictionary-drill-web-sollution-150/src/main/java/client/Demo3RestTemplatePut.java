package client;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.core.entities.Entry;
import app.core.entities.Example;
import lombok.Data;

public class Demo3RestTemplatePut {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		System.out.println("=== CLIENT ===");

		RestTemplate rt = new RestTemplate();
		String baseUrl = "http://localhost:8080/api/dictionary";

		{

			try {
				// fetch for entry
				ResponseEntity<Entry> responseEntity = rt.getForEntity(baseUrl + "/entry?entryId=2", Entry.class);
				System.out.println(responseEntity.getStatusCode());
				Entry entry = responseEntity.getBody();
				entry.setDefinition(entry.getDefinition() + " ---|");
				entry.setWord(entry.getWord() + " ---|");
				entry.addExample(new Example(0, "this is a new example", null));

				// update entry
				rt.put(baseUrl, entry);
				System.out.println("updated to: " + entry);

			} catch (HttpClientErrorException e) {
				// use jackson to parse json error to java object
				ObjectMapper objectMapper = new ObjectMapper();
				Error err = objectMapper.readValue(e.getResponseBodyAsString(), Error.class);
				System.out.println("timestamp: " + err.timestamp);
				System.out.println("status: " + err.status);
				System.out.println("error: " + err.error);
				System.out.println("message: " + err.message);
				System.out.println("path: " + err.path);
			}

		}

	}

	@Data
	static class Error {
		Date timestamp;
		int status;
		String error;
		String message;
		String path;
	}

}
