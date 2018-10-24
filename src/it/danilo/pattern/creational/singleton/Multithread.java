package it.danilo.pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multithread {

	//volatile-->avoid half inizialized variable
	private static volatile Multithread instance = null;

	private Multithread() {
		System.out.println("creating");
	}

	public static Multithread getInstance() {
		if (instance == null) {
			synchronized (Multithread.class) {
				//double checked locking
				if (instance == null) {
					instance = new Multithread();
				}
			}
		}
		return instance;
	}

	static void useSingleton() {
		Multithread singleton = Multithread.getInstance();
		print("singleton", singleton);
	}

	// public static void main(String[] args) {
	// ExecutorService service=Executors.newFixedThreadPool(2);
	// service.submit(MultithreadSingleton::useSingleton());
	// }

	static void print(String name, Multithread obj) {
		System.out.println(String.format("Object: %s, Hashcode: %d", name, obj.hashCode()));
	}

}
