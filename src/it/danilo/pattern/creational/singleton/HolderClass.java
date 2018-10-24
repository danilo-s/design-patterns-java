package it.danilo.pattern.creational.singleton;
/*
 * use inner static helper class, Bill Pugh method
 */
public class HolderClass {
	
	private HolderClass() {
		System.out.println("creating..");
	}
	
	static class Holder{
		static final HolderClass INSTANCE=new HolderClass();
	}
	
	public static HolderClass getInstance() {
		return Holder.INSTANCE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HolderClass instance = HolderClass.getInstance();
		HolderClass instance2 = HolderClass.getInstance();
		HolderClass instance3 = HolderClass.getInstance();
		
		print("1", instance);
		print("2", instance2);
		print("3", instance3);

	}
	
	static void print(String name, HolderClass obj) {
		System.out.println(String.format("Object: %s, Hashcode: %d", name, obj.hashCode()));
	}

}
