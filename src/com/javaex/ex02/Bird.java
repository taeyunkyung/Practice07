package com.javaex.ex02;

public abstract class Bird {

	// 필드
	private String name;

	// 생성자
	public Bird() {

	}

	// 메소드 g/s
	public String getName() {
		return name;
	}
	
	public abstract String setName(String name);  
	
	// 메소드 일반
	public abstract void sing();
	public abstract void fly();
	public abstract void showName();

}
