package com.springboot.biz;

import org.springframework.stereotype.Component;


public class LgTv implements TV{
	// �⺻������ �ʼ�
		public LgTv() {
			System.out.println("===> lgTv ��ü ����");
		}
	
	
	public void powerOn() {
		System.out.println("LgTv ������ Ű��");
	}
	public void powerOff() {
		System.out.println("LgTv ������ ����");
	}
	public void VolumeUp() {
		System.out.println("LgTv �Ҹ��� �ø���");
	}
	public void VolumeDown() {
		System.out.println("LgTvLgTv �Ҹ��� ������");
	}
}