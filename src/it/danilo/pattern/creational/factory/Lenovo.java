package it.danilo.pattern.creational.factory;

public class Lenovo implements Imobile {

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("lenovo costs..");
	}

	@Override
	public void pictureCapacity() {
		// TODO Auto-generated method stub
		System.out.println("lenovo capacity..");
	}

	@Override
	public void batteryPower() {
		// TODO Auto-generated method stub
		System.out.println("lenovo battery power..");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Lenovo "+super.toString();
	}
}
