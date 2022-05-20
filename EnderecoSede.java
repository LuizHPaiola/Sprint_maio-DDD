package sprint_maio;

public class EnderecoSede {
	private String cepSd, logradouroSd, cidadeSd, estadoSd, paisSd;

	public String getCepSd() {
		return cepSd;
	}
	public void setCepSd(String cepSd) {
		this.cepSd = cepSd;
	}
	public String getLogradouroSd() {
		return logradouroSd;
	}
	public void setLogradouroSd(String logradouroSd) {
		this.logradouroSd = logradouroSd;
	}
	public String getCidadeSd() {
		return cidadeSd;
	}
	public void setCidadeSd(String cidadeSd) {
		this.cidadeSd = cidadeSd;
	}
	public String getEstadoSd() {
		return estadoSd;
	}
	public void setEstadoSd(String estadoSd) {
		this.estadoSd = estadoSd;
	}
	public String getPaisSd() {
		return paisSd;
	}
	public void setPaisSd(String paisSd) {
		this.paisSd = paisSd;
	}
	
	EnderecoSede(){
	}
	EnderecoSede(String cepSd, String logradouroSd, String cidadeSd, String estadoSd, String paisSd){
		this.cepSd=cepSd;
		this.logradouroSd=logradouroSd;
		this.cidadeSd=cidadeSd;
		this.estadoSd=estadoSd;
		this.paisSd=paisSd;
	}
}
