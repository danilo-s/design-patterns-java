package it.danilo.pattern.creational.singleton;

/*
 * use Enum, Joshua Bloch method
 * Java enum instantiated only once and globally accessible. but no lazy inizialization
 */
public enum Enum {

	INSTANCE;

	public static void doSomething() {

	}

}
