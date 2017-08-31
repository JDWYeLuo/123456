package com.zhiyou100.work;

import java.util.Random;

public class Woman extends People {
	Man husband;
	
	public void shopping(){
		System.out.println("购物");
	}
	
	public People child(){
		
		People pe = null;
		
	if(husband != null){
		Random hus = new Random();
		int i = hus.nextInt(2);
			
			if(i<1){
				pe = new Man();
				
			}else{
				pe = new Woman();
			}
		}
		return pe;	
	}
 
}
