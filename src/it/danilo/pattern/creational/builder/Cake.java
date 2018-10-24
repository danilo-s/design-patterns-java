package it.danilo.pattern.creational.builder;

public class Cake {
	
	private final double sugar;
	private final double butter;
	private final double milk;
	private final int cherry;
	
	public static class CakeBuilder{
		private double sugar;
		private double butter;
		private double milk;
		private int cherry;
		//builder methods
		public CakeBuilder sugar(double cup) {this.sugar=cup;return this;}
		public CakeBuilder butter(double butter) {this.butter=butter;return this;}
		public CakeBuilder milk(double milk) {this.milk=milk;return this;}
		public CakeBuilder cherry(int cherry) {this.cherry=cherry;return this;}
		//return fully build object
		public Cake build() {
			return new Cake(this);
		}
	}
	@Override
	public String toString() {
		return "Cake [sugar=" + sugar + ", butter=" + butter + ", milk=" + milk + ", cherry=" + cherry + "]";
	}
	
	public Cake(CakeBuilder cakeBuilder) {
		// TODO Auto-generated constructor stub
		this.sugar=cakeBuilder.sugar;
		this.butter=cakeBuilder.butter;
		this.milk=cakeBuilder.milk;
		this.cherry=cakeBuilder.cherry;
	}
}
