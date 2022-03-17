package br.com.udemy.factory.apple.halfsimple.client;

import br.com.udemy.factory.apple.halfsimple.factory.IPhone11Factory;
import br.com.udemy.factory.apple.halfsimple.factory.IPhone12Factory;
import br.com.udemy.factory.apple.halfsimple.factory.IPhoneFactory;
import br.com.udemy.factory.apple.halfsimple.model.IPhone;

public class Client {

	public static void main(String[] args) {

		IPhoneFactory iphone11Factory = new IPhone11Factory();
		IPhoneFactory iphone12Factory = new IPhone12Factory();

		System.out.println("### Ordering an iPhone 11 (Standard) ###");
		IPhone iphone11 = iphone11Factory.orderIPhone("standard");
		System.out.println("Objeto retornado " + iphone11 + "\n");

		System.out.println("### Ordering an iPhone 12 (High end) ###");
		IPhone iphone12 = iphone12Factory.orderIPhone("highend");
		System.out.println("Objeto retornado " + iphone12 + "\n");

	}
}
