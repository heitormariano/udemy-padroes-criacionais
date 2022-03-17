package br.com.udemy.factory.apple.halfsimple.model;

public abstract class IPhone {

	public abstract void getHardware();

	public void assemble() {
		System.out.println("Montagem de todos os componentes");
	}

	public void certificates() {
		System.out.println("Testando todos os certificados");
	}

	public void pack() {
		System.out.println("Embalando/preparando o dispositivo");
	}
}
