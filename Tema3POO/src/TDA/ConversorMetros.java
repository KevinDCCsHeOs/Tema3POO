package TDA;

public class ConversorMetros {
	private double metros;
	final byte METROS_CM=100;
	final short METROS_MILIM=1000;
	final double METROS_PULGADAS=39.37;
	final double METROS_PIES=3.28;
	final double METROS_YARDAS=1.09361;
	public ConversorMetros(double metros) {
		this.metros = metros;
	}
	private double Metros_A_Centimetros() {
		return metros*METROS_CM;
	}
	private double Metros_A_Milimetros() {
		return metros*METROS_MILIM;
	}
	private double Metros_A_Pulgadas() {
		return metros*METROS_PULGADAS;
	}
	private double Metros_A_Pies() {
		return metros*METROS_PIES;
	}
	private double Metros_A_Yardas() {
		return metros*METROS_YARDAS;
	}
	public double Metros_A_Centimetros2() {
		return Metros_A_Centimetros();
	}
	public double Metros_A_Milimetros2() {
		return Metros_A_Milimetros();
	}
	public double Metros_A_Pulgadas2() {
		return Metros_A_Pulgadas();
	}
	public double Metros_A_Pies2() {
		return Metros_A_Pies();
	}
	public double Metros_A_Yardas2() {
		return Metros_A_Yardas();
	}
}
