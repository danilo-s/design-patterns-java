package it.danilo.pattern.structural.adapter;

public class AppleAdapter extends Apple{
	
	private Orange orange;
	
	public AppleAdapter(Orange orange) {
		this.orange=orange;
	}
	
	public void getColor(String color) {
		orange.getOrangeColor(color);
	}

}
