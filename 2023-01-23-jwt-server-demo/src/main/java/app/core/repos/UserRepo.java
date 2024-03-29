package app.core.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);

	boolean existsByEmail(String email);

}
