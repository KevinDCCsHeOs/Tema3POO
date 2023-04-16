package Test;

import javax.swing.JOptionPane;
import TDA.Pedido;

public class TestPedido {
	public static void main(String[] args) {
		CapturaPedido("1. Un primer plato y una bebida,2. Un primer plato + un segundo plato y una bebida,"
				+ "3. Un primer plato + un segundo plato + una bebida y un postre,Salir");
	}
	public static void CapturaPedido(String menu) {
		String sel="";
		do {
			sel=Desplegable1(menu);
			switch (sel) {
			case "1. Un primer plato y una bebida":
				Pedido.CalcularPedido(Desplegable("Crema de espincas,Ensalada de verduras,Crema de brocoli,Caldo tlalpeño,Sopa mixteca"),
						Desplegable("Coca cola,Pepsi,Naranjada,Limonada,Agua de sabor"));break;
			case "2. Un primer plato + un segundo plato y una bebida":
				Pedido.CalcularPedido(Desplegable("Crema de espincas,Ensalada de verduras,Crema de brocoli,Caldo tlalpeño,Sopa mixteca"),
						Desplegable("Filete de pescado,Milanesa de pollo,Bistec a la mexicana,Pollo en escabeche,Carne asada,Lomo relleno,Pollo a la plancha"),
						Desplegable("Coca cola,Pepsi,Naranjada,Limonada,Agua de sabor"));break;
			case "3. Un primer plato + un segundo plato + una bebida y un postre":
				Pedido.CalcularPedido(Desplegable("Crema de espincas,Ensalada de verduras,Crema de brocoli,Caldo tlalpeño,Sopa mixteca"),
						Desplegable("Filete de pescado,Milanesa de pollo,Bistec a la mexicana,Pollo en escabeche,Carne asada,Lomo relleno,Pollo a la plancha"),
						Desplegable("Coca cola,Pepsi,Naranjada,Limonada,Agua de sabor"),
						Desplegable("Pastel helado,Helado,Fresas con crema,Platanos fritos,Flan casero,Gelatina"));break;
			case "Salir":break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static String Desplegable(String menu) {
		String valores[]=menu.split(",");
		String res=(String)JOptionPane.showInputDialog(null,"Escoge una opcion","M E N U",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return res;
	}
	public static String Desplegable1(String menu) {
		String valores[]=menu.split(",");
		String res=(String)JOptionPane.showInputDialog(null,"Selecciona el tipo de platillos a pedir o salir","M E N U",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return res;
	}
}
