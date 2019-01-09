package br.edu.ifnmg.jpql.model;

import java.util.List;


import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateful
public class ProdutoBean {
	
	@PersistenceContext(unitName="Exercicio02")
	private EntityManager entityManager;
	
	public void addProduto(Produto produto) throws Exception{
		entityManager.persist(produto);
	}
	
	public void removeProduto(Produto produto) throws Exception{
		entityManager.remove(produto);
	}
	
	// Questão 2)
	public List<Produto> getTodosProdutos() throws Exception{
		TypedQuery<Produto> tq = entityManager.createNamedQuery("nomeProdutos", Produto.class);
		
		return tq.getResultList();
	}
	
	// Questão 4)
	public List<Produto> getNomePreco() throws Exception{
		TypedQuery<Produto> tq = entityManager.createNamedQuery("nomePreco", Produto.class);
		
		return tq.getResultList();
	}
	
	//QUESTÃO 5)
	public Produto getMaiorMenorPreco() throws Exception{
		TypedQuery<Produto> tq = entityManager.createNamedQuery("maiorMenorPreco", Produto.class);
		
		return tq.getSingleResult();
	}
	
	//QUESTÃO 6)
	public List<Produto> getProdutoCategoria(String categoria) throws Exception{
		TypedQuery<Produto> tq = entityManager.createNamedQuery("produtoCategoria", Produto.class);
		tq.setParameter("nomeCategoria", categoria);
		
		return tq.getResultList();
	}
	
	
}
