package com.jbs.excep;

public class RollException extends Exception{//RuntimeException{
	private int invalidRoll;

	public RollException(int invalidRoll) {
		super();
		this.invalidRoll = invalidRoll;
	}

	public int getInvalidRoll() {
		return invalidRoll;
	}

	public void setInvalidRoll(int invalidRoll) {
		this.invalidRoll = invalidRoll;
	}

	@Override
	public String toString() {
		return "RollException [invalidRoll=" + invalidRoll + "]";
	}
}
	