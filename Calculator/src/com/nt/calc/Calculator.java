package com.nt.calc;

public class Calculator {
	public long res;
	public long add(int a,int b){
		
		return a+b;
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.res=calc.add(10, 20);
		System.out.println("Result is : "+calc.res);
		
		
		
	}

}
