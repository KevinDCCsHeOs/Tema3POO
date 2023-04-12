package Test;

import EntradaSalida.Tools;
import TDA.Rectangulo;

public class TestSalon {
	public static void CapturaObjetos() {
		Rectangulo salon=new Rectangulo(7,(float)6.5);
		Rectangulo alf1=new Rectangulo((float)3.8,(float)4.6);
		Rectangulo alf2=new Rectangulo((float)4.5,(float)2.3);
		Tools.imprimePantalla(Rectangulo.AreaCubierta(salon, alf1, alf2));
	}
	public static void main(String[] args) {
		CapturaObjetos();
	}
}
