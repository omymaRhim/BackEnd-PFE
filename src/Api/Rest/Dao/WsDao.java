package Api.Rest.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Api.Rest.Entity.Ws;


@Repository
public interface WsDao extends MongoRepository<Ws, String> {

}
