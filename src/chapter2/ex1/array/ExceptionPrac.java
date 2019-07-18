package chapter2.ex1.array;

public class ExceptionPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++) {
			   
		    if(i%2==0&&i<=3) 
		   System.out.printf("%c,", 'A'+i);
		    
		   else   if(i==4) 
			   System.out.printf("%c", 'A'+i);
		   
		   else 
			   System.out.print("   ,");
		   
		}
	}

}
