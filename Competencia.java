package sprint_maio;

public class Competencia {
	private String nome;
	private int id;
	private FormacaoCandidato formacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public FormacaoCandidato getFormacao() {
		return formacao;
	}

	public void setFormacao(FormacaoCandidato formacao) {
		this.formacao = formacao;
	}

	Competencia() {

	}

	Competencia(String nome, int id, FormacaoCandidato formacao) {
		this.nome = nome;
		this.id = id;
		this.formacao = formacao;
	}
}
