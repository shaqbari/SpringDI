package com.sist.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.sawon.Sawon;
import com.sist.sawon.Sawon2;

/**
 * @author user
 *	main, jsp
 */
public class MainClass {

	public static void main(String[] args) {
		//xml파싱하고 메모리 할당
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");//web에서는 Dispatcher가 가지고 있다.
		/*Sawon sa=(Sawon)app.getBean("sa");//DL : id로 클래스 객체찾기
		System.out.println("sa:"+sa);
		//sa.init();//시작하자 마자 하나의 메소드 호출가능
		sa.print();
		
		Sawon sa1=(Sawon)app.getBean("sa");//DL : id로 클래스 객체찾기
		//setter di
		sa1.setSabun(2);//xml에서 p:는 한번만 지정가능하기 때문에 prototype으로 다른 객체생성하면 setter로 초기화해줘야 한다.
		sa1.setName("김사랑");
		sa1.setDept("남남");
		System.out.println("sa:"+sa1);
		//sa1.init();
		sa1.print();
		
		//destroy는 app이 사라져야 호출된다.
*/	
		Sawon2 sa=(Sawon2)app.getBean("sa2");
		sa.print();
		
		
	}

}
