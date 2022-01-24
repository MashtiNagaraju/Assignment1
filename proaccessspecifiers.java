package pack1;

public class proaccessspecifiers {

	protected void display1() 
    { 
     System.out.println("This is protected access specifier"); 
    } 
	
	public static void main(String[] args)
	{
		proaccessspecifiers obj = new proaccessspecifiers();
		obj.display1();
	}
}
 