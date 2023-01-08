package app.core.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import app.core.entities.Entry;

public interface UtilRepo extends Repository<Entry, Void> {

	@Query(nativeQuery = true, value = "delete from example")
	@Modifying
	void clearExampleTable();

	@Query(nativeQuery = true, value = "delete from entry")
	@Modifying
	void clearEntryTable();

}
