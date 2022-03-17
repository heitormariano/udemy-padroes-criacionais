package br.com.udemy.factory.apple.simple.client;

import br.com.udemy.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.udemy.factory.apple.simple.model.IPhone;

public class Client {

	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone (Standard and Generation 11) ###");
		IPhone iphone11 = IPhoneSimpleFactory.orderIphone("11", "standard");
		System.out.println("Objeto: " + iphone11 + "\n");

		System.out.println("### Ordering an iPhone (High end and Generation 12) ###");
		IPhone iphone12Pro = IPhoneSimpleFactory.orderIphone("12", "highend");
		System.out.println("Objeto: " + iphone12Pro + "\n");
	}
}
