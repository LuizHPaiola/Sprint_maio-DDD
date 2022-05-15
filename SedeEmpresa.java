package Sprint_maio;

public class SedeEmpresa {
	private int idSede;
	private String nomeSede;
	private ContatoSede contatoSede;
	private EnderecoSede enderecoSede;
	
	public int getIdSede() {
		return idSede;
	}
	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}
	public String getNomeSede() {
		return nomeSede;
	}
	public void setNomeSede(String nomeSede) {
		this.nomeSede = nomeSede;
	}
	public ContatoSede getContatoSede() {
		return contatoSede;
	}
	public void setContatoSede(ContatoSede contatoSede) {
		this.contatoSede = contatoSede;
	}
	public EnderecoSede getEnderecoSede() {
		return enderecoSede;
	}
	public void setEnderecoSede(EnderecoSede enderecoSede) {
		this.enderecoSede = enderecoSede;
	}
	
	SedeEmpresa(){
		
	}
	SedeEmpresa(int idSede, String nomeSede, ContatoSede contatoSede, EnderecoSede enderecoSede){
		this.idSede=idSede;
		this.nomeSede=nomeSede;
		this.contatoSede=contatoSede;
		this.enderecoSede=enderecoSede;
	}
	
}
