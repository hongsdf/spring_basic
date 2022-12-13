package com.springboot.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;



public class SamsungTv implements TV{
	@Autowired
	private Speaker speaker;
	private int price;
	
	
	/* ���2 
	 * @Resource(name="apple") @Resource ������̼� ����ϱ�
	 * 
	 * 
	 * */
	/*
	@Resource(name="apple")
	private Speaker speaker;
	private int price;
	*/
	
	/* @Autowired - ������ �ʿ��� ���(speaker)�� �޸𸮿��� �ش� �������̽� ���� + 
	 * @Qualifier - �������� Speaker�� ����� �������� ����
	 */
	
	/*
	@Autowired 
	@Qualifier("apple")
	private Speaker speaker;
	private int price;
	
	*/
	
	
	// ������
	public SamsungTv(){
		System.out.println("===> SamsungTv ��ü ����");
	}
	public SamsungTv(Speaker speaker, int price ){
		System.out.println("===> SamsungTv(2) ��ü ����");
		this.speaker  = speaker;
		this.price = price;
	}
	
	public Speaker getSpeaker() {
		return speaker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice() ȣ��");
		this.price = price;
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ȣ��");
		this.speaker = speaker;
	}
	
	public void initMethod() {
		System.out.println("===> ��ü �ʱ�ȭ �۾� ó��");
	}
	public void destoryMethod() {
		System.out.println("===> ��ü ������ �۾� ó���� ����");
	}
	public void powerOn() {
		System.out.println("SamsungTv ������ Ű��. (����:"+price+")");
	}
	public void powerOff() {
		System.out.println("SamsungTv ������ ����");
	}
	public void VolumeUp() {
		//speaker = new SonySpeaker();
		// System.out.println("SamsungTv �Ҹ��� �ø���");
		speaker.VolumeUp();
	}
	public void VolumeDown() {
		//speaker = new SonySpeaker();
		// System.out.println("SamsungTv �Ҹ��� ������");
		speaker.VolumeDown(); 
	}
	
	
	
}
