package exerciciosSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	private Set<String> setPalavras;

	public ConjuntoPalavrasUnicas() {
		this.setPalavras = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		setPalavras.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		if(!setPalavras.isEmpty()) {
			setPalavras.remove(palavra);
		}else {
			System.out.println("A lista está vazia! ");
		}
	}
	
	public void verificarPalavra(String palavra) {
		if(!setPalavras.isEmpty()) {
			for(String s : setPalavras) {
				if(s.equalsIgnoreCase(palavra)){
					System.out.println("A palavra "+palavra+" está presente no Set! ");
					break;
				}else {
					System.out.println("A palavra "+palavra+" não está presente no Set! ");
					break;
			}
		}
	  }
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(setPalavras);
	}
	
	@Override
	public String toString() {
		return "ConjuntoPalavrasUnicas [setPalavras=" + setPalavras + "]";
	}
	
	
	
	
	public static void main(String[]args) {
		ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();
		
		cpu.adicionarPalavra("Gabriel");
		cpu.adicionarPalavra("Thiago");
		cpu.adicionarPalavra("Rinaldo");
		
		cpu.exibirPalavrasUnicas();
		
		cpu.removerPalavra("Gabriel");
		
		cpu.exibirPalavrasUnicas();
		
		cpu.verificarPalavra("Thiago");
		cpu.verificarPalavra("Jorge");
	}
	
	
}
