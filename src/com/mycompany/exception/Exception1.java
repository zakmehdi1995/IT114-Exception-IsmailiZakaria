package com.mycompany.exception;


public class Exception1 extends Exception {


	public Exception1() {
		// TODO Auto-generated constructor stub
	}
	 /**
	  * 
	  * @param argument1
	  */
	public Exception1 (String argument1) {
		super(argument1);
	}
	/**
	 * @param argument1
	 */
	public Exception1 (Throwable argument1) {
		super(argument1);
	}
	/**
	 * 
	 * @param argument1
	 * @param argument2
	 */
	public Exception1 (String argument1, Throwable argument2) {
		super(argument1, argument2);
	}
	/**
	 * 
	 * @param argument1
	 * @param argument2
	 * @param argument3
	 * @param argument4
	 */
	public Exception1 (String argument1, Throwable argument2, boolean argument3, boolean argument4) {
		super(argument1, argument2, argument3, argument4);
	}

}
