package TDA;

import EntradaSalida.Tools;

public class Pinturas {
	public static String cotizacionPintura(String nombreCliente, double largo, double alto) {
        double area = largo * alto;
        double rendimiento = 3.0;
        double litros;
        String cad="";
        if (area % rendimiento == 0) {
            litros = area / rendimiento;
        } else {
            litros = Math.ceil(area / rendimiento);
        }
        double costo = litros * 75;
        cad="Cliente: "+nombreCliente+"\n"+"Metros Cuadrados a pintar: "+area+"\n"+"Litros de pintura que se requieren: "+litros+"\n"+"Costo Total a pagar: "+costo;
        return cad;
    }
    public static void main(String []args) {
    	Tools.imprimePantalla(cotizacionPintura(Tools.leerString("Nombre del Cliente: "),
    			Tools.leerDouble("Dame el largo: "), Tools.leerDouble("Dame el alto: ")));
    }
}
