package app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Example;

public interface ExampleRepository extends JpaRepository<Example, Integer> {

	List<Example> findByEntryId(int entryWordId);

}
