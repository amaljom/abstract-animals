package org.nomeRagionevole.it;

import java.time.LocalDate;

public class Employee extends Person {
	
	private int salary;
	private int monthlyCount;
	
	public Employee(String name, String surname, LocalDate dateLocalDate, String Code, int salary, int monthlyCount) {
		super(name, surname, dateLocalDate, Code);
		setSalary(salary);
		setMonthlyCount(monthlyCount);
	}
	
	//getter and asetter
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//
	public int getMonthlyCount() {
		return monthlyCount;
	}

	public void setMonthlyCount(int monthlyCount) {
		this.monthlyCount = monthlyCount;
	}
	
	public int getYearIncome() {
		return getMonthlyCount() * getSalary();
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nSalary: " + getYearIncome();
	}
	
	
}
