package chapter2.ex2.suffle;

public class TestProgram {

	public static void main(String[] args) {

		
		int[][] lottos = {{1,2,3}, {4,5,6},{7,8,9}};
		int[] temp;
		temp = lottos[2];
		lottos[2] = lottos[0];
		lottos[0] = temp;
		System.out.println(lottos[0][2]);
		System.out.println(lottos[2][0]);
//4.		
//		int[] nums = {2,3,1,4,7,6,5,2,55,4,7};
//		//nums �迭���� 55���� ã�Ƽ� �� �ε����� ����Ͻÿ� 
//		
//		int index = 0;
//		
//		for(int i=0; i<nums.length; i++) {
//			if(nums[i]==55) {
//				index = i;
//				}
//		}
//		
//		System.out.println("55�� ��ġ��: " + index);
		
		
		
		
		
	//3.	
//		int[] nums1 = {1,2,3};
//		int[] nums2 = {4,5,6};
//		int[] nums = new int[6];
//		
//		for(int i=0; i<nums1.length; i++) {
//			               nums[i] = nums1[i];
//		}
//		
//		for(int k=0; k<nums2.length; k++) {
//			nums[k+3] =  nums2[k];
//		
//		}
//			
//		for(int j=0; j<nums.length; j++)
//		System.out.println(nums[j]);
//		
		
// 2.	
//		int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10};
//		int[] nums2 = new int[20];
//
//		for(int i =0; i<nums2.length; i++) {
//			System.out.print(nums2[i]);
//		}
//		System.out.println();
//
//		for(int j=0; j<nums.length; j++) {
//			nums2[j] = nums[j];
//		}
//
//		System.out.println();
//		for(int i =0; i<nums2.length; i++) {
//			System.out.print(nums2[i]);
//		}
//		
//		nums = nums2; //nums���ٰ� nums2�� �����Ѱ����� nums�� �迭�� ��ü�Ѵ�. nums2�� �������� �ȴ�. 
//		// ������ �ݷ��� ���� ���� 1. �޸� ������  2. cpu�� ���� �ð��� ���� ��  
		



		//1.Random rand = new Random();
		
		//		int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10};
		//
		//		for(int i =0; i<nums.length; i++) {
		//			System.out.print(nums[i]);
		//		}
		//		System.out.println();
		//
		//		for(int k=0; k<5; k++) {	
		//
		//			int left = rand.nextInt(10);
		//			int right =  rand.nextInt(10);
		//
		//			if(left<10&&right<10&&left==right) //�� �ڸ����� ������
		//				left++;		
		//
		//			int a= 0;	
		//
		//			a =nums[left];
		//			nums[left]= nums[right];
		//			nums[right]=a;
		//
		//			//�� �ε��� ��ġ�� ���� �ٲٱ�
		//			for(int j =0; j<nums.length; j++) {
		//				System.out.print(nums[j]);
		//			}
		//			
		//			System.out.println();
		//		}
	}
}


