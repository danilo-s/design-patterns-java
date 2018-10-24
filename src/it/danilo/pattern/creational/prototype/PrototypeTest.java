package it.danilo.pattern.creational.prototype;

public class PrototypeTest {
	
	public Bike makeJaguar(Bike basicBike) throws CloneNotSupportedException {
		basicBike.makeAdvanced();
		return basicBike;
	}
	
	public static void main(String[] args) {
		try {
			Bike bike = new Bike();
			Bike basicBike = bike.clone();
			PrototypeTest prototypeTest = new PrototypeTest();
			Bike makeJaguar = prototypeTest.makeJaguar(basicBike);
			System.out.println(makeJaguar.getModel());
			System.out.println(makeJaguar.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
