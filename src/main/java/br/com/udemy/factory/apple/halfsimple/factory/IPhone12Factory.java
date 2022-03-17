package br.com.udemy.factory.apple.halfsimple.factory;

import br.com.udemy.factory.apple.halfsimple.model.IPhone;
import br.com.udemy.factory.apple.halfsimple.model.IPhone12;
import br.com.udemy.factory.apple.halfsimple.model.IPhone12Pro;

public class IPhone12Factory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone(String level) {
		if ("standard".equals(level)) {
			return new IPhone12();
		} else if ("highend".equals(level)) {
			return new IPhone12Pro();
		}

		return null;
	}

}
