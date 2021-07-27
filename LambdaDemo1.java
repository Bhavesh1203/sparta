package com.lti.lambda;

interface AddCalc1{
	void sum(int num1,int num2);
}
//class AddCalImpl implements AddCalc{
//	@Override
//	public void sum(int num1, int num2) {
//		System.out.println("Sum="+(num1+num2));
//	}
//}
public class LambdaDemo1 {

	public static void main(String[] args) {
	
		AddCalc1 addCalc=(int num1, int num2)-> {
				// TODO Auto-generated method stub
				System.out.println("Sum="+(num1+num2));
		};
		addCalc.sum(10,20);
	}
}
