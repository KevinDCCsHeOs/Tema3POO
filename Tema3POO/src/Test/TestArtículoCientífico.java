package Test;

import EntradaSalida.Tools;
import TDA.ArtículoCientífico;

public class TestArtículoCientífico {
	public static void main(String[] args) {
		CapturaArtículos();
	}
	public static void CapturaArtículos() {
		ArtículoCientífico arti=new ArtículoCientífico( Tools.leerString("Nombre del Artículo Científico: "),
														Tools.leerString("Autor del Artículo Científico:"),
														Tools.leerString("Palabras Clave del Artículo Científico: "),
														Tools.leerString("Nombre de la publicación del Artículo Científico: "),
														Tools.leerShort("Año de publicación del Artículo Científico: "),
														Tools.leerString("Resumen del Artículo Científico: "));
		Tools.imprimePantalla("Datos del Artículo Científico capturados:\n\n"+arti.toString());
	}
}
