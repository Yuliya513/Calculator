package com.company;

import java.util.Arrays;

public class Calculator {

    public static void main(String[] args) {
    	/*-
	int time=8;
	int ID;
	int salary;
	int employee;
	String FirstName;
	String LastName;
	int employee=new int employee[4];
	String FirstName=new FirstName[4];
	String LastName=new LastName[4];
	ID=new ID[4];
	String FirstName1="I";
	String LastName1="Ia";
		String FirstName2="D";
		String LastName2="Ih";
		String FirstName3="In";
		String LastName3="A";
		String FirstName4="Df";
		Employee 1=A;
		Employee 2=B;
		Employee 3=C;
		Employee 4=J;
		ID=10;
		ID=11;
		ID=50;
		ID=53;
		salary="hourly rate"*"numbers of hours worked";
		System.out.println("salary");
		System.out.println("String FirstName1=I");
		System.out.println("String LasttName1=Ia");
		System.out.println("String FirstName2=D");
		System.out.println("String LasttName2=D");
		System.out.println("String FirstName3=In");
		System.out.println("String LastName3=A");
		System.out.println("String FirstName4=Df");
		System.out.println("LastName=Df");
		System.out.println("Employee 1=A");
		System.out.println("Employee 2=B");
		System.out.println("Employee 2=B");
		System.out.println("Employee 3=C");
		System.out.println("Employee 4=J");
		System.out.println("ID=10");
		System.out.println("ID=11);
				System.out.println("ID=50");
		System.out.println("ID=53");
*/
		Payment[] empl={
		new ContractEmployee(1,"Ivan",10),
		new SalaryEmployee(2,"Petro",40),
				new ContractEmployee(1,"Ira",8),
				new SalaryEmployee(2,"D",20),
		};

for(Payment current: empl){
	System.out.println("salary="+current.calculatePay()+" for empl:"+current);
}
Arrays.sort(empl);
System.out.println("sort:");
		for(Payment current: empl){
			System.out.println("salary="+current.calculatePay()+" for empl:"+current);
		}

	}
}
