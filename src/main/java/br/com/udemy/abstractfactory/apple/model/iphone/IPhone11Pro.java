package br.com.udemy.abstractfactory.apple.model.iphone;

import br.com.udemy.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class IPhone11Pro extends IPhone {

	public IPhone11Pro(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardware() {
		System.out.println("Lista do Hardware (ficticio)");
		System.out.println("\t- Tela de 6.5 polegadas ");
		System.out.println("\t- Chipset A13 ");
		System.out.println("\t- RAM de 4Gb ");
		System.out.println("\t- Memoria de 512Gb");
	}

	@Override
	public String toString() {
		return "IPhone11Pro []";
	}

}
