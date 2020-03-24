package dominio;

//Parte 1: Cria��o do c�digo - Cria��o da classe Paciente
public class Paciente {
	
	private int id;
	private String nome;
	
	public Paciente(int id) {
		this.id = id;
	}
	
	public Paciente(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
