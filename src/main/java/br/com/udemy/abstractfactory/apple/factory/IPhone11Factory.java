package br.com.udemy.abstractfactory.apple.factory;

import br.com.udemy.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhone;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhone11;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhone11Pro;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhoneLevel;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	protected IPhone createIPhone(IPhoneLevel level) {
		if (level == IPhoneLevel.STANDARD) {
			return new IPhone11(rules);
		} else if (level == IPhoneLevel.HIGH_END) {
			return new IPhone11Pro(rules);
		}

		return null;
	}

}
