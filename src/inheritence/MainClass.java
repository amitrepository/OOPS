package inheritence;
class A{
	
	
	
	int i=10;
	{
		System.out.println("S");
	}
	
}

class B extends A{
	
	int i=20;
}


public class MainClass {

	public static void main(String[] args) {
		
		B a= new B();
		System.out.println(a.i);
	}

}
