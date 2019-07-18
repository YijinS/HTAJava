public class First{
	public static void main(String[] args)
	{
		int k1=50, k2=65, k3 =80;
	
		int total = k1+k2+k3;
		float avg = total/3;
		
		System.out.println("┌──────────────────────────────────────────┐");
		System.out.println("│                                          │");
		System.out.println("│                  \"성적 출력\"              │");
		System.out.println("│                                          │");
		System.out.println("└──────────────────────────────────────────┘");
		System.out.printf("국어 1 : %3d\n", k1);
		System.out.printf("국어 2 : %3d\n", k2);
		System.out.printf("국어 3 : %3d\n", k3);
		System.out.println("	");
		System.out.printf("총점 : %3x\n", total);
		System.out.printf("평균 : %5.2f\n", avg);
		
		System.out.print("────────────────────────────────────────────" );
		System.out.println(80);
		
	}
}


