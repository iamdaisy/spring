package net.multicampus.dev.di01;

import org.springframework.stereotype.Component;

@Component // -> 자동으로 인스턴스 생성(beaninit.xml에서 설정함)
public class OrangeSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("OrangeSpeaker : 소리를 키웁니다.");
		
	}

	@Override
	public void soundDown() {
		System.out.println("OrangeSpeaker : 소리를 줄입니다.");
		
	}
	
	
}
