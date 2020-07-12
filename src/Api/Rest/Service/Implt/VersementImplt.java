package Api.Rest.Service.Implt;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Api.Rest.Dao.VersementDao;

import Api.Rest.Entity.Versement;
import Api.Rest.Service.VersementService;



@Service
public class VersementImplt implements VersementService {

	
	@Autowired
	VersementDao versementDao;

	@Override
	public Versement insert(Versement ver) {
		// TODO Auto-generated method stub
		return versementDao.save(ver);
	}
	
	

	}


