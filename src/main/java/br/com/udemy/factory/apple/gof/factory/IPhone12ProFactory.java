package br.com.udemy.factory.apple.gof.factory;

import br.com.udemy.factory.apple.gof.model.IPhone;
import br.com.udemy.factory.apple.gof.model.IPhone12Pro;

public class IPhone12ProFactory extends IPhoneFactory {

	@Override
	public IPhone createIPhone() {
		return new IPhone12Pro();
	}

}
