package Sprint_maio;

public class Empresa {
	private int id;
	private String nome, cnpj;
	private Vagas vagas;
	private SedeEmpresa sede;
	
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Vagas getVagas() {
		return vagas;
	}

	public void setVagas(Vagas vagas) {
		this.vagas = vagas;
	}

	public SedeEmpresa getSede() {
		return sede;
	}

	public void setSede(SedeEmpresa sede) {
		this.sede = sede;
	}

	
	Empresa(){
		
	}
	
	Empresa(int id, String nome, String cnpj, Vagas vagas, SedeEmpresa sede){
		this.id=id;
		this.nome=nome;
		this.cnpj=cnpj;
		this.vagas=vagas;
		this.sede=sede;
	}

}
