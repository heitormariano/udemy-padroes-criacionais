package br.com.udemy.abstractfactory.apple.model.certificate;

public class BrazilianCertificate implements Certificate {

	public String applyCertification() {
		String strRetorno = "\t - Aplicando regras de certificacao do Brasil";
		strRetorno += "\n\t - Utilizacao do selo da Anatel ";

		return strRetorno;
	}

}
