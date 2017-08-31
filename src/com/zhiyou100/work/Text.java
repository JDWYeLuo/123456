package com.zhiyou100.work;

public class Text {

	public static void main(String[] args) {
		
		Woman wm = new Woman();
		Man man = new Man();
		
		wm.husband = man;
		
		People pe = wm.child();
		
		if(pe == null){
			System.out.println("木有老公");
			return;
		}
		if(pe instanceof Man){
			//多态的转型
		    Man m = (Man) pe;
		    m.lol();
		}else{
			Woman m = (Woman) pe;
			m.shopping();
		}
		
		System.out.println(wm.child());
	}

}
