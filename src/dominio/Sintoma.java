package dominio;

import java.util.ArrayList;
import java.util.List;

//Parte 1: Criação do código - Criação da classe Sintoma
public class Sintoma {
	
	private int id;
	private String nome;
	private List <String> palavras_chave;
	
	public Sintoma(int id) {
		this.id = id;
		this.palavras_chave = new ArrayList<String>();
	}
	
	public Sintoma(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.palavras_chave = new ArrayList<String>();
	}
	
	public Sintoma(int id, String nome, List<String> palavras_chave) {
		this.id = id;
		this.nome = nome;
		this.palavras_chave = palavras_chave;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addPalavraChave(String palavra_chave) {
		this.palavras_chave.add(palavra_chave);
	}

	public List<String> getPalavras_chave() {
		return palavras_chave;
	}
}
