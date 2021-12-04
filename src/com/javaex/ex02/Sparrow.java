package com.javaex.ex02;

public class Sparrow extends Bird {

	// 필드 - 부모에 있는 것 또 쓸 필요 없음
	
	// 생성자
	
	// 메소드 일반 (Override/Implement Methods 사용)	
	@Override
	public void sing() {
		System.out.println("참새(" + getName() + ")가 소리내어 웁니다.");		
	}

	@Override
	public void fly() {
		System.out.println("참새(" + getName() + ")가 날아 다닙니다.");		
	}

	@Override
	public void showName() {
		System.out.println("참새의 이름은 " + getName() + " 입니다.");		
	}
	
}
