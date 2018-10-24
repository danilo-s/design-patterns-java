package it.danilo.pattern.creational.abstract_factory;

import it.danilo.pattern.creational.factory.Samsung;

public class TestClass {
	
	public static void main(String[] args) {
		MobileFactory mobileFactory = new MobileFactory();
		SamsungMobileFactory f=(SamsungMobileFactory)mobileFactory.createMobile("samsung");
		Samsung samsungMobile = f.createSamsungMobile();
		samsungMobile.batteryPower();
	}

}
