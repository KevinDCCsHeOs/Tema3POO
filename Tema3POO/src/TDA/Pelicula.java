package TDA;

public class Pelicula {
	private String nomPel;
	private String nomDirPel;
	private String genPel;
	private short durPel;
	private short añoPel;
	private byte calPel;
	public Pelicula(String nomPel, String nomDirPel, String genPel, short durPel, short añoPel, byte calPel) {
		this.nomPel = nomPel;
		this.nomDirPel = nomDirPel;
		this.genPel = genPel;
		this.durPel = durPel;
		this.añoPel = añoPel;
		this.calPel = calPel;
	}
	public String getNomPel() {
		return nomPel;
	}
	private void setNomPel(String nomPel) {
		this.nomPel = nomPel;
	}
	public String getNomDirPel() {
		return nomDirPel;
	}
	private void setNomDirPel(String nomDirPel) {
		this.nomDirPel = nomDirPel;
	}
	public String getGenPel() {
		return genPel;
	}
	private void setGenPel(String genPel) {
		this.genPel = genPel;
	}
	public short getDurPel() {
		return durPel;
	}
	private void setDurPel(short durPel) {
		this.durPel = durPel;
	}
	public short getAñoPel() {
		return añoPel;
	}
	private void setAñoPel(short añoPel) {
		this.añoPel = añoPel;
	}
	public byte getCalPel() {
		return calPel;
	}
	private void setCalPel(byte calPel) {
		this.calPel = calPel;
	}
	@Override
	public String toString() {
		return "Pelicula [nomPel=" + nomPel + ", nomDirPel=" + nomDirPel + ", genPel=" + genPel + ", durPel=" + durPel
				+ ", añoPel=" + añoPel + ", calPel=" + calPel + "]";
	}
	private boolean esPeliculaEpica() {
		return (durPel>=180);
	}
	private String CalcularValoracion() {
		String val="";
		if (calPel>=0 && calPel<=2) val="Muy mala";
		else if (calPel>2 && calPel<=5)	val="Mala";
		else if (calPel>5 && calPel<=7)	val="Regular";
		else if (calPel>7 && calPel<=8)	val="Buena";
		else if (calPel>8 && calPel<=10) val="Excelente";
		else val="No definida";
		return val;
	}
	private boolean esSimilar(Pelicula pel2) {
		return (pel2.getGenPel().equals(this.getGenPel()) && pel2.getCalPel()==this.getCalPel());
	}
	private String imprimirCartel() {
		 String imp="";
		 imp="-------- "+nomPel+" ----------\n"+imprimeFrecuencia(calPel)+"\n"+genPel+", "+añoPel+"\n\n"+nomDirPel;
		 return imp;
	}
	public static String imprimeFrecuencia(byte n) {
		String cad=" ";
		for(int i=1;i<=n;i++) {
			cad+="*";
		}
		return cad;
	}
	public String esPeliculaEpica2() {
		return esPeliculaEpica()?"Si es epica":"No es epica";
	}
	public String CalcularValoracion2() {
		return CalcularValoracion();
	}
	public String esSimilar2(Pelicula pel2) {
		return esSimilar(pel2)?"Si son similares":"No son similares";
	}
	public String imprimirCartel2() {
		return imprimirCartel();
	}
}
