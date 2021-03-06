package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.EmpresaDAO;
import br.com.fiap.dao.impl.EmpresaDAOImpl;
import br.com.fiap.entity.Empresa;

public class PesquisaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		EmpresaDAO dao = new EmpresaDAOImpl(em);
		
		//Atualizar uma Empresa
		Empresa empresa = dao.pesquisar(2);
				
		System.out.println(empresa.getNome());
		System.out.println(empresa.getCnpj());
		System.out.println(empresa.getStatus());
		
		em.close();
		fabrica.close();
	}

}
