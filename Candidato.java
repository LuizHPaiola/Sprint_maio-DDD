package sprint_maio;

public class Candidato {
	private int id;
	private String nome, cpf;
	private Competencia competencia;
	private DadosCandidato dados;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Competencia getCompetencia() {
		return competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	public DadosCandidato getDados() {
		return dados;
	}

	public void setDados(DadosCandidato dados) {
		this.dados = dados;
	}

	Candidato() {
	}

	Candidato(int id, String nome, String cpf, Competencia competencia, DadosCandidato dados) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.competencia = competencia;
		this.dados = dados;
	}
}
