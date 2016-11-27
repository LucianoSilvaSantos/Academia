package br.com.Academia.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaConexao {
	
	public static EntityManager obterConexao(){
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("forcabruta");
		return fabrica.createEntityManager();
		
		
	}

}
