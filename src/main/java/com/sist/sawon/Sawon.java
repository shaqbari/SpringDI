package com.sist.sawon;

//Spring == Container (Class)
/**
 * @author user
 *	�����̳�(Ŭ���� ����)
 *	==> ����
 *		BeanFactory : core(DI, DL)
 *			|
 *		ApplicationContext : core+AOP+����ȭ(�ٱ�������)
 *			|
 *		WebApplicaionContext : core+AOP+����ȭ, web(MVC)
 *
 *	==> ����
 *		1) XML �б�
 *		2) XML �Ľ�
 *		3) Ŭ���� �޸� �Ҵ�
 *			SAX => id, class ==> Map�� ����
 *			3_1) ������ DI
 *		4) setter DI
 *		5) �޼ҵ� ȣ�� : init-method
 *		===============================���� ���� �������� ���ش�.
 *		���α׷��Ӱ� ���ϴ� �޼ҵ� Ȱ��(DL)
 *		===============================�ٽ� �������� �Ѵ�.
 *		6) �޼ҵ� ȣ�� : destroy-method
 *
 *		==>Container : ��ü�� �����ֱ⸦ �����ϴ� ����
 *					   ==========
 *					   XML�� ���ؼ� ����(����~�Ҹ�)		
 *
 *		�������� Ŭ���� ����������Ŭ�� ������ �ش�.
 *		
 */
/**
 * @author user
 *
 */
public class Sawon {
	private int sabun;
	private String name;
	private String dept;
	
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void init() {
		System.out.println("========�������=========");
	}
	
	public void distroy(){
		System.out.println("========�޸� ����========");
		
	}
	
	public void print() {
		System.out.println("��� : "+sabun);
		System.out.println("�̸� : "+name);
		System.out.println("�μ� : "+dept);
	}
	
	
	
}
