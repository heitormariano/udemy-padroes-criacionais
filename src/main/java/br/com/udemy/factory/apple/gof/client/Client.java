package br.com.udemy.factory.apple.gof.client;

import br.com.udemy.factory.apple.gof.factory.IPhone11Factory;
import br.com.udemy.factory.apple.gof.factory.IPhone12Factory;
import br.com.udemy.factory.apple.gof.factory.IPhoneFactory;
import br.com.udemy.factory.apple.gof.model.IPhone;

public class Client {

	public static void main(String[] args) {

		IPhoneFactory iphone11Factory = new IPhone11Factory();
		IPhoneFactory iphone12Factory = new IPhone12Factory();

		System.out.println("### Ordering an iPhone 11 ###");
		IPhone iphone11 = iphone11Factory.orderIPhone();
		System.out.println("Objeto retornado " + iphone11 + "\n");

		System.out.println("### Ordering an iPhone 12 ###");
		IPhone iphone12 = iphone12Factory.orderIPhone();
		System.out.println("Objeto retornado " + iphone12 + "\n");

	}
}
