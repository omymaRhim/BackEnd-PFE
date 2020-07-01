/*package Api.Rest.Service.Implt;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Api.Rest.Dao.WsDao;
import Api.Rest.Entity.Ws;
import Api.Rest.Helper.ExcelHelper;
import Api.Rest.Service.Wsservice;


@Service
public class WsserviceIplmt implements Wsservice {

	
	@Autowired
	private WsDao wsdao; ;
	
	@Override
	public void getWs(String ws) {
		// TODO Auto-generated method stub
		 wsdao.findById(ws);
	}

	@Override
	public void save(MultipartFile file) {
		// TODO Auto-generated method stub
		 try {
		      List<Ws> tutorials = ExcelHelper.excelToWs(file.getInputStream());
		      wsdao.saveAll(tutorials);
		    } catch (IOException e) {
		      throw new RuntimeException("fail to store excel data: " + e.getMessage());
		    }
	}

	@Override
	public List<Ws> getAllWs() {
		// TODO Auto-generated method stub
		return wsdao.findAll();
	}

}*/
