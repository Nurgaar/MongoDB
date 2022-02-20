package es.iestetuan.ngg.vo;

import java.util.List;



public class Linea {

	
	private int codLinea;	
	private String nombreCorto;	
	private String nombreLargo;	
	private int kilometros;		
	private Color color;	
	private List<Linea>lineaestacion;
	
	

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getCodLinea() {
		return codLinea;
	}
	public void setCodLinea(int codLinea) {
		this.codLinea = codLinea;
	}
	public String getNombreCorto() {
		return nombreCorto;
	}
	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}
	public String getNombreLargo() {
		return nombreLargo;
	}
	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	public List<Linea> getLineaestacion() {
		return lineaestacion;
	}
	public void setLineaestacion(List<Linea> lineaestacion) {
		this.lineaestacion = lineaestacion;
	}
}
