package br.com.udemy.abstractfactory.apple.model.iphone;

import br.com.udemy.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public abstract class IPhone {

	CountryRulesAbstractFactory rules;

	public IPhone(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public abstract void getHardware();

	public void assemble() {
		System.out.println("Montagem de todos os componentes");
	}

	public void certificates() {
		System.out.println("Testando todos os certificados");
		System.out.println(rules.getCertificates().applyCertification());
	}

	public void pack() {
		System.out.println("Embalando/preparando o dispositivo");
		System.out.println(rules.getPacking().pack());
	}
}
