package Test;

import javax.swing.JOptionPane;

import EntradaSalida.Tools;
import TDA.ConversorMetros;

public class TestConversorMetros {
	public static void main(String[] args) {
		CapturaMetros("Convertir Metros a...,Salir");
	}
	public static void CapturaMetros(String menu) {
		double resul=0;
		String sel="", con="";
		do {
			sel=Boton(menu);
			switch (sel) {
			case "Convertir Metros a...":
				ConversorMetros metros=new ConversorMetros(Tools.leerDouble("Dame los metros: "));
				con=Desplegable("Centimetros,Milimetros,Pulgadas,Pies,Yardas");
				switch (con) {
				case "Centimetros":	resul=metros.Metros_A_Centimetros2();break;
				case "Milimetros": resul=metros.Metros_A_Milimetros2();break;
				case "Pulgadas": resul=metros.Metros_A_Pulgadas2();break;
				case "Pies": resul=metros.Metros_A_Pies2();break;
				case "Yardas": resul=metros.Metros_A_Yardas2();break;
				}
				Tools.imprimePantalla("El resultado es= "+resul);
				break;
			case "Salir":
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static String Desplegable(String menu) {
		String valores[]=menu.split(",");
		String res=(String)JOptionPane.showInputDialog(null,"¿A que unidad de medida quieres convertir?","M E N U",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return res;
	}
	public static String Boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null,"SELECCIONA DANDO CLICK","M E N U",JOptionPane.NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
	return(valores[n]);
	}
}
