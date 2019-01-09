package br.edu.ifnmg.jpql.model;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateful
public class ItemBean {
	
	@PersistenceContext(unitName="Exercicio02")
	private EntityManager entityManager;

	public void addItem(Item item) throws Exception{
		entityManager.persist(item);
	}
	
	public void remover(Item item) throws Exception{
		entityManager.remove(item);
	}
	
	
}
