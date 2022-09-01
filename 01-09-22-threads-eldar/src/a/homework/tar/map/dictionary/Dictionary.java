package a.homework.tar.map.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Dictionary {

	private Map<String, String> map = new HashMap<>();

	/**
	 * adds entry to the dictionary
	 * 
	 * @param entry
	 * @param definition
	 * @throws DictionaryException if the entry is null or empty String or if the
	 *                             entry already exists in the dictionary
	 */
	public void addEntry(String entry, String definition) throws DictionaryException {
		if (entry == null) {
			throw new DictionaryException("add entry failed - entry cannot be null");
		}
		if (entry == "") {
			throw new DictionaryException("add entry failed - entry cannot be of 0 characters");
		}
		if (map.containsKey(entry)) {
			throw new DictionaryException("add entry failed - entry already exists");
		}
		map.put(entry, definition);
	}

	/**
	 * get a definition for the specified entry
	 * 
	 * @param entry
	 * @return the definition of the entry or null if not exists
	 */
	public String getDefinition(String entry) {
		return map.get(entry);
	}

	/**
	 * edits a given entry
	 * 
	 * @param entry      the entry to edit
	 * @param definition the new definition
	 * @throws DictionaryException if the entry not found in the dictionary
	 */
	public void editEntry(String entry, String definition) throws DictionaryException {
		if (!map.containsKey(entry)) {
			throw new DictionaryException("editEntry failed - entry not exists in dictionary");
		}
		map.put(entry, definition);
	}

	/**
	 * delete the given entry
	 * 
	 * @param entry
	 * @return
	 */
	public String deleteEntry(String entry) {
		return map.remove(entry);
	}

	/** get all entries sorted
	 * @return
	 */
	public Set<String> getAllEntriesSorted() {
		return new TreeSet<>(map.keySet());
	}

	
	
	
	
	
	
}
