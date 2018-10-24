package it.danilo.pattern.structural.adapter;

public class AdapterPatternTest {
	
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.getAppleColor("green");
		
		Orange orange = new Orange();
		AppleAdapter appleAdapter = new AppleAdapter(orange);
		appleAdapter.getAppleColor("red");
	}

}
