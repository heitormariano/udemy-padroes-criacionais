package br.com.udemy.factory.apple.halfsimple.model;

public class IPhone12Pro extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Lista do Hardware (ficticio)");
		System.out.println("\t- Tela de 7.5 polegadas ");
		System.out.println("\t- Chipset A13 ");
		System.out.println("\t- RAM de 8Gb ");
		System.out.println("\t- Memoria de 1Tb");
	}

	@Override
	public String toString() {
		return "IPhone12Pro []";
	}

}
