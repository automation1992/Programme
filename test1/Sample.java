package org.test1;

public class Sample {
public void empDetails(int empid) {
	System.out.println(empid);

}
public void empDetails(String empname) {
	System.out.println(empname);

}
public void empDetails(int empsalary,String empemail) {
	System.out.println(empsalary);
	System.out.println(empemail);

}
public static void main(String[] args) {
	Sample s=new Sample();
	s.empDetails("3256");
	s.empDetails("sowjanya");
	s.empDetails("25000");
	s.empDetails("kwosil@agamil.com");
}
}
