package it.danilo.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
	
	private String name;
	private double salary;
	private List<Employee> employees=new ArrayList<>();

	public Manager(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void add(Employee emp) {
		// TODO Auto-generated method stub
		employees.add(emp);
	}

	@Override
	public void remove(Employee emp) {
		// TODO Auto-generated method stub
		employees.remove(emp);
	}

	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return employees.get(i);
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
		for(Employee e:employees)
			e.print();
	}

}
