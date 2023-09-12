package exerciciosSet;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	
	private Set<Tarefa> setTarefa;

	public ListaTarefas() {
		this.setTarefa = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		setTarefa.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		Set<String> tarefasRemovidas = new HashSet<>();
		if(!setTarefa.isEmpty()) {
			for(Tarefa t : setTarefa) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefasRemovidas.add(descricao);
					break;
				}else {
					throw new RuntimeException("A lista está vazia! ");
				}
			}
		}
		
	}
	
	public void exibirTarefas(){
		System.out.println(setTarefa);
	}
	
	public int contarTarefas() {
		return setTarefa.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		if(!setTarefa.isEmpty()) {
			for(Tarefa t : setTarefa) {
				if(t.getFoiConcluida().equals(true)) {
					tarefasConcluidas.add(t);
					
				}
			}
	  }else{
		 throw new RuntimeException("A lista está vazia! "); 
	  }
		return tarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		if(!setTarefa.isEmpty()) {
			for(Tarefa t : setTarefa) {
				if(t.getFoiConcluida().equals(false)) {
					tarefasPendentes.add(t);
					
				}
			}
	  }else{
		 throw new RuntimeException("A lista está vazia! "); 
	  }
		return tarefasPendentes;
	 }
	
	
	public void marcarTarefaConcluida(String descricao) {
		if(!setTarefa.isEmpty()) {
			for(Tarefa t : setTarefa) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setFoiConcluida(true);
				}
			
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		if(!setTarefa.isEmpty()) {
			for(Tarefa t : setTarefa) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setFoiConcluida(false);
				}
			
			}
		}
	}
	
	
	public void limparListaTarefas() {
		setTarefa.clear();
	}
}
	

