package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
