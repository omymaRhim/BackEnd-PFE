package Api.Rest.Entity;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "MVD")
public class Ws {

	@Id 
	private String ws;
	
	@Size(max = 50)
	private String libelle;
	
	@Size(max = 50)
	private String parametre;
	
	@Size(max = 50)
	private String legende;
	
	@Size(max = 50)
	private String type;
	
	@Size(max = 50)
	private String taille;
	

	public Ws() {
		super();
	}

	public Ws(String ws,  String libelle, String parametre,
			 String legende,  String type, String taille) {
	
		this.ws = ws;
		this.libelle = libelle;
		this.parametre = parametre;
		this.legende = legende;
		this.type = type;
		this.taille = taille;
		
	}

	public String getWs() {
		return ws;
	}

	public void setWs(String ws) {
		this.ws = ws;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getParametre() {
		return parametre;
	}

	public void setParametre(String parametre) {
		this.parametre = parametre;
	}

	public String getLegende() {
		return legende;
	}

	public void setLegende(String legende) {
		this.legende = legende;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	@Override
	public String toString() {
		return "Ws [ws=" + ws + ", libelle=" + libelle + ", parametre=" + parametre + ", legende=" + legende + ", type="
				+ type + ", taille=" + taille + "]";
	}

	
	
	
}
