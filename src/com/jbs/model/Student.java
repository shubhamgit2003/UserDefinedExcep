package com.jbs.model;

import com.jbs.excep.RollException;

public class Student {
	private int roll;
	private String name;
	
	public Student(int roll, String name) throws RollException{
		super();
		if (roll <= 0) {
			throw new RollException(roll);
		}
		this.roll = roll;
		this.name = name;
	}
	public Student() {
		super();
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) throws RollException {
		if (roll <= 0) {
			throw new RollException(roll);
		}
			this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roll;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (roll != other.roll)
			return false;
		return true;
	}
	

}