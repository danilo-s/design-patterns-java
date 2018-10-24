package it.danilo.pattern.creational.factory;

public class MobileFactory {
	
	public MobileFactory() {
		
	}
	
	static Imobile createMobile(String type) {
		Imobile imobile=null;
		switch (type) {
		case "samsung":
			imobile=new Samsung();
			break;

		case "lenovo":
			imobile=new Lenovo();
			break;
			
		default:
			break;
		}
		return imobile;
	}

}
