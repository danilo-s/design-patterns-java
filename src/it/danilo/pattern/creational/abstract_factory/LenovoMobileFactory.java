package it.danilo.pattern.creational.abstract_factory;

import it.danilo.pattern.creational.factory.Lenovo;

public class LenovoMobileFactory extends MobileFactory {
	
	Lenovo createLenovoMobile() {
		return new Lenovo();
	}


}
