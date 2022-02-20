package es.iestetuan.MongoDB;

import java.util.List;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import es.iestetuan.ngg.dao.ILinea;
import es.iestetuan.ngg.vo.Linea;

public class LineaMongoDB implements ILinea {

	public void crear(Linea linea) {
		
		MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		MongoDatabase mongoDB = mongo.getDatabase("RedMetro"); //metemos el nombre de la BD
		
		

	}

	public void modificar(Linea linea) {
		// TODO Auto-generated method stub

	}

	public void eliminar(Linea linea) {
		// TODO Auto-generated method stub

	}

	public Linea getLineasporCod(int codLinea) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Linea> getListaLineas() {
		// TODO Auto-generated method stub
		return null;
	}

}
