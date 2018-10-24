package it.danilo.pattern.creational.prototype;

public class Bike implements Cloneable {
	
	private int gears;
	private String bikeType;
	private String model;
	
	public Bike() {
		super();
		this.gears = 4;
		this.bikeType = "standard";
		this.model = "Leopard";
	}
	
	@Override
	protected Bike clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new Bike();
	}
	
	public void makeAdvanced() {
		this.gears = 6;
		this.bikeType = "advanced";
		this.model = "Jaguar";
	}
	
	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Bike [gears=" + gears + ", bikeType=" + bikeType + ", model=" + model + "]";
	}

}
