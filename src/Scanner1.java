import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x =0;
		
		System.out.println("data > ");
		
	
		int i = 0;
		int total =0;
		while(scan.hasNext()) {
			x= scan.nextInt();
			total += x;
			i++;
		}
		System.out.printf("count is: %d",i); // 
		System.out.println();
		System.out.printf("total is: %d",total); // 
//		
//		int i = 0;
//		do {		
//			x= scan.nextInt();
//			System.out.println(x); // 그 뒤의 두번째 수 하나  
//			i++;
//			
//		}while(scan.hasNext());
//		
//		System.out.printf("count is: %d",i); // 
		
	
//		for(;scan.hasNext();) {
//			x= scan.nextInt();
//			System.out.println(x); // 그 뒤의 두번째 수 하나 
//		}
		
	
	}
}
