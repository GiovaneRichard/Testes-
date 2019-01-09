package br.edu.ifnmg.jpql.model;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateful
public class VendaBean {
	
	@PersistenceContext(unitName="Exercicio02")
	private EntityManager entityManager;
	
	public void addVenda(Venda venda) throws Exception {
		entityManager.persist(venda);
	}
	
	public void removeVenda(Venda venda) throws Exception {
		entityManager.remove(venda);
	}
	
	

}
