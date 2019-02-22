package org.test2;

public class Super2 implements Super {

	
	public void fixed() {
		System.out.println("6");
		
	}

	public void savings() {
		System.out.println("10");
		
	}


	public void accountName() {
		System.out.println("9");
		
	
	}

	
	public void branchName() {
		System.out.println("chennai");
		
	}
	public static void main(String[] args) {
		Super2 ss=new Super2();
		ss.accountName();
		ss.savings();
		ss.fixed();
		ss.branchName();
	}

}
