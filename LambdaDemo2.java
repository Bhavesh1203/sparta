package com.lti.lambda;

@FunctionalInterface
interface ISum<T>{
	T sum(T num1,T num2);
}
@FunctionalInterface
interface ISquare{
	void area(double side);
}

public class LambdaDemo2 {

	public static void main(String[] args) {
//		ISum iSum=(int num1,int num2)->{
//			int sum=num1+num2;
//			return sum;
//		};
//		ISum iSum=(int num1,int num2)->{return (num1+num2);};
//		System.out.println("Sum: "+iSum.sum(10,20));
//		
//		ISquare iSquare=(double side)->System.out.println(side*side);
		
		ISum<Integer> sumInteger=(num1,num2)->{return (num1+num2);};
		System.out.println("Sum="+sumInteger.sum(10,10));
		
		//ISum<Double> sumDouble=
	}
}
