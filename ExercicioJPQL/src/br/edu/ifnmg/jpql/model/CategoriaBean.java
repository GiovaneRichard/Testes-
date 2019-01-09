package br.edu.ifnmg.jpql.model;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateful
public class CategoriaBean {
	
	@PersistenceContext(unitName="Exercicio02")
	private EntityManager entityManager;
	
	public void addCategoria(Categoria categoria) throws Exception{
		entityManager.persist(categoria);
	}
	
	public void removeCategoria(Categoria categoria) throws Exception{
		entityManager.remove(categoria);
	}
	
	public Categoria getCategoria(Long id) throws Exception{
		TypedQuery<Categoria> tq = entityManager.createNamedQuery("buscaCategoria", Categoria.class);
		
		return tq.getSingleResult();
	}
	
	public List<Categoria> getTodasCategorias()throws Exception{
		TypedQuery<Categoria> tq = entityManager.createNamedQuery("buscarTodasCategorias", Categoria.class);
		
		return tq.getResultList();
	}
	
	public List<Categoria> getProdNaoCadastCategoria() throws Exception{
		TypedQuery<Categoria> tq = entityManager.createNamedQuery("produtosNaoCadastrados", Categoria.class);
		
		return tq.getResultList();
	}
	
	
}
