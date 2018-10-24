package it.danilo.pattern.creational.abstract_factory;

public class MobileFactory implements IMobileFactory {

	@Override
	public IMobileFactory createMobile(String type) {
		// TODO Auto-generated method stub
		IMobileFactory factory=null;
		switch (type) {
		case "samsung":
			factory=new SamsungMobileFactory();
			break;
			
		case "lenovo":
			factory=new LenovoMobileFactory();
			break;

		default:
			break;
		}
		return factory;
	}

}
