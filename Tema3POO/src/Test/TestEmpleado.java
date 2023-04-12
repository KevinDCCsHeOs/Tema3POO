package Test;

import EntradaSalida.Tools;
import TDA.Empleado;

public class TestEmpleado {
	public static void main(String[] args) {
		CapturaEmpleados();
	}
	public static void CapturaEmpleados() {
		Empleado carlos = new Empleado("Carlos Perez",(byte)25, (byte)40, 180.5);
		Empleado sonia = new Empleado("Sonia Alvarez",(byte)19, (byte)45, 180.5);
		Empleado alma = new Empleado("Alma Alvarez",(byte)19, (byte)45, 180.5);
		String cad="Empleado con mayor edad: "+Empleado.mayorEdad(carlos, sonia)+"\n";
		cad+="Empleado que trabajo mas horas: "+Empleado.mayorHrsTrabajadas(carlos, sonia);
		Tools.imprimePantalla(cad+"\n"+carlos.toString()+"\n"+sonia.toString()+"\n"+alma.toString()+
				"\n\n Total de objetos creados: \n"+Empleado.getConta());
		
	}
}
