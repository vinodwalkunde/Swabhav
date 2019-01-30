package com.techlabs.singleton.test;

import com.techlabs.singleton.DataService;
import com.techlabs.singleton.DataServiceEnum;

public class TestDataServiceEnum {

	public static void main(String[] args) {
		DataService dataService = DataService.getInstance();
		DataService dataService2 = DataService.getInstance();
		System.out.println(dataService.hashCode());
		System.out.println(dataService2.hashCode());

		DataServiceEnum dataServiceEnum = DataServiceEnum.INSTANCE;
		DataServiceEnum dataServiceEnum2 = DataServiceEnum.INSTANCE;
		System.out.println(dataServiceEnum.hashCode());
		System.out.println(dataServiceEnum2.hashCode());
	}

}
