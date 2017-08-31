package com.zhiyou100.practice;


public class Rank {
	
	public static void main(String[] args) {
		Ann man = new Ann();
		Bcc woman = new Bcc();
		
		woman.husband = man;
		
		HomeWork pe = woman.child();
		
		if(pe == null){
			System.out.println("没孩子");
		}
		if(pe instanceof Ann){
			 Ann m = (Ann) pe;
			    m.lol();
		}else{
			Bcc m = (Bcc) pe;
			m.shopping();
		}		
		System.out.println(woman.child());
	}

}
