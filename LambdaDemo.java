package com.lti.lambda;

import java.util.Scanner;

interface AddCalc{
	void sum(int num1,int num2);
}
interface Shape{
	void area();
}
//class AddCalImpl implements AddCalc{
//	@Override
//	public void sum(int num1, int num2) {
//		System.out.println("Sum="+(num1+num2));
//	}
//}
public class LambdaDemo {

	public static void main(String[] args) {
	
		
		//lambda expression
		AddCalc addCalc=(int num1, int num2)-> {
				// TODO Auto-generated method stub
				System.out.println("Sum="+(num1+num2));
		};
		addCalc.sum(10,20);
		
		//lambda function for circle
		Shape shape1=()->{
			System.out.println("Enter the radius of the circle");
			Scanner sc=new Scanner(System.in);
			int rad=sc.nextInt();
			System.out.println("Ärea of Circle="+(3.14*rad*rad));
		};
		shape1.area();
		
		
		//lambda function for rectangle
		Shape shape2=()->{
			System.out.println("Enter the length of the rectangle");
			Scanner sc=new Scanner(System.in);
			int len=sc.nextInt();
			System.out.println("Enter the width of the rectangle");
			int wid=sc.nextInt();
			System.out.println("Ärea of Rectangle="+(len*wid));
		};
		shape2.area();
	}
}
