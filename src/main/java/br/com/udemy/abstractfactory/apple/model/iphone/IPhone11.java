package br.com.udemy.abstractfactory.apple.model.iphone;

import br.com.udemy.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class IPhone11 extends IPhone {

	public IPhone11(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardware() {
		System.out.println("Lista do Hardware (ficticio)");
		System.out.println("\t- Tela de 6.1 polegadas ");
		System.out.println("\t- Chipset A13 ");
		System.out.println("\t- RAM de 4Gb ");
		System.out.println("\t- Memoria de 256Gb");
	}

	@Override
	public String toString() {
		return "IPhone11 []";
	}


}
