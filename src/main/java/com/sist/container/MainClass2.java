package com.sist.container;

class A{
	
	public A(){
		System.out.println("객체 생성!");
		
	}
	
	protected void finalize() throws Throwable{
		System.out.println("객체 소멸!");
		
	}
	
}

public class MainClass2 {
	
	
	
	public static void main(String[] args) {
		A a=new A();
		//활용
		//소멸
		a=null;
		System.gc();//gc가 빨리 가져가게 불러들인다. multimedia program만들때 사용한다.
		//어느시기에 호출해야 할지 잘 알아야 한다.안하면 프로그램 종료할때까지 삭제 하지 않는다.
		
		
	}
}
