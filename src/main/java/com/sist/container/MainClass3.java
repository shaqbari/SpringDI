package com.sist.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.temp.Member;
import com.sist.temp.MemberConfig;

/**
 * @author user
 *	classB<T>{       //T�� �ӽ� ������ Ÿ�� //E�� �±׳� ��ҵ� �ٶ� ����.
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
		
		//���׸� : ���������� ����ȭ
		MemberConfig mc=app.getBean("mc", MemberConfig.class);//�ٸ��� ���� ���׸����� �ٲ� �ڵ�����ȯ �� �� �ִ�.
		mc.print();
	}

}
