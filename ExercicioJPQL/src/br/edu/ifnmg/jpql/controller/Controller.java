//package br.edu.ifnmg.jpql.controller;
//
//import java.io.IOException;
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.ejb.EJB;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import br.edu.ifnmg.model.Categoria;
//import br.edu.ifnmg.model.CategoriaBean;
//import br.edu.ifnmg.model.Item;
//import br.edu.ifnmg.model.ItemBean;
//import br.edu.ifnmg.model.Produto;
//import br.edu.ifnmg.model.ProdutoBean;
//import br.edu.ifnmg.model.Venda;
//import br.edu.ifnmg.model.VendaBean;
//
///**
// * Servlet implementation class Controller
// */
//@WebServlet("/Controller")
//public class Controller extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	@EJB
//	VendaBean vendaBean;
//	@EJB
//	ProdutoBean produtoBean;
//	@EJB
//	ItemBean itemBean;
//	@EJB
//	CategoriaBean categoriaBean;
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		try {
//
//			Produto p1 = new Produto();
//			p1.setNome("Fonte ATX EVGA 850W semi modular");
//			p1.setPreco(new BigDecimal("450.00"));
//			produtoBean.addProduto(p1);
//
//			Produto p2 = new Produto();
//			p2.setNome("Memória HyperX DDR4 8GB");
//			p2.setPreco(new BigDecimal("380.00"));
//			produtoBean.addProduto(p2);
//			
//			Produto p3 = new Produto();
//			p3.setNome("Gabinete ATX Gladiador");
//			p3.setPreco(new BigDecimal("250.00"));
//			produtoBean.addProduto(p3);
//			
//			Produto p4 = new Produto();
//			p4.setNome("Smartphone LG K10");
//			p4.setPreco(new BigDecimal("764.59"));
//			produtoBean.addProduto(p4);
//			
//			Produto p5 = new Produto();
//			p5.setNome("Smartphone Asus Zenfone 4");
//			p5.setPreco(new BigDecimal("1280.90"));
//			produtoBean.addProduto(p5);
//
//			Produto p6 = new Produto();
//			p6.setNome("Smartphone Motorola Moto G6");
//			p6.setPreco(new BigDecimal("999.90"));
//			produtoBean.addProduto(p6);
//
//			Produto p7 = new Produto();
//			p7.setNome("BFV");
//			p7.setPreco(new BigDecimal("319.00"));
//			produtoBean.addProduto(p7);
//
//			Produto p8 = new Produto();
//			p8.setNome("BFV4");
//			p8.setPreco(new BigDecimal("150.00"));
//			produtoBean.addProduto(p8);
//
//			Categoria c1 = new Categoria();
//			c1.setNome("Informática");
//			List<Produto> prod_Informatica = new ArrayList<>();
//			prod_Informatica.add(p1);
//			prod_Informatica.add(p3);
//			prod_Informatica.add(p3);
//			c1.setProdutos(prod_Informatica);
//			c1.setProdutosCategoria(prod_Informatica);
//			categoriaBean.addCategoria(c1);
//
//			Categoria c2 = new Categoria();
//			c2.setNome("Smartphones");
//			List<Produto> prod_smartphone = new ArrayList<>();
//			prod_smartphone.add(p4);
//			prod_smartphone.add(p5);
//			prod_smartphone.add(p6);
//			c2.setProdutos(prod_smartphone);
//			c2.setProdutosCategoria(prod_smartphone);
//			categoriaBean.addCategoria(c2);
//
//			Categoria c3 = new Categoria();
//			c3.setNome("Gamer");
//			List<Produto> prod_gamer = new ArrayList<>();
//			prod_gamer.add(p7);
//			prod_gamer.add(p8);
//			c3.setProdutos(prod_gamer);
//			c3.setProdutosCategoria(prod_gamer);
//			categoriaBean.addCategoria(c3);
//
//			Categoria c4 = new Categoria();
//			c4.setNome("Eletrônicos");
//			categoriaBean.addCategoria(c4);
//			
//			Venda v1 = new Venda();
//			List<Produto> prod_vendidos1 = new ArrayList<>();
//			List<Item> item_vendidos1 = new ArrayList<>();
//			vendaBean.addVenda(v1);
//			
//			Venda v2 = new Venda();
//			List<Produto> prod_vendidos2 = new ArrayList<>();
//			List<Item> item_vendidos2 = new ArrayList<>();
//			vendaBean.addVenda(v2);
//			
//			Item it1 = new Item();
//			it1.setProdutos(p1);
//			it1.setQtde(55);
//			it1.setVendas(v1);
//			itemBean.addItem(it1);
//
//			Item it2 = new Item();
//			it2.setProdutos(p2);
//			it2.setQtde(105);
//			it2.setVendas(v1);
//			itemBean.addItem(it2);
//
//			Item it3 = new Item();
//			it3.setProdutos(p3);
//			it3.setQtde(200);
//			it3.setVendas(v2);
//			itemBean.addItem(it3);
//
//			//.......... BUSCAS ............
//			
////			//QUESTÃO 01
////			List<Categoria> nomeCategorias = categoriaBean.getTodasCategorias();
////			for(Categoria c: nomeCategorias) {
////				System.out.println(c.toString());
////			}
//			
////			//QUESTÃO 02
////			List<Produto>nomeProdutos = produtoBean.getTodosProdutos();
////			for(Produto p: nomeProdutos) {
////				System.out.println(p.getNome());
////			}
//			
////			//QUESTÃO 03
////			List<Categoria> produtosNaoCadastrados = categoriaBean.getProdNaoCadastCategoria();
////			for(Categoria c: produtosNaoCadastrados) {
////				System.out.println("Produt não cadastrados: " + c.getNome());
////			}
//			
//			//QUESTÃO 04
//			List<Produto> nomePreco = produtoBean.getNomePreco();
//			for(Produto p: nomePreco) {
//				System.out.println(">>>>> " + p.getNome() + "  " + p.getPreco());
//			}
//			
//			//QUESTÃO 05
//			
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
