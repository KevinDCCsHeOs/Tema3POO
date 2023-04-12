package TDA;

public class AsistenteBoda {
	private String nomAsis;
	private byte edadAsis;
	private char sexAsis;
	private String estadoCivilAsis;
	private static byte Asis;
	private static byte HAsis;
	private static byte MAsis;
	private static byte CasadosAsis;
	private static byte SolterosAsis;
	private static byte ViudosAsis;
	private static byte SeparadosAsis;
	private static byte DivorciadosAsis;
	public AsistenteBoda() {}
	public AsistenteBoda(String nomAsis, byte edadAsis, char sexAsis, String estadoCivilAsis) {
		this.nomAsis=nomAsis;
		this.edadAsis=edadAsis;
		this.sexAsis=sexAsis;
		this.estadoCivilAsis=estadoCivilAsis;
		Asis++;
	}
	public String getNomAsis() {
		return nomAsis;
	}
	public void setNomAsis(String nomAsis) {
		this.nomAsis = nomAsis;
	}
	public byte getEdadAsis() {
		return edadAsis;
	}
	public void setEdadAsis(byte edadAsis) {
		this.edadAsis = edadAsis;
	}
	public char getSexAsis() {
		return sexAsis;
	}
	public void setSexAsis(char sexAsis) {
		this.sexAsis = sexAsis;
	}
	public String getEstadoCivilAsis() {
		return estadoCivilAsis;
	}
	public void setEstadoCivilAsis(String estadoCivilAsis) {
		this.estadoCivilAsis = estadoCivilAsis;
	}
	public static byte getAsis() {
		return Asis;
	}
	@Override
	public String toString() {
		return "Nombre= " + nomAsis + ", Edad= " + edadAsis + ", Sexo= " + sexAsis
				+ ", Estado civil= " + estadoCivilAsis;
	}
	public boolean esMayor() {
		return edadAsis>=18;
	}
	public void tipoAsis() {
		switch (estadoCivilAsis) {
		case "Casad@": CasadosAsis++;break;
		case "Solter@":	SolterosAsis++;break;
		case "Viud@": ViudosAsis++;break;
		case "Separad@": SeparadosAsis++;break;
		case "Divorciad@": DivorciadosAsis++;break;
		}
	}
	public void SexoAsistente() {
		if (sexAsis=='H')
			HAsis++;
		else 
			MAsis++;
	}
	public static String imprimeFrecuencia(byte n) {
		String cad=" ";
		for(int i=1;i<=n;i++) {
			cad+="*";
		}
		return cad;
	}
	public static String Asistentes() {
		return "Total de hombres: "+imprimeFrecuencia(HAsis)+
				"\n Total de mujeres: "+imprimeFrecuencia(MAsis)+
				"\n Total de casados: "+CasadosAsis+
				"\n Total de solteros: "+SolterosAsis+
				"\n Total de viudos: "+ViudosAsis+
				"\n Total de separados: "+SeparadosAsis+
				"\n Total de divorciados: "+DivorciadosAsis;
	}
}
