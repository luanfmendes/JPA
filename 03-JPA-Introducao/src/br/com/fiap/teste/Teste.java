package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criar um gerenciador de entidades:
		//Primeiro cria a fábrica:
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		//Depois, a fabrica cria os Entity Manager
		EntityManager em = fabrica.createEntityManager();
		
		fabrica.close();
	}


}
