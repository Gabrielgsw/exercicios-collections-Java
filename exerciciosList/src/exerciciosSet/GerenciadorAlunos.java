package exerciciosSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class GerenciadorAlunos {
	
	private Set<Aluno> listaAlunos;

	public GerenciadorAlunos() {
		this.listaAlunos = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, Long matricula, double media) {
		listaAlunos.add(new Aluno(nome, matricula, media));
	}
	
	
	public void removerAluno(long matricula) {
		Set<Aluno> alunosRemovidos = new HashSet<>();
		if(!listaAlunos.isEmpty()) {
			for(Aluno a : listaAlunos) {
				if(a.getMatricula().equals(matricula)) {
					alunosRemovidos.add(a);
					break;
				}
			}
			listaAlunos.removeAll(alunosRemovidos);
		}
	}
	
	public void exibirAlunosPorNome(){
		Set<Aluno> alunosNome = new TreeSet<>(listaAlunos);
		if(!listaAlunos.isEmpty()) {
			System.out.println(alunosNome);;
			}else {
				throw new RuntimeException("A lista está vazia! ");
			}
		}
	
	
	public void exibirAlunosPorNota(){
		Set<Aluno> alunosNota = new TreeSet<>(new comparatorPorNota());
		if(!listaAlunos.isEmpty()) {
			alunosNota.addAll(listaAlunos);
			System.out.println(alunosNota);;
		}else {
			throw new RuntimeException("A lista está vazia! ");
		}
	}
	
	public void exibirAlunos() {
		System.out.println(listaAlunos);
	}
	
	public static void main(String[]args) {
		GerenciadorAlunos aluno = new GerenciadorAlunos();
		aluno.adicionarAluno("Gabriel",132123L, 7.1);
		aluno.adicionarAluno("jao",222123L, 7.4);
		aluno.exibirAlunosPorNota();
	}
	
	
 }
	

