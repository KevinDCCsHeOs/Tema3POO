package Test;

import EntradaSalida.Tools;
import TDA.Pelicula;

public class TestPelicula {

	public static void main(String[] args) {
		CapturaPeliculas();
	}
	public static void CapturaPeliculas() {
		Pelicula peli1=new Pelicula("Gandhi", "Richard Attenborough", "Drama", (short)191, (short)1982, (byte)8);
		Pelicula peli2=new Pelicula("Thor", "Kenneth Branagh", "Acción", (short)115, (short)2011, (byte)7);
		Tools.imprimePantalla(peli1.toString()+"\n¿Es Epica? "+peli1.esPeliculaEpica2()+"\n Valoracion: "+peli1.CalcularValoracion2()+
				"\n\n"+peli1+"\n"+peli2.toString()+"\n¿Es Epica? "+peli2.esPeliculaEpica2()+"\n Valoracion: "+peli2.CalcularValoracion2()+
				"\n\n ¿Son Similares? "+peli1.esSimilar2(peli2)+"\n\n"+peli1.imprimirCartel2()+"\n\n"+peli2.imprimirCartel2());
	}
}
