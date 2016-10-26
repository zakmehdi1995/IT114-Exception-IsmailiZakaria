/**
 * 
 */
package com.mycompany.exception;

/**
 * @author Alt
 *
 */
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		
	}
	
	public void method1 (Integer _inp) throws Exception1, Exception2, Exception1Child {
		switch (_inp) {
		case 1:
			throw new Exception1("1");
		case 2:
			throw new Exception2("2");
		case 3:
			throw new Exception1Child("3");
		case 4:
			System.out.println("Hi Lo");
			break;
		}
	}
	public static void useMethod1(Integer _inp){
		Main m  = new Main();
		try {m.method1(_inp);}  catch (Exception1Child e){ e.printStackTrace();}
								catch (Exception1 e) {e.printStackTrace();}
								catch (Exception2 e) {e.printStackTrace();}
	}
	public static void useMethod2(Integer _inp){
		Main m = new Main();
		try { m.method1(_inp); } catch (Exception1 | Exception2 e) {e.printStackTrace();}
	}
	public static void useMethod3(Integer _inp) throws Exception1Child, Exception1, Exception2 {
		Main m = new Main();
		m.method1(_inp);
	}
	public static void useMethod4(Integer _inp){
		Main m = new Main();
		try { m.method1(_inp); } catch (Exception1Child e) { e.printStackTrace(); }
								 catch (Exception1 e) { e.printStackTrace(); } 
								 catch (Exception2 e) { e.printStackTrace(); }
	}
	public static void useMethod5(Integer _inp) {
		Main m = new Main();
		try  { m.method1(_inp); } catch (Exception1Child e) { e.printStackTrace(); }		
								  catch (Exception1 e) { e.printStackTrace(); }
								  catch (Exception2 e) { e.printStackTrace(); }
								  catch (Exception e) { e.printStackTrace();}
	}
	public static void useMetho6(Integer _inp) throws Exception1{
		Main m = new Main();
		try  { m.method1(_inp); } catch (Exception1Child e) { e.printStackTrace() ;}
								  catch (Exception1 e) { e.printStackTrace() ;}
								  catch (Exception2 e) { e.printStackTrace();}
								  catch (Exception e) { e.printStackTrace() ;
								  	Exception1 e1 = new Exception1("Got Exception2" + e.getMessage(), e); throw e1; }
	}
}
