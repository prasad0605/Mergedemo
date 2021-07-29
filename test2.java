package Pack1;

class A
{
     int i;
 
     {
          System.out.println("First IIB Block");
     }
 
     {
          System.out.println("Second IIB Block");
     }
 
     A(int j)
     {
          this();
          System.out.println("First Constructor");
     }
 
     A()
     {
          System.out.println("Second Constructor");
     }
}
 

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A a = new A(50);
	}

}
