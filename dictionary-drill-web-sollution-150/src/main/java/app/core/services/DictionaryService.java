package app.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	public Entry addEntryToDictionary(Entry entry) throws DictionaryException {
		if (this.entryRepository.existsById(entry.getId())) {
			throw new DictionaryException(
					"addEntryToDictionary failed - an entry with this id already exists: " + entry.getId());
		} else {
			return this.entryRepository.save(entry);
		}
	}

	/**
	 * @param entryId
	 * @return
	 * @throws DictionaryException if the specified entry not exists
	 */
	public Entry getEntryById(int entryId) throws DictionaryException {
		return this.entryRepository.findById(entryId)
				.orElseThrow(() -> new DictionaryException("getEntryById faild - not found: " + entryId));
	}

	public List<Example> getExamplesForEntry(int entryId) {
		return this.exampleRepository.findByEntryId(entryId);
	}

	/**
	 * @param entry
	 * @return
	 * @throws DictionaryException if the specified entry not exists
	 */
	public Entry updateEntry(Entry entry) throws DictionaryException {
		if (this.entryRepository.existsById(entry.getId())) {
			return this.entryRepository.save(entry);
		}
		throw new DictionaryException("updateEntry failed - not found: " + entry.getId());
	}

	/**
	 * @param entryId
	 * @throws DictionaryException if the specified entry not exists
	 */
	public void deleteEntryById(int entryId) throws DictionaryException {
		if (this.entryRepository.existsById(entryId)) {
			this.entryRepository.deleteById(entryId);
		} else {
			throw new DictionaryException("deleteEntryById failed - not found: " + entryId);
		}
	}

}
