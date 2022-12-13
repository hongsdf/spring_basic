package com.springboot.biz;

import org.springframework.stereotype.Component;


public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("===> SonySpeaker °´Ã¼ »ý¼º");
	}
	@Override
	public void VolumeUp() {
		System.out.println("===> SonySpeaker º¼·ý ¾÷");
	}
	@Override
	public void VolumeDown() {
		System.out.println("===> SonySpeaker º¼·ý ´Ù¿î");
	}
}
