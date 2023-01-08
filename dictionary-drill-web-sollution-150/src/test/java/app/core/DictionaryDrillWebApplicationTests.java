package app.core;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import app.core.entities.Entry;
import app.core.entities.Example;
import app.core.exceptions.DictionaryException;
import app.core.services.DictionaryService;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DictionaryDrillWebApplicationTests {

	@Autowired
	private DictionaryService dictionary;

	@Test
	@Order(1)
	void testAddEntryWord() throws DictionaryException {
		System.out.println("=== start test add new entry word");

		List<Example> exampleSentences = new ArrayList<>();

		exampleSentences.add(new Example(0, "that cat climbed the tree", null));
		exampleSentences.add(new Example(0, "that cat drank milk", null));

		Entry word = new Entry(0, "Cat", "a nice animal that do meow", exampleSentences);

		word.addExample(new Example(0, "the cat is sleeping", null));

		Entry entryWord = dictionary.addEntryToDictionary(word);
		int expectedEntryWordId = 1;
		int actualEntryWordId = entryWord.getId();
		Assertions.assertEquals(expectedEntryWordId, actualEntryWordId, "the first id should be 1");

		System.out.println("=== start test add existing entry word");
		DictionaryException e = Assertions.assertThrows(DictionaryException.class,
				() -> dictionary.addEntryToDictionary(entryWord));
		System.out.println(e);
	}

	@Test
	@Order(2)
	void testFindEntryWord() throws DictionaryException {
		System.out.println("=== test find existing entry word");
		Entry entryWord = this.dictionary.getEntryById(1);
		System.out.println("found: " + entryWord);
		Assertions.assertNotNull(entryWord);
		Assertions.assertEquals("Cat", entryWord.getWord());
		System.out.println("=== test find non existing entry word");
		DictionaryException e = Assertions.assertThrows(DictionaryException.class,
				() -> this.dictionary.getEntryById(10));
		System.out.println(e);
	}

	@Test
	@Order(3)
	void testDeleteEntryWord() throws DictionaryException {
		System.out.println("=== test deleting existing entry word");
		this.dictionary.deleteEntryById(1);
		System.out.println("=== test deleting non existing entry word");
		Exception e = Assertions.assertThrows(DictionaryException.class, () -> this.dictionary.deleteEntryById(1));
		System.out.println(e);
	}

}
