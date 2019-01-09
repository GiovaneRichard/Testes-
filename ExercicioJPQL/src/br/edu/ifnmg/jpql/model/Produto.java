package br.edu.ifnmg.jpql.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQueries({ @NamedQuery(name = "nomeProdutos", query = "SELECT p FROM Produto p"), //nomeProdutos
		@NamedQuery(name = "nomePreco", query = "SELECT p FROM Produto p WHERE p.preco > 100"),
		@NamedQuery(name = "maiorMenorPreco", query = "SELECT p FROM Produto p"), // <--- alterar
		@NamedQuery(name = "produtoCategoria", query = "SELECT p FROM Produto p" ) })//JOIN p.Categoria c WHERE c.nome = :nomeCategoria") })
public class Produto {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// 1 Pra muitos
	@OneToMany(mappedBy = "produtos")
	private List<Item> itensProduto;

	// Muitos pra muitos com categoria
	@ManyToMany
	@JoinTable(name = "produto_categoria", joinColumns = @JoinColumn(name = "id_produto"), inverseJoinColumns = @JoinColumn(name = "id_categoria"))
	private List<Categoria> categorias;

	// Muitos pra muitos com Venda
	@ManyToMany
	@JoinTable(name = "produto_vendidos", joinColumns = @JoinColumn(name = "id_produto"), inverseJoinColumns = @JoinColumn(name = "id_venda"))
	private List<Venda> vendaProduto;

	private String nome;

	private BigDecimal preco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produtos: >>>>> " + getNome();
	}

}
