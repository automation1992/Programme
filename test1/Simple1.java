package org.test1;

public class Simple1 extends Simple {
@Override
public void bank() {
	System.out.println("hdfc");
		super.bank();
}
public void bank2() {
	System.out.println("axis");

}
public static void main(String[] args) {
	Simple1 sm=new Simple1();
	sm.bank();
	sm.bank2();
}
}
