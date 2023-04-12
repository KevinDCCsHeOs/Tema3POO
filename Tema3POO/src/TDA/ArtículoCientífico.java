package TDA;

public class ArtículoCientífico {
	private String nomArti;
	private String autorArti;
	private String palaClaves;
	private String nomPublica;
	private short añoArti;
	private String resumArti;
	public ArtículoCientífico(String nomArti, String autorArti) {
		this.nomArti=nomArti;
		this.autorArti=autorArti;
	}
	public ArtículoCientífico(String nomArti, String autorArti, String palaClaves, String nomPublica, short añoArti) {
		this(nomArti, autorArti);
		this.palaClaves=palaClaves;
		this.nomPublica=nomPublica;
		this.añoArti=añoArti;
	}
	public ArtículoCientífico(String nomArti, String autorArti, String palaClaves, String nomPublica, short añoArti, String resumArti) {
		this(nomArti, autorArti, palaClaves, nomPublica, añoArti);
		this.resumArti=resumArti;
	}
	@Override
	public String toString() {
		return "ArtículoCientífico \n\n nomArti=" + nomArti + "\n autorArti=" + autorArti + "\n palaClaves=" + palaClaves
				+ "\n nomPublica=" + nomPublica + "\n añoArti=" + añoArti + "\n resumArti=" + resumArti;
	}
}
