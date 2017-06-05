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
		//xml�Ľ��ϰ� �޸� �Ҵ�
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");//web������ Dispatcher�� ������ �ִ�.
		/*Sawon sa=(Sawon)app.getBean("sa");//DL : id�� Ŭ���� ��üã��
		System.out.println("sa:"+sa);
		//sa.init();//�������� ���� �ϳ��� �޼ҵ� ȣ�Ⱑ��
		sa.print();
		
		Sawon sa1=(Sawon)app.getBean("sa");//DL : id�� Ŭ���� ��üã��
		//setter di
		sa1.setSabun(2);//xml���� p:�� �ѹ��� ���������ϱ� ������ prototype���� �ٸ� ��ü�����ϸ� setter�� �ʱ�ȭ����� �Ѵ�.
		sa1.setName("����");
		sa1.setDept("����");
		System.out.println("sa:"+sa1);
		//sa1.init();
		sa1.print();
		
		//destroy�� app�� ������� ȣ��ȴ�.
*/	
		Sawon2 sa=(Sawon2)app.getBean("sa2");
		sa.print();
		
		
	}

}
