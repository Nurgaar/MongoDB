package es.iestetuan.ngg.dao;

import java.util.List;

import es.iestetuan.ngg.vo.Linea;

public interface ILinea {

	public void crear(Linea linea);
	public void modificar(Linea linea);
	public void eliminar(Linea linea);	
	public Linea getLineasporCod(int codLinea);
	public List<Linea> getListaLineas();
}
