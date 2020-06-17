package Api.Rest.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Api.Rest.Entity.Versement;


@Repository
public interface VersementDao extends MongoRepository<Versement, Double> {

}
