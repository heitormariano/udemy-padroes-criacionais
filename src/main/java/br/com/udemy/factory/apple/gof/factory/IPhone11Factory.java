package br.com.udemy.factory.apple.gof.factory;

import br.com.udemy.factory.apple.gof.model.IPhone;
import br.com.udemy.factory.apple.gof.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	@Override
	public IPhone createIPhone() {
		return new IPhone11();
	}

}
