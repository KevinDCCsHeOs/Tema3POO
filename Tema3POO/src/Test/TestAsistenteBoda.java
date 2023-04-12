package Test;

import javax.swing.JOptionPane;

import EntradaSalida.Tools;
import TDA.AsistenteBoda;

public class TestAsistenteBoda {
	public static void main(String[] args) {
		CapturaAsistentes();
	}
	public static void CapturaAsistentes() {
		byte res,x;
		String cad="", cadMay="", cadMen="";
		do {
			AsistenteBoda As=new AsistenteBoda();
			As.setNomAsis(Tools.leerString("Nombre: "));
			As.setEdadAsis(Tools.leerByte("Edad: "));
			do {
				As.setSexAsis(Tools.leerChar("Sexo: [H]ombre  [M]ujer"));
				x=(As.getSexAsis()=='H'||As.getSexAsis()=='M')?(byte)1:(byte)0;
			}while(x!=1);
			As.setEstadoCivilAsis(Desplegable("Solter@,Casad@,Viud@,Separad@,Divorciad@"));
			if (As.esMayor()) cadMay+=As.toString()+"\n";
			else cadMen+=As.toString()+"\n";
			As.tipoAsis();
			As.SexoAsistente();
			cad+=As.toString()+"\n";
			
			res=(byte)Tools.seguirSino();
		}while(res!=1);
		Tools.imprimePantalla("Asistentes Capturados: \n\n"+AsistenteBoda.Asistentes()+
				"\n\n Asistentes mayores: \n\n"+cadMay+
				"\n\n Asistentes menores: \n\n"+cadMen+
				"\n\n Todos los asistentes \n\n"+cad);
	}
	public static String Desplegable(String menu) {
		String valores[]=menu.split(",");
		String res=(String)JOptionPane.showInputDialog(null,"Estado Civil: ","M E N U",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return res;
	}
}
