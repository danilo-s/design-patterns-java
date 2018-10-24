package it.danilo.pattern.structural.composite;

public class Developer implements Employee {
	
	private String name;
	private double salary;
	
	public Developer(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Employee emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("name "+this.name+" salary "+this.salary);
	}

}
