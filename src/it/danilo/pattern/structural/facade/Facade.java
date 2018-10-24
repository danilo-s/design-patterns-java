package it.danilo.pattern.structural.facade;

public class Facade {

	public int cube(int x) {
		Class1 class1 = new Class1();
		return class1.dosomethingComplicated(x);
	}

	public int cubeXtimes2(int x) {
		Class1 class1 = new Class1();
		Class2 class2 = new Class2();
		return class2.doAnotherSomething(class1, x);
	}
}
