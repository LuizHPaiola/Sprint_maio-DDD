package sprint_maio;

public class FormacaoCandidato {
	private String escolaridade;
	private String inicioCurso;
	private String terminoCurso;
	private String localFormacao;
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getInicioCurso() {
		return inicioCurso;
	}
	public void setInicioCurso(String inicioCurso) {
		this.inicioCurso = inicioCurso;
	}
	public String getTerminoCurso() {
		return terminoCurso;
	}
	public void setTerminoCurso(String terminoCurso) {
		this.terminoCurso = terminoCurso;
	}
	public String getLocalFormacao() {
		return localFormacao;
	}
	public void setLocalFormacao(String localFormacao) {
		this.localFormacao = localFormacao;
	}
	FormacaoCandidato(){
	}
	FormacaoCandidato(String escolaridade, String inicioCurso, String terminoCurso, String localFormacao){
		this.escolaridade=escolaridade;
		this.inicioCurso=inicioCurso;
		this.terminoCurso=terminoCurso;
		this.localFormacao=localFormacao;
	}
}
