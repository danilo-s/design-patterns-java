package it.danilo.pattern.structural.composite;

public class CompositePatternTest {
	
	public static void main(String[] args) {
		Employee developer = new Developer("Jhon",10000);
		Employee developer2 = new Developer("David",20000);
		Employee manager = new Manager("Daniel",30000);
		manager.add(developer);
		manager.add(developer2);
		Employee developer3= new Developer("Michael",20000);
		Employee supermanager = new Manager("Bill",30000);
		supermanager.add(developer3);
		supermanager.add(manager);
		supermanager.print();
	}

}
