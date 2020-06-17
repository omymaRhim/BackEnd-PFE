package Api.Rest.Controlleur;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import Api.Rest.Entity.Compte;

import Api.Rest.Service.CompteService;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("Compte")
public class CompteControlleur {
	@Autowired
	private CompteService compteService;
	
	@PostMapping("/insert")
	public Compte insert(@RequestBody Compte compte) {
		return compteService.insert(compte);
	}
	@PutMapping("/update")
	public Compte update(@RequestBody Compte compte) {
		return compteService.update(compte);
	}
	@GetMapping("/All")
	public List<Compte>getAllCompte(){
		return compteService.getAllCompte();
	}
	@DeleteMapping("/delete/{compteId}")
	public void deleteCompte(@PathVariable(name="compteId")String compteId) {
		compteService.deleteCompte(compteId);
	}
	 @Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2).select()
	                .apis(RequestHandlerSelectors.basePackage("Api.Rest.Controlleur")).build();
	    }

}
