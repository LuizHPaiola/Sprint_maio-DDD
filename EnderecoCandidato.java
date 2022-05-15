package Sprint_maio;

public class EnderecoCandidato {
	private String cepCd, logradouroCd, cidadeCd, estadoCd, paisCd;
	
	public String getCepCd() {
		return cepCd;
	}
	public void setCepCd(String cepCd) {
		this.cepCd = cepCd;
	}
	public String getLogradouroCd() {
		return logradouroCd;
	}
	public void setLogradouroCd(String logradouroCd) {
		this.logradouroCd = logradouroCd;
	}
	public String getCidadeCd() {
		return cidadeCd;
	}
	public void setCidadeCd(String cidadeCd) {
		this.cidadeCd = cidadeCd;
	}
	public String getEstadoCd() {
		return estadoCd;
	}
	public void setEstadoCd(String estadoCd) {
		this.estadoCd = estadoCd;
	}
	public String getPaisCd() {
		return paisCd;
	}
	public void setPaisCd(String paisCd) {
		this.paisCd = paisCd;
	}
	
	EnderecoCandidato(){
	}
	EnderecoCandidato(String cepCd, String logradouroCd, String cidadeCd, String estadoCd, String paisCd){
		this.cepCd=cepCd;
		this.logradouroCd=logradouroCd;
		this.cidadeCd=cidadeCd;
		this.estadoCd=estadoCd;
		this.paisCd=paisCd;
	}
}
