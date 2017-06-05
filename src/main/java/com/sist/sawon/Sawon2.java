package com.sist.sawon;

/**
 * @author user
 *	��������� �ʱⰪ �ο�
 * ==> setter : �ַ� ���� �����Ҷ� ����.
 * ==> ������
 * ==> static ��, �ν��Ͻ� ��
 * 
 * 	class A{
 * 
 * 		int a=10;	//0 ==> 10 ==> 30
 * 		
 * 		{
 * 			a=20; // file�б� , for���� ���� �̿��ؼ� �ʱ�ȭ �Ҷ� ���
 * 		}
 * 		
 * 		public A(){
 * 			a=30;
 * 		} 
 * }
 * 
 * 	class A
 * 	A a=new A();
 * 	A.this=a;//JVM�� ���ش�.
 * 
 * 	�ڹ� �޸� ����
 * 	====================================
 * 	Method����
 * 		static
 * 			=data�ʱ�ȭ�� static int a;
 * 			=data�ʱ�ȭ static int a=10;
 * 	====================================
 * 	Stack = > �޸� ����
 * 		
 * 		
 * 
 * 	====================================
 * 	Heap = > ���α׷��� ==> gc
 * 		near heap
 * 		far heap
 * 
 *  ====================================
 *  
 *  class A{
 *  	int a;
 *  }
 *  
 *  A aa=new A();
 *  
 *  	aa: Stack �ּ�
 *  	a : heap  ���� �޸�
 *  
 *  �ּҰ��� ��� 4byte�� �� x
 *  is a�� has a ���踸 ũ��� ������ ����ȯ ����
 *  
 *  �����ʹ� �޸� �ο��̱� ������ �޸𸮰����� ���ؾ� �Ѵ�.
 *  
 */
public class Sawon2 {
	private int sabun;
	private String name;
	private String dept;
	
	public Sawon2(int sabun, String name, String dept) {
		this.sabun = sabun; //this�� �޸��Ҵ� ������ �ּҰ��� �־�����.
		this.name = name;
		this.dept = dept;
	}
	
	public void print() {
		System.out.println("��� : "+sabun);
		System.out.println("�̸� : "+name);
		System.out.println("�μ� : "+dept);
	}
	
	
}
