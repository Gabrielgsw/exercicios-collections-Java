package exerciciosList;
import java.util.List;

import java.util.ArrayList;

public class Item {

	private String nome;
	private Double preco;
	private Integer quantidade;
	
	private List<Item> itens = new ArrayList<>();
	
	
	public Item(List<Item> itens) {
		
		this.itens = itens;
	}
	public List<Item> getItens() {
		return itens;
	}
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	public Item(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return getNome()+": "+getPreco()+", Quantidade: "+getQuantidade();
	}
	

}
