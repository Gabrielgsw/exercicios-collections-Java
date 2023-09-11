package exerciciosList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.lang.RuntimeException;

public class OrdenacaoNumeros implements Comparable<Integer> {
	
	private List<Integer> listaNumeros;

	
	
	public OrdenacaoNumeros() {
		this.listaNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		this.listaNumeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> ordemAscendente = new ArrayList<>(this.listaNumeros);
		if(!listaNumeros.isEmpty()) {
			Collections.sort(ordemAscendente);
			
		}else {
			System.out.println("A lista está vazia! ");
		}
		return ordemAscendente;
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void exibirNumeros() {
	    if (!listaNumeros.isEmpty()) {
	      System.out.println(this.listaNumeros);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	  }
	
	
	public List<Integer> ordenarDescendente(){
		List<Integer> ordemAscendente = new ArrayList<>(this.listaNumeros);
		if(!listaNumeros.isEmpty()) {
			ordemAscendente.sort(Collections.reverseOrder());
			return ordenarAscendente();
		}else {
			throw new RuntimeException("A lista está vazia! ");
		}
		
	}

	
	

	public static void main(String[] args) {
		OrdenacaoNumeros on = new OrdenacaoNumeros();
		on.adicionarNumero(1);
		on.exibirNumeros();
	}

}