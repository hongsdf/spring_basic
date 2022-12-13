package com.springboot.biz;

import org.springframework.stereotype.Component;


public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker °´Ã¼ »ý¼º");
	}
	@Override
	public void VolumeUp() {
		System.out.println("===> AppleSpeaker º¼·ý ¾÷");
	}
	@Override
	public void VolumeDown() {
		System.out.println("===> AppleSpeaker º¼·ý ´Ù¿î");
	}
}
