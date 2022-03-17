package br.com.udemy.abstractfactory.apple.factory.abstractfactory;

import br.com.udemy.abstractfactory.apple.model.certificate.BrazilianCertificate;
import br.com.udemy.abstractfactory.apple.model.certificate.Certificate;
import br.com.udemy.abstractfactory.apple.model.pack.BrazilianPacking;
import br.com.udemy.abstractfactory.apple.model.pack.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
