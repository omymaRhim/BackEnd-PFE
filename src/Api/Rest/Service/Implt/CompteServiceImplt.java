package Api.Rest.Service.Implt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Api.Rest.Dao.CompteDao;
import Api.Rest.Entity.Compte;
import Api.Rest.Service.CompteService;

@Service
public class CompteServiceImplt implements CompteService {
	
	@Autowired
	private CompteDao compteDao;

	@Override
	public Compte insert(Compte compte) {
		// TODO Auto-generated method stub
		return compteDao.save(compte);
		
	}

	@Override
	public Compte update(Compte compte) {
		// TODO Auto-generated method stub
		return compteDao.save(compte);
	}

	@Override
	public List<Compte> getAllCompte() {
		// TODO Auto-generated method stub
		return compteDao.findAll();
	}

	@Override
	public void deleteCompte(String compteId) {
		// TODO Auto-generated method stub
		compteDao.deleteById(compteId);
	}

	//@Override
	//public Compte consulltercompte(String codecmpt) {
		// TODO Auto-generated method stub
		//return compteDao.findOne(codecmpt);
	//}

	

}
