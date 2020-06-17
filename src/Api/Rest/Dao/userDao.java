package Api.Rest.Dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import Api.Rest.Entity.user;

public interface userDao extends MongoRepository<user, String> {
	
	Optional<user>findByUsername(String username);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);

}
