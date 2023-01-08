package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.services.UtilService;

@RestController
@RequestMapping("/api/dictionary/util")
public class UtilController {

	@Autowired
	private UtilService utilService;

	@DeleteMapping
	public String clearTables() {
		this.utilService.clearTables();
		return "tables cleared";
	}

}
