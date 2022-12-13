package com.springboot.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;



public class SamsungTv implements TV{
	@Autowired
	private Speaker speaker;
	private int price;
	
	
	/* 방법2 
	 * @Resource(name="apple") @Resource 어노테이션 사용하기
	 * 
	 * 
	 * */
	/*
	@Resource(name="apple")
	private Speaker speaker;
	private int price;
	*/
	
	/* @Autowired - 변수의 필요한 기능(speaker)를 메모리에서 해당 인터페이스 선정 + 
	 * @Qualifier - 여러개의 Speaker중 어떤것을 참조할지 선택
	 */
	
	/*
	@Autowired 
	@Qualifier("apple")
	private Speaker speaker;
	private int price;
	
	*/
	
	
	// 생성자
	public SamsungTv(){
		System.out.println("===> SamsungTv 객체 생성");
	}
	public SamsungTv(Speaker speaker, int price ){
		System.out.println("===> SamsungTv(2) 객체 생성");
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
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}
	
	public void initMethod() {
		System.out.println("===> 객체 초기화 작업 처리");
	}
	public void destoryMethod() {
		System.out.println("===> 객체 삭제전 작업 처리할 로직");
	}
	public void powerOn() {
		System.out.println("SamsungTv 전원을 키다. (가격:"+price+")");
	}
	public void powerOff() {
		System.out.println("SamsungTv 전원을 끄다");
	}
	public void VolumeUp() {
		//speaker = new SonySpeaker();
		// System.out.println("SamsungTv 소리를 올리다");
		speaker.VolumeUp();
	}
	public void VolumeDown() {
		//speaker = new SonySpeaker();
		// System.out.println("SamsungTv 소리를 내린다");
		speaker.VolumeDown(); 
	}
	
	
	
}
