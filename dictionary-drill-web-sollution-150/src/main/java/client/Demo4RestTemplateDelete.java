package client;

import java.util.Date;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

public class Demo4RestTemplateDelete {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		System.out.println("=== CLIENT ===");

		RestTemplate rt = new RestTemplate();
		String baseUrl = "http://localhost:8080/api/dictionary";

		{

			// delete an entry
			try {
				int id = 2;
				rt.delete(baseUrl + "?entryId=" + id);
				System.out.println("deleted: " + id);

			} catch (HttpClientErrorException e) {
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
