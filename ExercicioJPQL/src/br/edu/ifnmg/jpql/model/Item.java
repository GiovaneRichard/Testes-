package br.edu.ifnmg.jpql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_venda")
	private Venda vendas;
	
	@ManyToOne
	@JoinColumn(name="id_produto")
	private Produto produtos;
	
	private Integer qtde;
	
	public void Item(Integer qtde) {
		this.qtde = qtde;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public Venda getVendas() {
		return vendas;
	}

	public void setVendas(Venda vendas) {
		this.vendas = vendas;
	}

	public Produto getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto produtos) {
		this.produtos = produtos;
	}
	
	

}
