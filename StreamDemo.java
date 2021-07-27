package com.lti.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee{
	int empId;
	String empName;
	double empSalary;
	
	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(10);numbers.add(20);numbers.add(30);
		numbers.add(40);numbers.add(50);
		numbers.add(10);numbers.add(20);numbers.add(30);
		numbers.add(40);numbers.add(50);
		
//		Iterator<Integer> iterator=numbers.iterator();
//		while(iterator.hasNext()) {
//			int num=iterator.next();
//			if(num>=30) {
//				System.out.println(num);
//			}
//		}
		numbers.stream().filter(num->num>=30).forEach(num->System.out.print(num+" "));;
		System.out.println(numbers.stream().filter(num->num>30).count());
		
		numbers.stream().sorted();
		
		Employee e1=new Employee(101, "Mark", 3000);
		Employee e2=new Employee(102, "Kevin", 4000);
		Employee e3=new Employee(103, "Peter", 2000);
		
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(e1);employees.add(e2);employees.add(e3);	
		System.out.println(employees.stream().filter(e->e.empId>101).count());
		employees.stream().filter(e->e.empId>101).forEach(System.out::println);
		
		employees.stream().map(e->e.getEmpName()).forEach(System.out::println);
		
	}
	
}
