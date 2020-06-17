package Api.Rest.Entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Client")
public class Versement {
	
	@Id
	private String codecmpt ;
	
	private Double montant;
	
	private Date date ;

	public Versement(String codecmpt, Double montant, Date date) {
		this.codecmpt = codecmpt;
		this.montant = montant;
		this.date = date;
	}

	public String getCodecmpt() {
		return codecmpt;
	}

	public void setCodecmpt(String codecmpt) {
		this.codecmpt = codecmpt;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

	
}
