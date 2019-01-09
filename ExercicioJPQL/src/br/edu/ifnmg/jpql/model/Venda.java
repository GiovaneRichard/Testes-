package br.edu.ifnmg.jpql.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	// 1 pra muitos com a tabela Item
	@OneToMany(mappedBy = "vendas")
	//@JoinColumn(name = "fk_venda", nullable = false)
	private List<Item> itensVenda;

	// Muitos pra muitos com produto
	@ManyToMany(mappedBy = "vendaProduto")
	private List<Produto> produtosVendidos;

//	@ManyToMany
//	@JoinTable(name="produto_venda",joinColumns= @JoinColumn(name="id_produto"),
//				inverseJoinColumns= @JoinColumn(name="id_venda"))
//	private List<Venda> vendaProduto;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Item> getItensVenda() {
		return itensVenda;
	}

	public void setItensVenda(List<Item> itensVenda) {
		this.itensVenda = itensVenda;
	}

	public List<Produto> getVendaprodutos() {
		return produtosVendidos;
	}

	public void setVendaprodutos(List<Produto> vendaprodutos) {
		produtosVendidos = vendaprodutos;
	}

	// Venda/Produto

}
