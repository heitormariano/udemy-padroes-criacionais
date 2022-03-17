package br.com.udemy.factory.apple.gof.factory;

import br.com.udemy.factory.apple.gof.model.IPhone;
import br.com.udemy.factory.apple.gof.model.IPhone12;

public class IPhone12Factory extends IPhoneFactory {

	@Override
	public IPhone createIPhone() {
		return new IPhone12();
	}

}
