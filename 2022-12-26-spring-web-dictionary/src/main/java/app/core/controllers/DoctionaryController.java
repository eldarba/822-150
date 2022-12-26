package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Entry;
import app.core.entities.Example;
import app.core.exceptions.DictionaryException;
import app.core.services.DictionaryService;

@RestController
@RequestMapping("/api/dictionary")
public class DoctionaryController {

	@Autowired
	private DictionaryService dictionaryService;

	@PostMapping("/add-entry")
	public Entry addEntry(@RequestBody Entry entry) {
		try {
			return this.dictionaryService.addEntry(entry);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	// http://localhost:8080/api/dictionary/get-entry?entryId=101
	@GetMapping("/get-entry")
	public Entry getEntryById(@RequestParam int entryId) {
		try {
			return this.dictionaryService.getEntryById(entryId);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	// http://localhost:8080/api/dictionary/get-entry-examples/101
	@GetMapping("/get-entry-examples/{entryId}")
	public List<Example> getAllEntryExamples(@PathVariable int entryId) {
		return this.dictionaryService.getAllEntryExamples(entryId);
	}

	// http://localhost:8080/api/dictionary
	@PutMapping
	public Entry updateEntry(@RequestBody Entry entry) {
		try {
			return this.dictionaryService.updateEntry(entry);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	// http://localhost:8080/api/dictionary
	@DeleteMapping
	public void deleteEntry(int entryId) {
		try {
			this.dictionaryService.deleteEntry(entryId);
		} catch (DictionaryException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

}
