package Api.Rest.Service;



import java.util.List;



import Api.Rest.Entity.Compte;

public interface CompteService {

	Compte insert(Compte compte);
	Compte update (Compte compte);
	List<Compte> getAllCompte();
	void deleteCompte(String compteId);
	//Compte consulltercompte(String codecmpt);
	

}
