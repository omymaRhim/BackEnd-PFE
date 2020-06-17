package Api.Rest.Entity;



import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Client")
public class Compte {
	@Id
	private String id;
	
	@Size(max = 50)
	private String natureCompte;
	
	@Size(max = 50)
	private String typeDocument;
	
	@Size(max = 50)
	private int numDocument;
	
	@Size(max = 50)
	private String nom;
	
	@Size(max = 50)
	private String prenom;
	
	@Size(max = 50)
	private String dateNaissance;
	
	@Size(max = 50)
	private String adresse;
	
	@Size(max = 50)
	private String codePaysResidence;
	
	@Size(max = 50)
	private int codePostal;
	
	@Size(max = 50)
	private String nationalite;
	
	@Size(max = 50)
	private String residence;
	
	@Size(max = 50)
	private int numeroCompte;
    
	@Size(max = 50)
	private int cleCompte;
	
	@Size(max = 50)
	private double solde;

	public Compte(String id,  String natureCompte,  String typeDocument, int numDocument, 
			 String nom, String prenom, String dateNaissance,  String adresse,
			 String codePaysResidence, int codePostal, String nationalite,  String residence,
			 int numeroCompte,  int cleCompte, double solde) {

		this.id = id;
		this.natureCompte = natureCompte;
		this.typeDocument = typeDocument;
		this.numDocument = numDocument;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.codePaysResidence = codePaysResidence;
		this.codePostal = codePostal;
		this.nationalite = nationalite;
		this.residence = residence;
		this.numeroCompte = numeroCompte;
		this.cleCompte = cleCompte;
		this.solde=solde;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNatureCompte() {
		return natureCompte;
	}

	public void setNatureCompte(String natureCompte) {
		this.natureCompte = natureCompte;
	}

	public String getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}

	public int getNumDocument() {
		return numDocument;
	}

	public void setNumDocument(int numDocument) {
		this.numDocument = numDocument;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePaysResidence() {
		return codePaysResidence;
	}

	public void setCodePaysResidence(String codePaysResidence) {
		this.codePaysResidence = codePaysResidence;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public int getCle_Compte() {
		return cleCompte;
	}

	public void setCle_Compte(int cleCompte) {
		this.cleCompte = cleCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	


	
	
	
	

	
}
