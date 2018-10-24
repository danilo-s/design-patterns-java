package it.danilo.pattern.creational.builder;

public class BuilderPattern {

	public static void main(String[] args) {
		Cake cake = new Cake.CakeBuilder().sugar(1).butter(0.5).milk(0.5).build();

		System.out.println(cake.toString());
	}

}
