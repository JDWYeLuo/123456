package com.zhiyou100.demo;

public class StaffText {

	public static void main(String[] args) {
		
		Programmer pr = new Programmer();
		Teacher te = new Teacher();
		Manager nm = new Manager();
		
		
		pr.setId(101);
		pr.setName("玄觞");
		te.setId(102);
		te.setName("晴愔");
		nm.setId(103);
		nm.setName("银临");
		
		pr.work();
		te.work();
		nm.work();
		
	}

}
