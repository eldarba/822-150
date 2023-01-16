package app.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.repositories.UtilRepo;

@Service
@Transactional
public class UtilService {

	@Autowired
	private UtilRepo utilRepo;

	public void clearTables() {
		utilRepo.clearExampleTable();
		utilRepo.clearEntryTable();
	}

}
