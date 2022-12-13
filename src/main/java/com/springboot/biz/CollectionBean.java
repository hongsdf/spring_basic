package com.springboot.biz;

import java.util.List;
import java.util.Map;

public class CollectionBean {
	private List<String> addressList;
	private Map<String,String> addressList2;

	public Map<String, String> getAddressList2() {
		return addressList2;
	}

	public void setAddressList2(Map<String, String> addressList2) {
		this.addressList2 = addressList2;
	}

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	
	
}
