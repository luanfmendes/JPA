package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.EmpresaDAO;
import br.com.fiap.dao.impl.EmpresaDAOImpl;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;

public class RemoveTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		EmpresaDAO dao = new EmpresaDAOImpl(em);
		
		//Apagar Empresa
		
		try {
			dao.excluir(1);
			dao.commit();
			System.out.println("Empresa Excluida com Sucesso");
			
		} catch (CodigoInexistenteException e) {
			e.printStackTrace();
			System.err.println("Empresa n�o Encontrada");
		}catch (CommitException e){
			e.printStackTrace();
			System.err.println("Erro ao excluir");
		}
		
		em.close();
		fabrica.close();

	}

}
