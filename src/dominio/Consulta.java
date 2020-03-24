package dominio;

import java.util.ArrayList;
import java.util.List;

//Parte 1: Criação do código - Criação da classe Consulta
public class Consulta {
	
	private int id;
	private Paciente paciente;
	private List <Sintoma> sintomas;
	private Medico medico;
	
	public Consulta(int id, Paciente paciente, List<Sintoma> sintomas) {
		this.id = id;
		this.paciente = paciente;
		this.sintomas = sintomas;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public List<Sintoma> getSintomas() {
		return sintomas;
	}
	
	public void addSintoma(Sintoma sintoma) {
		sintomas.add(sintoma);
	}
	
	public ArrayList<Medico> buscaMedicosDisponiveis(ArrayList <Medico> medicos){
		
		ArrayList <Medico> medicos_disponiveis = new ArrayList<Medico>();
		
		for(Medico m : medicos) {
			boolean achou = false;
					
			for(String e : m.getEspecialidade().getPalavras_chave()) {
				
				for(Sintoma s : this.sintomas) {
					
					for(String spc : s.getPalavras_chave()) {
						
						if (e.equals(spc)) {
							achou = true;
							medicos_disponiveis.add(m);
							break;
						}
						
					}
					
					if (achou)
						break;
				}
				
				if (achou)
					break;
			}
		}
		
		return medicos_disponiveis;
		
	}
}
