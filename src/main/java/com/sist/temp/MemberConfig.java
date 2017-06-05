package com.sist.temp;

import java.util.*;
public class MemberConfig {
	/*private Member mem;

	public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}
	
	public void print(){
		System.out.println("ID: "+mem.getId());
		System.out.println("Name: "+mem.getName());
		System.out.println("Adress: "+mem.getAddr());
		
		
		
	};*/
	
	private List<Member> list=new ArrayList<Member>();
	private Map map =new HashMap();	
	
	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public List<Member> getList() {
		return list;
	}

	public void setList(List<Member> list) {
		this.list = list;
	}
	
	public void print(){
		for (Member m : list) {
			System.out.println("ID: "+m.getId());
			System.out.println("Name: "+m.getName());
			System.out.println("Adress: "+m.getAddr());
			System.out.println("================================");
		}
		
		System.out.println("id:"+map.get("id"));
		
		
		
	}
	
	
}
