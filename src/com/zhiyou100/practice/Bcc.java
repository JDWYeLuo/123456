package com.zhiyou100.practice;

import java.util.Random;

import com.zhiyou100.work.Man;
import com.zhiyou100.work.Woman;

public class Bcc extends HomeWork {
		Ann husband;
		
		public void shopping(){
			System.out.println("购物");
		}
		
		public HomeWork child(){
			HomeWork pe = null;
			Random ran = new Random();
			int i = ran.nextInt(2);
			
			if(i!=0){
				pe = new Ann();
			}else{
				pe = new Bcc();
			}
			return pe;
			
			
		}
}
