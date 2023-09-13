package exerciciosMap;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String,String> dicionario;

	public Dicionario() {
		this.dicionario = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!dicionario.isEmpty()) {
			dicionario.remove(palavra);
		}
	}
	
	public void exibirPalavras() {
		System.out.println(dicionario);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		if(!dicionario.isEmpty()) {
			return dicionario.get(palavra);
		}else {
			throw new RuntimeException("A lista está vazia! ");
		}
	}
	
	
	public static void main (String[]args) {
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("Jogar", "É um ato de utilizar movimentos físicos em prol de alguma atividade");
		dicionario.exibirPalavras();
		dicionario.removerPalavra("Jogar");
		dicionario.exibirPalavras();
	}
	
}
