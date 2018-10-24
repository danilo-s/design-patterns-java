package it.danilo.pattern.structural.facade;

public class FacadeTest {
	
	public static void main(String[] args) {
		Facade facade = new Facade();
		
		int x=3;
		
		System.out.println(facade.cube(x));
		
		System.out.println(facade.cubeXtimes2(x));
	}

}
