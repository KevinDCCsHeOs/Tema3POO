package TDA;

public class Empleado {
	private int cveEmpleado;
	private String nombEmp;
	private byte edadEmp;
	private byte hrstrabEmp;
	private double pagohrsEmp;
	private static byte conta=0;
	private static short inicial=1000;
	public Empleado(String nombEmp, byte edadEmp, byte hrstrabEmp, double pagohrsEmp) {
		this.cveEmpleado=inicial;
		this.nombEmp=nombEmp;
		this.edadEmp=edadEmp;
		this.hrstrabEmp=hrstrabEmp;
		this.pagohrsEmp=pagohrsEmp;
		conta++;
		inicial+=2;
	}
	public String getNombEmp() {
		return nombEmp;
	}
	public void setNombEmp(String nombEmp) {
		this.nombEmp = nombEmp;
	}
	public byte getEdadEmp() {
		return edadEmp;
	}
	public void setEdadEmp(byte edadEmp) {
		this.edadEmp = edadEmp;
	}
	public byte getHrstrabEmp() {
		return hrstrabEmp;
	}
	public void setHrstrabEmp(byte hrstrabEmp) {
		this.hrstrabEmp = hrstrabEmp;
	}
	public double getPagohrsEmp() {
		return pagohrsEmp;
	}
	public void setPagohrsEmp(double pagohrsEmp) {
		this.pagohrsEmp = pagohrsEmp;
	}
	public static byte getConta() {
		return conta;
	}
	public String toString() {
		return "Empleado [cveEmpleado=" + cveEmpleado + ", nombEmp=" + nombEmp + ", edadEmp=" + edadEmp
				+ ", hrstrabEmp=" + hrstrabEmp + ", pagohrsEmp=" + pagohrsEmp + "]";
	}
	public static Empleado mayorEdad(Empleado emp1, Empleado emp2) {
		return (emp1.edadEmp>= emp2.edadEmp)?emp1:emp2;//operador ternario
	}
	public static Empleado mayorHrsTrabajadas(Empleado emp1, Empleado emp2) {
		return (emp1.hrstrabEmp>=emp2.hrstrabEmp)? emp1:emp2;
	}
}
