/**
 * 
 */
package com.mycompany.exception;

/**
 * @author Alt
 *
 */
public class Exception2 extends Exception {

	/**
	 * 
	 */
	public Exception2() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param message
	 */
	public Exception2 (String message){
		super(message);
	}
	/**
	 * 
	 * @param reason
	 */
	public Exception2 (Throwable reason) {
		super(reason);
	}
	/**
	 * 
	 * @param message
	 * @param reason
	 */
	public Exception2 (String message, Throwable reason) {
		super(message, reason);
	}
	/**
	 * 
	 * @param message
	 * @param reason
	 * @param bool1
	 * @param bool2
	 */
	public Exception2 (String message, Throwable reason, boolean bool1, boolean bool2) {
		super(message, reason, bool1, bool2);
	}
	

}
