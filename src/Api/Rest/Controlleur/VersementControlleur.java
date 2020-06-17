package Api.Rest.Controlleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Api.Rest.Service.VersementService;



@RestController
@RequestMapping("Versement")
public class VersementControlleur {

	@Autowired
	private VersementService versementservice;
	
	@PostMapping("/versement")
	public void Verser(@RequestBody String codecmpt, double montant) {
		versementservice.verser(codecmpt, montant);
	}
}
