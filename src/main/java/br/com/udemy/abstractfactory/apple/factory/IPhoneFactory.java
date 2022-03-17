package br.com.udemy.abstractfactory.apple.factory;

import br.com.udemy.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhone;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhoneLevel;

public abstract class IPhoneFactory {

	CountryRulesAbstractFactory rules;

	public IPhoneFactory(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public IPhone orderIPhone(IPhoneLevel level) {
		IPhone device = null;

		device = createIPhone(level);

		if (device != null) {
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();
		}

		return device;
	}

	protected abstract IPhone createIPhone(IPhoneLevel level);
}
