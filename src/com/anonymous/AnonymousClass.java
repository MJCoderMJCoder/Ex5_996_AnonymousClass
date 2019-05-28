package com.anonymous;

public class AnonymousClass {

	public static void main(String[] args) {
		A a = new A();
		
		//Java允许把类体与对象的创建组合在一起。
		//也就是说，类创建对象时，除了构造方法还有类体，此类体被称为匿名类
		a.f(new Show() {
			public void show() {
				System.out.println("实现了接口的匿名类");
			}
		}
		);
		

	}

}


//接口只有常量和抽象方法
interface Show {
	public void show();
}

class A {
	void f(Show s) {
			s.show();
	}
}