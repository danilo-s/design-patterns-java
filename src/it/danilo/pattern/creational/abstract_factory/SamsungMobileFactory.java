package it.danilo.pattern.creational.abstract_factory;

import it.danilo.pattern.creational.factory.Samsung;

public class SamsungMobileFactory extends MobileFactory {
	
	Samsung createSamsungMobile() {
		return new Samsung();
	}


}
