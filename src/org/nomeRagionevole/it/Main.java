package org.nomeRagionevole.it;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Luca", "Rossi",  LocalDate.now(), "157AS", 1300, 13);
		Employee e2 = new Employee("Andrea", "Bianchi",  LocalDate.now(), "157AZ", 1350, 13);
		Employee e3 = new Employee("Genoveffa", "Pirlo",  LocalDate.now(), "157BS", 1600, 13);
		
		Boss b1 = new Boss("Stefano", "NonDeraglia",  LocalDate.now(), "167BS", 1700, 7000 );
		Boss b2 = new Boss("Stefano", "Deraglia",  LocalDate.now(), "167BS", 2000, 6500 );
		
		Person[] ps = {e1, e2, e3, b1, b2};
		
		//least and most payed
		int maxYearIncome = Integer.MIN_VALUE;
		int minYearIncome = Integer.MAX_VALUE;
		
		Person maxYearIncomePerson = null;
		Person minYearIncomePerson = null;
		
		for (int i = 0; i < ps.length; i++) {
			
			Person p = ps[i];
			int yearIncome = p.getYearIncome();
			
			if(maxYearIncome < yearIncome) {
				maxYearIncome = yearIncome;
				maxYearIncomePerson = p;
			}
		}
		
		for (int i = 0; i < ps.length; i++) {
			
			Person p = ps[i];
			int yearIncome = p.getYearIncome();
			
			if(minYearIncome > yearIncome) {
				minYearIncome = yearIncome;
				minYearIncomePerson = p;
			}
		}
		System.out.println("Most payed");
		System.out.println(maxYearIncomePerson.toString());
		System.out.println("-------------------------");
		System.out.println("Least payed");
		System.out.println(minYearIncomePerson.toString());
		System.out.println("-------------------------");
		
		//total cost of the year
		
		int CompanyCostPerYear = 0;
		
		for (int i = 0; i < ps.length; i++) {
			
			Person p = ps[i];
			
			CompanyCostPerYear += p.getYearIncome();
		}
		
		System.out.println("Company's annual cost for Employees is: " + CompanyCostPerYear + "€");
		System.out.println("Company's medium cost for an Employees is: " + CompanyCostPerYear / ps.length + "€");
		
		
	}
}
