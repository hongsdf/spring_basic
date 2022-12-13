package com.springboot.biz;

import org.springframework.stereotype.Component;


public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker ��ü ����");
	}
	@Override
	public void VolumeUp() {
		System.out.println("===> AppleSpeaker ���� ��");
	}
	@Override
	public void VolumeDown() {
		System.out.println("===> AppleSpeaker ���� �ٿ�");
	}
}
