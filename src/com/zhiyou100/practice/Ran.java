package com.zhiyou100.practice;

public class Ran {

	public static void main(String[] args) {
		Teacher te = new Teacher();
		Developer de = new Developer();
		NetManager nm = new NetManager();
		
		te.setId(1);
		te.setName("晴愔");
		de.setId(2);
		de.setName("戮默");
		nm.setId(3);
		nm.setName("鹅肝");
		
		te.work();
		de.work();
		nm.work();
	}

}
