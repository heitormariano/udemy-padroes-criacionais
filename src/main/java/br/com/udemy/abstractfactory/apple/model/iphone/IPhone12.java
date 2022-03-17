package br.com.udemy.abstractfactory.apple.model.iphone;

import br.com.udemy.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class IPhone12 extends IPhone {

	public IPhone12(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardware() {
		System.out.println("Lista do Hardware (ficticio)");
		System.out.println("\t- Tela de 7.1 polegadas ");
		System.out.println("\t- Chipset A13 ");
		System.out.println("\t- RAM de 8Gb ");
		System.out.println("\t- Memoria de 512Gb");
	}

	@Override
	public String toString() {
		return "IPhone12 []";
	}

}
