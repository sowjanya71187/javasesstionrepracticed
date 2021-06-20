package stringmanupulation;

public class StringManupulationConcepts {

	public static void main(String[] args) {
	
		String str = "this is my java code and i am so happy i";
//		System.out.println(str.length());
//		System.out.println(str.charAt(37));
		//System.out.println(str.charAt(38));
		//String index out of box exception
//		System.out.println(str.indexOf('i'));
//		System.out.println(str.indexOf('i', str.indexOf('i')+1));
//		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));
//	    System.out.println(str.indexOf('i', str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1)+1));	
	    System.out.println(str.indexOf("sowji"));
//	    int num = str.indexOf('i');
//	    while(num>=0) {
//	    	System.out.println(num);
//	    	num = str.indexOf('i',num+1);
//	    	
//	    }
	    int num1 = str.indexOf('i');
	    for(int K=num1;K<=num1;K++) {
	    	System.out.println(num1);
	    	num1= str.indexOf('i',num1+1);
	    	
	    }
	    
	    String r = "i got lose u";
	    if(r.indexOf("lose")>0) {
	    	System.out.println(true);
	    }else {
	    	System.out.println(false);
	    }
	    
	    String l = "m u b l u so much";
	    
	    if(l.indexOf("b")==-1) {
	    	System.out.println("ava is naot there");
	    }else {
	    	System.out.println("va is there for me");
	    }
	    //trim
	    
	    //trim is always removing the spaces from corners
	    String m = " rama krishna ";
	    System.out.println(m.trim());
	    
	    //Contains
	    
	    String name = "i have big family";
	    if(name.contains("family"))
	    {
	    	System.out.println("family 6is still there");
	    }else {
	    	System.out.println("family is not there");
	    }
	    String s1 = "ishaan varma";
	    String s2 = "ishaan varma";
	    
	    //equals
	    
	    System.out.println(s1.equals(s2));
	    //subString starting ( 8,10] exclude 8 to 9 will print
	    String rm = "need tell u once bv want leave with u";
	    System.out.println(rm.substring(6));
	    System.out.println(rm.substring(5, 12));
	    System.out.println(rm.substring(rm.indexOf("once")+5, rm.length()));
	    System.out.println(rm.substring(rm.indexOf("once")+5));
	    
	    //replace
	    
	    String bv = "beve lkmr u";
	    //System.out.println(bv.replace('e', 'a').replace('k', 'o')
	    		//.replace('m', 'v').replace('r', 'e'));
	    
	    //split
	 System.out.println("=====================");   
	    String ong = "vslli;umar;ava;ishu";
	    
	  String arr[]= ong.split(";");
	 // System.out.println(arr[2]);
	  for(int i=0;i<arr.length;i++){
		  System.out.println(arr[i]);
		  
	  }
	  System.out.println("====================="); 
	    
	  for(String e : arr ) {
		  System.out.println(e);
	  }
	    
	    

	}

}