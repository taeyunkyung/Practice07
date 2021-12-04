package com.javaex.ex02;

public class Duck extends Bird {

	// 필드 - 부모에 있는 것 또 쓸 필요 없음
	
	// 생성자
	
	// 메소드 일반 (Override/Implement Methods 사용)	
	@Override
	public void sing() {
		System.out.println("오리(" + getName() + ")가 소리내어 웁니다.");		
	}

	@Override
	public void fly() {
		System.out.println("오리(" + getName() + ")가 날지 않습니다.");		
	}

	@Override
	public void showName() {
		System.out.println("오리의 이름은 " + getName() + " 입니다.");	
	}
	
}
