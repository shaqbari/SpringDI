package com.sist.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.temp.Member;
import com.sist.temp.MemberConfig;

/**
 * @author user
 *	classB<T>{       //T는 임시 데이터 타입 //E는 태그나 요소들 줄때 쓴다.
 *		private T t;
 *		public void set(T t){
 *
 *		}		
 *		public T getT(){
 *			return t;
 *      }
 *  }
 *  
 *  B<String> b=new B<String>();
 */
public class MainClass3 {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app2.xml");
		//MemberConfig mc=(MemberConfig) app.getBean("mc", MemberConfig.class);
		
		//제네릭 : 데이터형을 통일화
		MemberConfig mc=app.getBean("mc", MemberConfig.class);//다름과 같이 제네릭으로 바꿔 자동형변환 할 수 있다.
		mc.print();
	}

}
