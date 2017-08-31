package com.zhiyou100.demo;

public abstract class StaffDemo {
	
	private int id ;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	
	
	
	
	public void eat(){
		
		System.out.println("吃饭");
		
	}
	public abstract void work();
		
}

  class Teacher extends StaffDemo{

	@Override
	public void work() {
		System.out.println("id为"+getId()+getName()+"讲课");
	}	  
}

 class Programmer  extends StaffDemo{
	 
	 @Override
	public void work() {
		System.out.println("id为"+getId()+getName()+"写代码");
	}
}

 class Manager  extends StaffDemo{
	   @Override
	public void work() {
		   System.out.println("id为"+getId()+getName()+"修电脑");
		
	}
}






