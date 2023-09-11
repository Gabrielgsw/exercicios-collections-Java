package exerciciosList;
import java.util.*;


public class CarrinhoDeCompras {
	
	private List<Item> carrinhoList;
	
	public CarrinhoDeCompras() {
		this.carrinhoList = new ArrayList<>();
	}
	
	public CarrinhoDeCompras(List<Item> carrinhoList) {
		this.carrinhoList = carrinhoList;
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoList.add(new Item(nome,preco,quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> removerNome = new ArrayList<>();
		if(!removerNome.isEmpty()) {
			for(Item item: carrinhoList) {
				if(item.getNome().equalsIgnoreCase(nome));
				removerNome.add(item);
			}
			carrinhoList.removeAll(removerNome);
		}
		
		else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public void calcularValorTotal() {
		double valorTotal = 0;
		for(Item item: carrinhoList) {
			valorTotal += item.getPreco()*item.getQuantidade();
		}
		
		System.out.println("O valor total do carrinho é: "+valorTotal);
	}
	
	public String toString() {
		return carrinhoList;
	}
	
	
	public void exibirItens() {
		if(!carrinhoList.isEmpty()) {
			System.out.println(this.carrinhoList);
		}
	}
	
	
}
