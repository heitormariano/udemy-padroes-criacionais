package br.com.udemy.factory.apple.halfsimple.factory;

import br.com.udemy.factory.apple.halfsimple.model.IPhone;
import br.com.udemy.factory.apple.halfsimple.model.IPhone11;
import br.com.udemy.factory.apple.halfsimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone(String level) {
		if ("standard".equals(level)) {
			return new IPhone11();
		} else if ("highend".equals(level)) {
			return new IPhone11Pro();
		}

		return null;
	}

}
