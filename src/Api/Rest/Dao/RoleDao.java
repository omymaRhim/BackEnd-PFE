package Api.Rest.Dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import Api.Rest.Entity.Erole;
import Api.Rest.Entity.Role;

public interface RoleDao extends MongoRepository<Role, String> {
	Optional<Role>findByName(Erole name);
}
