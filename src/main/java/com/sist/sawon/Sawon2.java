package com.sist.sawon;

/**
 * @author user
 *	멤버변수의 초기값 부여
 * ==> setter : 주로 값을 변경할때 쓴다.
 * ==> 생성자
 * ==> static 블럭, 인스턴스 블럭
 * 
 * 	class A{
 * 
 * 		int a=10;	//0 ==> 10 ==> 30
 * 		
 * 		{
 * 			a=20; // file읽기 , for문등 로직 이용해서 초기화 할때 사용
 * 		}
 * 		
 * 		public A(){
 * 			a=30;
 * 		} 
 * }
 * 
 * 	class A
 * 	A a=new A();
 * 	A.this=a;//JVM이 해준다.
 * 
 * 	자바 메모리 구조
 * 	====================================
 * 	Method영역
 * 		static
 * 			=data초기화전 static int a;
 * 			=data초기화 static int a=10;
 * 	====================================
 * 	Stack = > 메모리 관리
 * 		
 * 		
 * 
 * 	====================================
 * 	Heap = > 프로그래머 ==> gc
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
 *  	aa: Stack 주소
 *  	a : heap  실제 메모리
 *  
 *  주소값은 모두 4byte라 비교 x
 *  is a와 has a 관계만 크기비교 가능해 형변환 가능
 *  
 *  빅데이터는 메모리 싸움이기 때문에 메모리관리를 잘해야 한다.
 *  
 */
public class Sawon2 {
	private int sabun;
	private String name;
	private String dept;
	
	public Sawon2(int sabun, String name, String dept) {
		this.sabun = sabun; //this는 메모리할당 했을때 주소값이 주어진다.
		this.name = name;
		this.dept = dept;
	}
	
	public void print() {
		System.out.println("사번 : "+sabun);
		System.out.println("이름 : "+name);
		System.out.println("부서 : "+dept);
	}
	
	
}
