package dominio;

//Parte 1: Criação do código - Criação da classe Medico
public class Medico {
	
	private int id;
	private String nome;
	private Especialidade especialidade;
	
	public Medico(int id) {
		this.id = id;
	}
	
	public Medico(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Medico(int id, String nome, Especialidade especialidade) {
		this.id = id;
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
}
