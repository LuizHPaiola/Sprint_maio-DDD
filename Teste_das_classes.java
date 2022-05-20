package sprint_maio;

import java.util.ArrayList;

public class Teste_das_classes {

	public static void main(String[] args) {
		Candidato candidato = new Candidato();
		//Teste da classe candidato
		int idCandidato=1;
		String nomeCandidato = "Luiz", cpfCandidato="123.456.789-0";
		candidato.setId(idCandidato);
		candidato.setNome(nomeCandidato);
		candidato.setCpf(cpfCandidato);
		
		System.out.printf("Teste da classe 'Candidato'\n");
		System.out.printf("Id do candidato: %d\n"
				+ "Nome do candidato: %s\n"
				+ "CPF do candidato: %s\n",candidato.getId(),candidato.getNome(),candidato.getCpf());
		
		//Teste da classe Competencia
		Competencia competencia = new Competencia();
		int idCompetencia = 1;
		String nomeCompetencia = "Competencia1";
		
		competencia.setId(idCompetencia);
		competencia.setNome(nomeCompetencia);
		candidato.setCompetencia(competencia);
		
		System.out.printf("\nTeste da classe 'Competencia'\n");
		System.out.printf("Id da competencia: %d\n"
						+ "Nome da competencia: %s\n",candidato.getCompetencia().getId(),candidato.getCompetencia().getNome());
		
		//Teste da classe FormacaoCandidato
		FormacaoCandidato formacao = new FormacaoCandidato();
		String escolaridade = "fundamental completo",inicioCurso = "18/12/2002",terminoCurso = "23/03/2005",localFormacao = "FIAP";
		
		formacao.setEscolaridade(escolaridade);
		formacao.setInicioCurso(inicioCurso);
		formacao.setTerminoCurso(terminoCurso);
		formacao.setLocalFormacao(localFormacao);
		candidato.getCompetencia().setFormacao(formacao);
		System.out.printf("\nTeste da classe 'FormacaoCandidato'\n");
		System.out.printf("Escolaridade: %s\n"
						+ "Inicio do curso: %s\n"
						+ "Termino do curso: %s\n"
						+ "Local de formação: %s\n",candidato.getCompetencia().getFormacao().getEscolaridade(),candidato.getCompetencia().getFormacao().getInicioCurso(),candidato.getCompetencia().getFormacao().getTerminoCurso(),candidato.getCompetencia().getFormacao().getLocalFormacao());
		
		//Teste da classe DadosCandidato
		DadosCandidato dadosCandidato = new DadosCandidato();
		String emailCandidato = "luizhpaiola@gmail.com";
		
		dadosCandidato.setEmailCandidato(emailCandidato);
		candidato.setDados(dadosCandidato);
		System.out.printf("\nTeste da classe 'DadosCandidato'\n");
		System.out.printf("Email do candidato: %s\n",candidato.getDados().getEmailCandidato());
		
		//Teste da classe EnderecoCandidato
		EnderecoCandidato enderecoCandidato = new EnderecoCandidato();
		String cepCd = "12-345-56", logradouroCd = "r. pedro alves", cidadeCd = "Santo André", estadoCd = "SP", paisCd = "Brasil";
		
		enderecoCandidato.setCepCd(cepCd);
		enderecoCandidato.setCidadeCd(cidadeCd);
		enderecoCandidato.setEstadoCd(estadoCd);
		enderecoCandidato.setLogradouroCd(logradouroCd);
		enderecoCandidato.setPaisCd(paisCd);
		candidato.getDados().setEnderecoCd(enderecoCandidato);
		System.out.printf("\nTeste da classe 'EnderecoCandidato'\n");
		System.out.printf("CEP do candidato: %s\n"
						+ "Cidade do candidato: %s\n"
						+ "Estado do candidato: %s\n"
						+ "Logradouro do candidato: %s\n"
						+ "Pais do candidato: %s\n",candidato.getDados().getEnderecoCd().getCepCd(),candidato.getDados().getEnderecoCd().getCidadeCd(),candidato.getDados().getEnderecoCd().getEstadoCd(),candidato.getDados().getEnderecoCd().getLogradouroCd(),candidato.getDados().getEnderecoCd().getPaisCd());
		
		//Teste da classe 'TelefoneCandidato"
		TelefoneCandidato telefoneCandidato = new TelefoneCandidato();
		ArrayList<TelefoneCandidato> telefoneCd = new ArrayList<>();
		int ddiCandidato = 55, dddCandidato = 11;
		String TelefoneCd = "96740-1812";
		telefoneCandidato.setDddCandidato(dddCandidato);
		telefoneCandidato.setDdiCandidato(ddiCandidato);
		telefoneCandidato.setTelefoneCd(TelefoneCd);
		candidato.getDados().setTelefoneCandidato(telefoneCandidato);
		telefoneCd.add(telefoneCandidato);
		candidato.getDados().getTelefoneCandidato().setTelFormatado(new ArrayList<>());
		System.out.printf("Teste da classe 'TelefoneCandidato'\n");
		System.out.printf("Telefone formatado: %s",candidato.getDados().getTelefoneCandidato().exibirTelefoneCd());
	}

}
