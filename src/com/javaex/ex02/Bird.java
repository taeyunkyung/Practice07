package com.javaex.ex02;

public abstract class Bird {

	// 필드
	private String name;

	// 생성자
	public Bird() {

	}

	// 메소드 g/s
	protected String getName() { // 상속관계에서만 이름을 읽을 수 있는 getName()
		return name;
	}
	
	public void setName(String name) { // 부모 클래스의 메소드 사용 예정
		this.name = name;
	} 
	
	// 메소드 일반
	public abstract void sing();
	public abstract void fly();
	public abstract void showName();

}
