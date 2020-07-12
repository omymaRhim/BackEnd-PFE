package Api.Rest.Entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import javax.validation.constraints.Size;


@Document(collection = "MVD")
public class Versement {
	
	@Id
    private int REFMVD;
	
	@Size(max = 8)
	private int ORDCPXMVD;
	
	@Size(max = 15)
	private double MNT2MVD;
	
	@Size(max = 15)
	private double MNTMVD;
	
	@Size(max = 2)
	private String TDCMVD;
	
	@Size(max = 13)
	private String NDCMVD;

	public Versement(int REFMVD, int ORDCPXMVD, double MNT2MVD, double MNTMVD,String TDCMVD, String NDCMVD) {
		super();
		this.REFMVD = REFMVD;
		this.ORDCPXMVD = ORDCPXMVD;
		this.MNT2MVD = MNT2MVD;
		this.MNTMVD = MNTMVD;
		this.TDCMVD = TDCMVD;
		this.NDCMVD = NDCMVD;
	}

	public int getREFMVD() {
		return REFMVD;
	}

	public void setREFMVD(int rEFMVD) {
		REFMVD = rEFMVD;
	}

	public int getORDCPXMVD() {
		return ORDCPXMVD;
	}

	public void setORDCPXMVD(int oRDCPXMVD) {
		ORDCPXMVD = oRDCPXMVD;
	}

	public double getMNT2MVD() {
		return MNT2MVD;
	}

	public void setMNT2MVD(double mNT2MVD) {
		MNT2MVD = mNT2MVD;
	}

	public double getMNTMVD() {
		return MNTMVD;
	}

	public void setMNTMVD(double mNTMVD) {
		MNTMVD = mNTMVD;
	}

	public String getTDCMVD() {
		return TDCMVD;
	}

	public void setTDCMVD(String tDCMVD) {
		TDCMVD = tDCMVD;
	}

	public String getNDCMVD() {
		return NDCMVD;
	}

	public void setNDCMVD(String nDCMVD) {
		NDCMVD = nDCMVD;
	}
	
	

	
	
	
 
}


	

