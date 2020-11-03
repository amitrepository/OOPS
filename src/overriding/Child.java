package overriding;

public class Child extends parent {
	
	public void disp() {
//		super.disp();
		System.out.println("child class method");
	}
	
	public void newmethod() {
		System.out.println("another child method");
	}

	public static void main(String[] args) {
		
//		  Child obj1=new Child(); obj1.disp();
//		  
		
//		  parent obj2=new parent(); obj2.disp();
//		  
		  
		  parent obj3=new Child(); obj3.disp();
		  
		 
				
		
		/* Child obj4=new parent(); obj3.disp(); */
		 

	}

}
