package com.anonymous;

public class AnonymousClass {

	public static void main(String[] args) {
		A a = new A();
		
		//Java��������������Ĵ��������һ��
		//Ҳ����˵���ഴ������ʱ�����˹��췽���������壬�����屻��Ϊ������
		a.f(new Show() {
			public void show() {
				System.out.println("ʵ���˽ӿڵ�������");
			}
		}
		);
		

	}

}


//�ӿ�ֻ�г����ͳ��󷽷�
interface Show {
	public void show();
}

class A {
	void f(Show s) {
			s.show();
	}
}