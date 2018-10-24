package it.danilo.pattern.structural.facade;

public class Class3 {
	
	public int doStuff(Class1 class1, Class2 class2, int x) {
		return class1.dosomethingComplicated(x) * class2.doAnotherSomething(class1, x);
	}

}
