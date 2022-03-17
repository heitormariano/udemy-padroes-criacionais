package br.com.udemy.abstractfactory.apple.client;

import br.com.udemy.abstractfactory.apple.factory.IPhone11Factory;
import br.com.udemy.abstractfactory.apple.factory.IPhone12Factory;
import br.com.udemy.abstractfactory.apple.factory.IPhoneFactory;
import br.com.udemy.abstractfactory.apple.factory.abstractfactory.BrazilianRulesAbstractFactory;
import br.com.udemy.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhone;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhoneLevel;

public class Client {

	public static void main(String[] args) {

		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		IPhoneFactory iphone11Factory = new IPhone11Factory(rules);
		IPhoneFactory iphone12Factory = new IPhone12Factory(rules);

		System.out.println("### Ordering an iPhone 11 ###");
		IPhone iphone11 = iphone11Factory.orderIPhone(IPhoneLevel.STANDARD);
		System.out.println("Object: " + iphone11 + "\n");

		System.out.println("### Ordering an iPhone 12 High end ###");
		IPhone iphone12 = iphone12Factory.orderIPhone(IPhoneLevel.HIGH_END);
		System.out.println("Object: " + iphone12 + "\n");
	}
}
