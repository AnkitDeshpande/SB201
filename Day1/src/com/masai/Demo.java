package com.masai;

class A {
	void fun() {
		System.out.println("Inside fun A");
	}

}

class B {
	A a = new A();
	void foo() {
		a.fun();
	}
}

class Demo{
	public static void main(String[] args) {
		B b = new B();
		b.foo();
	}
}