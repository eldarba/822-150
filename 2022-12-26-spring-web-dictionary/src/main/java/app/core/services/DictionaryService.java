package app.core.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Entry;
import app.core.entities.Example;
import app.core.exceptions.DictionaryException;
import app.core.repositories.EntryRepository;
import app.core.repositories.ExampleRepository;

@Service
@Transactional
public class DictionaryService {

	@Autowired
	private EntryRepository entryRepository;
	@Autowired
	private ExampleRepository exampleRepository;

	/**
	 * @param entry
	 * @return
	 * @throws DictionaryException if the entity already exists
	 */
	public Entry addEntry(Entry entry) throws DictionaryException {
		if (this.entryRepository.existsById(entry.getId())) {
			throw new DictionaryException("addEntry failed - entity with this id already exists: " + entry.getId());
		}
		return this.entryRepository.save(entry);
	}

	public Entry getEntryById(int entryId) throws DictionaryException {
		return this.entryRepository.findById(entryId)
				.orElseThrow(() -> new DictionaryException("getEntryById failed - not found: " + entryId));
	}

	public List<Example> getAllEntryExamples(int entryId) {
		return this.exampleRepository.findByEntryId(entryId);
	}

	/**
	 * @param entry
	 * @return
	 * @throws DictionaryException if the entity doesn't exist
	 */
	public Entry updateEntry(Entry entry) throws DictionaryException {
		if (entryRepository.existsById(entry.getId())) {
			return entryRepository.save(entry);
		} else {
			throw new DictionaryException("updateEntry failed - not found: " + entry.getId());
		}
	}

	/**
	 * @param entryId
	 * @throws DictionaryException if the entity doesn't exist
	 */
	public void deleteEntry(int entryId) throws DictionaryException {
		if (this.entryRepository.existsById(entryId)) {
			this.entryRepository.deleteById(entryId);
		} else {
			throw new DictionaryException("deleteEntry failed - not found: " + entryId);
		}
	}

}
