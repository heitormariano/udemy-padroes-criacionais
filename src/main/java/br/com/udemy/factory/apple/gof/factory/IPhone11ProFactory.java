package br.com.udemy.factory.apple.gof.factory;

import br.com.udemy.factory.apple.gof.model.IPhone;
import br.com.udemy.factory.apple.gof.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	@Override
	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
