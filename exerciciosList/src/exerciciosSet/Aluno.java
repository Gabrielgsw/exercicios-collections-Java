package exerciciosSet;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	
	private String nome;
	private Long matricula;
	private Double media;
	
	public Aluno(String nome, Long matricula, Double media)  {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(media, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(media, other.media) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + media + "]";
	}

	@Override
	public int compareTo(Aluno a) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(a.getNome());
	}
	
	
}

	class comparatorPorNota implements Comparator<Aluno>{
		@Override
		public int compare(Aluno a1, Aluno a2) {
			return Double.compare(a1.getMedia(), a2.getMedia());
		}
	}