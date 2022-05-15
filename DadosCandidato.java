package Sprint_maio;

public class DadosCandidato {
	private TelefoneCandidato telefoneCandidato;
	private EnderecoCandidato enderecoCd;
	private String emailCandidato;
	
	public TelefoneCandidato getTelefoneCandidato() {
		return telefoneCandidato;
	}

	public void setTelefoneCandidato(TelefoneCandidato telefoneCandidato) {
		this.telefoneCandidato = telefoneCandidato;
	}

	public EnderecoCandidato getEnderecoCd() {
		return enderecoCd;
	}

	public void setEnderecoCd(EnderecoCandidato enderecoCd) {
		this.enderecoCd = enderecoCd;
	}

	public String getEmailCandidato() {
		return emailCandidato;
	}

	public void setEmailCandidato(String emailCandidato) {
		this.emailCandidato = emailCandidato;
	}

	public DadosCandidato(){
		
	}
	
	public DadosCandidato(TelefoneCandidato telefoneCandidato, EnderecoCandidato enderecoCd, String emailCandidato) {
		this.telefoneCandidato = telefoneCandidato;
		this.enderecoCd = enderecoCd;
		this.emailCandidato = emailCandidato;
	}
}