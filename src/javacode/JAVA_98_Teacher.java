package javacode;

import java.util.ArrayList;

public class JAVA_98_Teacher {
	//WAF: it will take college name and return faculty list
	public ArrayList<String> getCollegeName(String collName) {
		System.out.println("College name is: "+collName);
		ArrayList<String> collList = new ArrayList<String>();
		switch (collName) {
		case "shanthinikethan":
			collList.add("sridhar");
			collList.add("shahana");
			collList.add("rammohan");
			
			break;
		case "saketh juniorcollege":
			collList.add("SWAPI");
			collList.add("SWATHI");
			collList.add("SARITHA");
			
			break;
		default:
			System.out.println("college name is not found");
			break;
		}
		return collList;
	}
	public String[] frendslist(String stagewise) {
		System.out.println("frends list: "+stagewise);
		String frnd[] = new String[3];
		switch (stagewise) {
		case "10th":
			frnd[0] = "vani";
			frnd[1]= "anusha";
			frnd[2]= "tejaswi";
			
			
			break;
		case "degree":
			frnd[0] = "rammohan";
			frnd[1]= "mahendher";
			frnd[2] = "naresh";
			
			break;
		default:
			System.out.println("frnd name is not found");
			break;
		}
		return frnd;
		
	}

	public static void main(String[] args) {
		JAVA_98_Teacher cn = new JAVA_98_Teacher();
		ArrayList<String> faculty=cn.getCollegeName("shanthinikethan");
		for(String f:faculty) {
			System.out.println(f);
	}
		String frlo[]=cn.frendslist("10th");
		for(int i =0;i<frlo.length;i++) {
			System.out.println(frlo[i]);
		}
		}

	}


