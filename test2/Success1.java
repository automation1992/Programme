package org.test2;

public  class Success1 extends Success {

	
	void fixed() {
		System.out.println("fixed account");
		
	}

	
	void savings() {
		System.out.println("savings account");
		
	}

	
	void accountName() {
		System.out.println("sowjanya");
		
	}
	public static void main(String[] args) {
		Success1 su=new Success1();
		su.accountName();
		su.bankName();
		su.fixed();
		su.savings();
	}
	
}
