package br.com.udemy.abstractfactory.apple.factory;

import br.com.udemy.abstractfactory.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhone;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhone12;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhone12Pro;
import br.com.udemy.abstractfactory.apple.model.iphone.IPhoneLevel;

public class IPhone12Factory extends IPhoneFactory {

	public IPhone12Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	protected IPhone createIPhone(IPhoneLevel level) {
		if (level == IPhoneLevel.STANDARD) {
			return new IPhone12(rules);
		} else if (level == IPhoneLevel.HIGH_END) {
			return new IPhone12Pro(rules);
		}

		return null;
	}

}
