package service;

import static org.junit.Assert.*;

import java.util.ArrayList;

import dominio.*;

import org.junit.Test;

//Parte 2: Cria��o dos Testes Automatizados - Cria��o do teste para verificar se um paciente ser� atendido
//por um m�dico especializado correspondente com seus sintomas
public class ConsultaTest {

	@Test
	public void LigaSintomaPacienteEAreaMedico(){
	    ArrayList <String> palavras_chave = new ArrayList <String>();
	    palavras_chave.add("Cora��o");
	    palavras_chave.add("Sangue");
	    
	    ArrayList <String> palavras_chave2 = new ArrayList <String>();
	    palavras_chave2.add("C�rebro");
	    palavras_chave2.add("Cabe�a");

	    Especialidade cardiologista = new Especialidade(1, "Cardiologista", palavras_chave);
	    Medico joao = new Medico(1, "Jo�o", cardiologista);
	    
	    Especialidade neurologista = new Especialidade(1, "Neurologista", palavras_chave2);
	    Medico pedro = new Medico(2, "Pedro", neurologista);
	    
	    ArrayList <Medico> medicos = new ArrayList <Medico>();
	    medicos.add(joao);
	    medicos.add(pedro);

	    Sintoma pressao_alta = new Sintoma(1, "Press�o Alta", palavras_chave);

	    Paciente maria = new Paciente(1, "Maria");

	    ArrayList <Sintoma> sintomas = new ArrayList <Sintoma>();
	    sintomas.add(pressao_alta);

	    Consulta consulta = new Consulta(1, maria, sintomas);
	    
	    ArrayList <Medico> medicos_disponiveis = new ArrayList <Medico>();
	    medicos_disponiveis = consulta.buscaMedicosDisponiveis(medicos);

	    assertTrue(medicos_disponiveis.contains(joao));
	    assertFalse(medicos_disponiveis.contains(pedro));
	}

}
