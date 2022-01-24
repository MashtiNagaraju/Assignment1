package pack1;

class priaccessspecifier
{ 
private void display() 
    { 
        System.out.println("private access specifier"); 
    } 
} 
  
class B 
{ 
public static void main(String args[]) 
    { 
	priaccessspecifier obj = new priaccessspecifier(); 
        // Trying to access private method
        // of another class 
        obj.display(); 
    } 
} 