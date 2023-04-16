package TDA;

import EntradaSalida.Tools;

public class Pedido {
	public static void CalcularPedido(String primPlato, String bebida) {
		short total=(short)(calculaPrimPlato(primPlato)+calcularBebida(bebida));
		Tools.imprimePantalla("Total a pagar: "+total);
	}
	public static void CalcularPedido(String primPlato, String segPlato,String bebida) {
		short total=(short)(calculaPrimPlato(primPlato)+calculaSegPlato(segPlato)+calcularBebida(bebida));
		Tools.imprimePantalla("Total a pagar: "+total);
	}
	public static void CalcularPedido(String primPlato, String segPlato,String bebida, String postre) {
		short total=(short)(calculaPrimPlato(primPlato)+calculaSegPlato(segPlato)+calcularBebida(bebida)+calcularPostre(postre));
		Tools.imprimePantalla("Total a pagar: "+total);
	}
	private static byte calculaPrimPlato(String primPlato) {
		byte pr1=0;
		switch (primPlato) {
		case "Crema de espincas": pr1=20;break;
		case "Ensalada de verduras": pr1=22;break;
		case "Crema de brocoli": pr1=25;break;
		case "Caldo tlalpeño": pr1=30;break;
		case "Sopa mixteca": pr1=27;break;
		}
		return pr1;
	}
	private static byte calculaSegPlato(String segPlato) {
		byte pr2=0;
		switch (segPlato) {
		case "Filete de pescado": pr2=60;break;
		case "Milanesa de pollo": pr2=45;break;
		case "Bistec a la mexicana": pr2=55;break;
		case "Pollo en escabeche": pr2=35;break;
		case "Carne asada": pr2=40;break;
		case "Lomo relleno": pr2=56;break;
		case "Pollo a la plancha": pr2=49;break;
		}
		return pr2;
	}
	private static byte calcularBebida(String bebida) {
		byte prb=0;
		switch (bebida) {
		case "Coca cola": prb=20;break;
		case "Pepsi": prb=18;break;
		case "Naranjada": prb=15;break;
		case "Limonada": prb=15;break;
		case "Agua de sabor":prb=16;break;
		}
		return prb;
	}
	private static byte calcularPostre(String postre) {
		byte prp=0;
		switch (postre) {
		case "Pastel helado": prp=70;break;
		case "Helado": prp=25;break;
		case "Fresas con crema": prp=40;break;
		case "Platanos fritos":	prp=30;break;
		case "Flan casero":	prp=35;break;
		case "Gelatina": prp=45;break;
		}
		return prp;
	}
}
