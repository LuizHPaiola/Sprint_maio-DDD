package sprint_maio;

import java.util.ArrayList;

public class TelefoneCandidato {
	private int dddCandidato, ddiCandidato;
	private String TelefoneCd;
	private ArrayList<String> TelefoneFormatado;

	public int getDddCandidato() {
		return this.dddCandidato;
	}

	public void setDddCandidato(int dddCandidato) {
		this.dddCandidato = dddCandidato;
	}

	public int getDdiCandidato() {
		return this.ddiCandidato;
	}

	public void setDdiCandidato(int ddiCandidato) {
		this.ddiCandidato = ddiCandidato;
	}

	public String getTelefoneCd() {
		return this.TelefoneCd;
	}

	public void setTelefoneCd(String telefoneCd) {
		this.TelefoneCd = telefoneCd;
	}

	public ArrayList<String> getTelFormatado() {
		return TelefoneFormatado;
	}

	public void setTelFormatado(ArrayList<String> TelefoneFormatado) {
		this.TelefoneFormatado = TelefoneFormatado;
	}

	TelefoneCandidato() {

	}

	TelefoneCandidato(int dddCandidato, int ddiCandidato, String TelefoneCd, ArrayList<String> TelefoneFormatado) {
		this.dddCandidato = dddCandidato;
		this.ddiCandidato = ddiCandidato;
		this.TelefoneCd = TelefoneCd;
		this.TelefoneFormatado = TelefoneFormatado;
	}

	public String exibirTelefoneCd() {
		String txt = "+" + ddiCandidato + " (" + dddCandidato + ")" + TelefoneCd;
		return txt;
	}

}
