package Api.Rest.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Api.Rest.Entity.Compte;

@Repository
public interface CompteDao extends MongoRepository<Compte, String> {

}
