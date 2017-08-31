package com.zhiyou100.practice;

public abstract class People {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat(){
		System.out.println("就知道吃");
	}
	public abstract void work();
}

 class Teacher extends People{
	 @Override
	public void work() {
		 System.out.println("Id为"+getId()+"的"+getName()+"今天需要讲课");
		
	}
 }

  class Developer extends People{
	  @Override
	public void work() {
		  System.out.println("Id为"+getId()+"的"+getName()+"正在准备放假");  
	}

	
  }

  class NetManager extends People{
	  @Override
	public void work() {
		  System.out.println("Id为"+getId()+"的"+getName()+"天天都要做饭");
		
	}
  }