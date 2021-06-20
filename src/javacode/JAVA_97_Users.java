package javacode;

import java.util.ArrayList;

public class JAVA_97_Users {
	String name;
	int id;
	String deviceList[];
	ArrayList<String> orderHistoryList;
	

	public static void main(String[] args) {
		JAVA_97_Users u1 = new JAVA_97_Users();
		u1.name = "ramu";
		u1.id = 1001;
		u1.deviceList = new String[3];
		u1.deviceList[0]= "Apple iphon12";
		u1.deviceList[1]= "Apple x";
		u1.deviceList[2]= "samsung c9pro";
		u1.orderHistoryList = new ArrayList<String>();
		u1.orderHistoryList.add("naki 2020");
		u1.orderHistoryList.add("monitor 2019");
		u1.orderHistoryList.add("tshirts 2020");
		
		System.out.println(u1.name+" "+ u1.id);
		for(String e :u1.deviceList ) {
			System.out.println(e);
			
		}
		for(String e1 : u1.orderHistoryList) {
			System.out.println(e1);
		}

	}

}
