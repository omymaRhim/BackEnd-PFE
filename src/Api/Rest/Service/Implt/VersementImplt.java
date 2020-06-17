package Api.Rest.Service.Implt;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Api.Rest.Dao.CompteDao;
import Api.Rest.Dao.VersementDao;
import Api.Rest.Entity.Compte;
import Api.Rest.Entity.Versement;
import Api.Rest.Service.VersementService;



@Service
public class VersementImplt implements VersementService {

	@Autowired
	CompteDao compteDao;
	
	@Autowired
	VersementDao versementDao;
	
	@Override
	public void verser(String codecmpt, Double montant) {
		// TODO Auto-generated method stub
		//Compte compte = consulltercompte(codecmpt) ;
		Versement ver1= new Versement (codecmpt,montant,new Date() );
		versementDao.save(ver1);
		//compte.setSolde(compte.getSolde()+montant);
		//compteDao.save(compte);

	}

}
