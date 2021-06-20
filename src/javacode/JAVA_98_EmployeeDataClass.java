package javacode;

import java.util.ArrayList;

public class JAVA_98_EmployeeDataClass {
    public String companyName() {
    	return "IBM";
    }
    public int getempcount() {
    	return 1000;
    }
    public Object[] getCompanyInfo() {
    	//return count and name
    	Object comp[]= new Object[2];
    	comp[0]="IBM";
    	comp[1]= "1000";
    	return comp;
    }
    public ArrayList<String> getEmployeeList() {
    	 System.out.println("getEmployeelist");
    	 ArrayList<String> empList = new ArrayList<String>();
    	 empList.add("ramu");
    	 empList.add("sowji");
    	 empList.add("ishu");
    	 return empList;
    	 
    	 
    }
	public static void main(String[] args) {
		
		JAVA_98_EmployeeDataClass obj = new JAVA_98_EmployeeDataClass();
		String name=obj.companyName();
		int count=obj.getempcount();
		Object list[]=obj.getCompanyInfo();
		System.out.println(name+" "+count);
	   for(Object e:list) {
		   System.out.println(e);
		   
	   }
	   ArrayList<String> emplist= obj.getEmployeeList();
	   for(String e1:emplist) {
		   System.out.println(e1); 
	   }
	}

}
