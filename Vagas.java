package sprint_maio;

public class Vagas {
	private int quantidade, id;
	private String nome, especialidade;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	Vagas() {

	}

	Vagas(String nome, int quantidade, int id, String especialidade) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.id = id;
		this.especialidade = especialidade;
	}

}
