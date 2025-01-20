package com;
import importing_package.Simple;

class Calculator{// package private
	int a;
	int b;
	
	int add(int a,int b) {
		this.a = a;
		this.b = b;
		return this.a + this.b;
	}
}
public class Simple4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Simple ref_var = new Simple();// as main is static 
		Simple.main(null);
	}

}
