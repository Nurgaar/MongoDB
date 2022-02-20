package es.iestetuan.ngg;

import es.iestetuan.ngg.JSON.LineaJSON;
import es.iestetuan.ngg.utilidades.ParseoJackson;

public class AppPruebaProyecto {

	public static void main(String[] args) {

		ParseoJackson parseo = new ParseoJackson();
		LineaJSON[] lineas = parseo.obtenerLineasURL();
		
		for(LineaJSON linea : lineas){
			System.out.println(linea);
		
		}
	}

}
