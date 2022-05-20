package sprint_maio;
public class ContatoSede {
	private int ddiSede, dddSede;
	private String TelefoneSede, emailSede;

	public int getDdiSede() {
		return ddiSede;
	}

	public void setDdiSede(int ddiSede) {
		this.ddiSede = ddiSede;
	}

	public int getDddSede() {
		return dddSede;
	}

	public void setDddSede(int dddSede) {
		this.dddSede = dddSede;
	}

	public String getTelefoneSede() {
		return TelefoneSede;
	}

	public void setTelefoneSede(String telefoneSede) {
		TelefoneSede = telefoneSede;
	}

	public String getEmailSede() {
		return emailSede;
	}

	public void setEmailSede(String emailSede) {
		this.emailSede = emailSede;
	}


	ContatoSede() {

	}

	ContatoSede(int ddiSede, int dddSede, String TelefoneSede, String emailSede) {
		this.ddiSede = ddiSede;
		this.dddSede = dddSede;
		this.TelefoneSede = TelefoneSede;
		this.emailSede = emailSede;
	}
	
	public String exibirTelefoneSede() {
		String txt = "+" + ddiSede + " (" + dddSede + ")" + TelefoneSede;
		return txt;
	}

}

