package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Entry;

public interface EntryRepository extends JpaRepository<Entry, Integer> {

}
