package com.springboot.biz;

import org.springframework.stereotype.Component;


public class LgTv implements TV{
	// 기본생성자 필수
		public LgTv() {
			System.out.println("===> lgTv 객체 생성");
		}
	
	
	public void powerOn() {
		System.out.println("LgTv 전원을 키다");
	}
	public void powerOff() {
		System.out.println("LgTv 전원을 끄다");
	}
	public void VolumeUp() {
		System.out.println("LgTv 소리를 올리다");
	}
	public void VolumeDown() {
		System.out.println("LgTvLgTv 소리를 내린다");
	}
}