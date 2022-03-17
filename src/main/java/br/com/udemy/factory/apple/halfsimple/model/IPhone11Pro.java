package br.com.udemy.factory.apple.halfsimple.model;

public class IPhone11Pro extends IPhone {

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
