package org.nomeRagionevole.it;

import java.time.LocalDate;

public abstract class Person {
	
	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String Code;
	
	public Person(String name, String surname, LocalDate dateLocalDate, String Code) {
		setName(name);
		setSurname(surname);
		setDateOfBirth(dateLocalDate);
		setCode(Code);
	}
	
	// Getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	//
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	//
	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}
	
	// Methods
	public String getFullName() {
		return getName() + " " + getSurname();
	}
	
	@Override
	public String toString() {
		return "Full name: " + getFullName() +
				"\nDate of Birth: " + getDateOfBirth() + 
				"\nUser code: " + getCode(); 
	}
	
	public abstract int getYearIncome();
}
