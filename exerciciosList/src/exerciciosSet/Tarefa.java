package exerciciosSet;

public class Tarefa {
	
	private String descricao;
	private Boolean foiConcluida;
	
	public Tarefa(String descricao, Boolean foiConcluida) {
		this.descricao = descricao;
		this.foiConcluida = foiConcluida;
	}

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getFoiConcluida() {
		return foiConcluida;
	}

	public void setFoiConcluida(Boolean foiConcluida) {
		this.foiConcluida = foiConcluida;
	}

	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + ", foiConcluida=" + foiConcluida + "]";
	}
	
	
	
	
}
