package br.com.udemy.abstractfactory.apple.factory.abstractfactory;

import br.com.udemy.abstractfactory.apple.model.certificate.Certificate;
import br.com.udemy.abstractfactory.apple.model.certificate.USACertificate;
import br.com.udemy.abstractfactory.apple.model.pack.Packing;
import br.com.udemy.abstractfactory.apple.model.pack.USAPacking;

public class USARulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USACertificate();
	}

	public Packing getPacking() {
		return new USAPacking();
	}

}
