package com.javaex.ex02;

public class Sparrow extends Bird {

	// 필드
	private String name;

	// 생성자
	public Sparrow() {
		// default
	}

	// 메소드 g/s
	public String setName(String name) {
		this.name = name;
		return name;
	}
	
	// 메소드 일반
	public void sing() {
		System.out.println("참새(" + name + ")가 소리내어 웁니다.");
	}

	public void fly() {
		System.out.println("참새(" + name + ")가 날아 다닙니다.");
	}

	public void showName() {
		System.out.println("참새의 이름은 " + name + " 입니다.");
	}

}
