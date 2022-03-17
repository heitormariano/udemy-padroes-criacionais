package br.com.udemy.factory.apple.simple.factory;


import br.com.udemy.factory.apple.simple.model.IPhone;
import br.com.udemy.factory.apple.simple.model.IPhone11;
import br.com.udemy.factory.apple.simple.model.IPhone11Pro;
import br.com.udemy.factory.apple.simple.model.IPhone12;
import br.com.udemy.factory.apple.simple.model.IPhone12Pro;

public class IPhoneSimpleFactory {

	public static IPhone orderIphone(String generation, String level) {
		IPhone device = null;

		if ("11".equals(generation)) {
			if ("standard".equals(level)) {
				device = new IPhone11();

			} else if ("highend".equals(level)) {
				device = new IPhone11Pro();
			}

		} else if ("12".equals(generation)) {
			if ("standard".equals(level)) {
				device = new IPhone12();
			} else if ("highend".equals(level)) {
				device = new IPhone12Pro();
			}
		}

		if (device != null) {
			device.getHardware();
			device.assemble();
			device.certificates();
			device.pack();
		}

		return device;
	}

}
