package assignment1;

public class StringToPrimitiveDatatypes {
	//using Integer.parseInt() method  
	  
	public static void main(String args[]){  
	 String s="200";  //Declaring String variable 
	int i=Integer.parseInt(s); //Converting String into int using Integer.parseInt()  
	System.out.println(i);  
	
	double d=Double.parseDouble(s);// converting string to double
	System.out.println(d);
	 
	short sh=Short.parseShort(s);// converting string to short
	System.out.println(sh);
	 
	float f=Float.parseFloat(s);// converting string to float
	System.out.println(f);
	
	long l=Long.parseLong(s);// converting string to long
	System.out.println(l);
	
	for(int j=0; j<s.length();j++){  
        char c = s.charAt(j);  
        System.out.println("char at "+j+" index is: "+c);  
        }
        
        boolean b1=Boolean.parseBoolean(s);
        System.out.println(b1);  
	}	
}