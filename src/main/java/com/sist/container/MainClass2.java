package com.sist.container;

class A{
	
	public A(){
		System.out.println("��ü ����!");
		
	}
	
	protected void finalize() throws Throwable{
		System.out.println("��ü �Ҹ�!");
		
	}
	
}

public class MainClass2 {
	
	
	
	public static void main(String[] args) {
		A a=new A();
		//Ȱ��
		//�Ҹ�
		a=null;
		System.gc();//gc�� ���� �������� �ҷ����δ�. multimedia program���鶧 ����Ѵ�.
		//����ñ⿡ ȣ���ؾ� ���� �� �˾ƾ� �Ѵ�.���ϸ� ���α׷� �����Ҷ����� ���� ���� �ʴ´�.
		
		
	}
}
