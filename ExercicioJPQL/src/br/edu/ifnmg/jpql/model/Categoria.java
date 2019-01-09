package br.edu.ifnmg.jpql.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
	@NamedQuery(name = "buscarTodasCategorias", query = "SELECT c FROM Categoria c"),
	@NamedQuery(name="produtosNaoCadastrados", query= "SELECT c FROM Categoria c WHERE c.produtosCategoria IS EMPTY"),
	@NamedQuery(name = "buscaCategoria", query = "SELECT c FROM Categoria c WHERE c.id= :id")})
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// muitos pra muitos
	@ManyToMany(mappedBy="categorias")
	private List<Produto> produtosCategoria;
	
	
	private String nome;
	
	private List<Produto> produtos;

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
	
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Produto> getProdutosCategoria() {
		return produtosCategoria;
	}

	public void setProdutosCategoria(List<Produto> produtosCategoria) {
		this.produtosCategoria = produtosCategoria;
	}

	@Override
	public String toString() {
		return "Categoria: ....... " + getNome();
	}

}
