package br.com.udemy.abstractfactory.apple.factory.abstractfactory;

import br.com.udemy.abstractfactory.apple.model.certificate.Certificate;
import br.com.udemy.abstractfactory.apple.model.pack.Packing;

public interface CountryRulesAbstractFactory {

	Certificate getCertificates();

	Packing getPacking();
}
