package com.springbook.ioc.injection;

import java.util.List;

public class CollectionBean {
	private List<String> addressList;  //private�̶� �ٺ� �ȵǰ� ���Լ� �����Ѵ�. ���ǵ��� �ݳ�. 
	public void setAddressList(List<String> addressList) {  //��������. ������ ������ xml����.
		this.addressList=addressList;
	}
	public List<String> getAddressList(){
		return addressList;
	}
}
