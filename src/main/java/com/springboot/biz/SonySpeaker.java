package com.springboot.biz;

import org.springframework.stereotype.Component;


public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("===> SonySpeaker ��ü ����");
	}
	@Override
	public void VolumeUp() {
		System.out.println("===> SonySpeaker ���� ��");
	}
	@Override
	public void VolumeDown() {
		System.out.println("===> SonySpeaker ���� �ٿ�");
	}
}
