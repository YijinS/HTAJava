package omokprac;
import java.util.InputMismatchException;
import java.util.Scanner;
public class OmokPls {
   public static void main(String[] args) {

      //1-1. ������ ��Ŀ ���  1-2. �ߺ� ��ǥ ���� ����  1-3. ���� ����  1-4.3*3 ������ ���Ƴ��� 
      //2. ���带 �̻ڰ� �ٸ��ּ���
      //3. ��¿� �迭�� �̿��Ѵ� = ��� ���۸� �̿��Ѵ�. -��ǥ ������ �����. 
      Scanner scan = new Scanner(System.in);

      final int HEIGHT =10;
      final int WIDTH =15;
      int size = 100;

      int[] xs = new int[size] ;
      int[] ys = new int[size] ;
      int current =0;

      //   int[] joker = new int[5]; //��Ŀ �ټ��� 

      char[][] board = new char[HEIGHT][WIDTH];
      for(int a=0; a<HEIGHT; a++) {  //�� �迭�� ���� ��� ����
         for(int b=0; b<WIDTH; b++) { 
            board[a][b] = '��';
         }
      }

      exit:
         while(true) {//������ ���

            for (int i = 0; i < board.length; i++) { 
               System.out.println(); //���� ���� �پ��־ ��ĭ �ٰ� ����
               for (int j = 0; j < board[i].length; j++) { 
                  if(i==0&&j==0)
                     System.out.printf("%c",'��');
                  else if(i==0 && j==WIDTH-1)   //WIDTH-1�� ������ WIDTH�� 15, �迭�� ��� 0~14���� 
                     System.out.printf("%c",'��');
                  else if(i==HEIGHT-1&&j==0)
                     System.out.printf("%c",'��');
                  else if(i==HEIGHT-1&&j==WIDTH-1)
                     System.out.printf("%c",'��');

                  else if(i==0)   //0��
                     System.out.printf("%c",'��');
                  else if(j==0) //0��
                     System.out.printf("%c",'��');
                  else if(i==HEIGHT-1) //������ ��
                     System.out.printf("%c",'��');
                  else if(j==WIDTH-1) //������ ��
                     System.out.printf("%c",'��');
                  else    //�� ��� 
                     System.out.print(board[i][j] );   
               }
            }

            System.out.println("\n");

            //���� �Է�
            System.out.println("x�� y��ǥ�� �����̽��� �����ؼ� �Է�>");
            int x = 0; 
            int y = 0;
            
            xs[current]=x;
            ys[current]=y;
            
            // ���� �� ���� �Է½�
            try {
               x = scan.nextInt();  
               y =scan.nextInt();
            }catch(InputMismatchException ime){
               System.out.println("������ �Է�");
               scan = new Scanner(System.in);     // Scanner�� ���׸� �ذ��ϱ� ���� �ڵ�
            } 
 

            // �� �ߺ��˻� �ٽ��Է�                                               -> �̷���1. while�� ���� ����ϴ� �Ͱ� ��ü 2.while�� �ȿ� �ߺ� �˻縦 �� �� continue�� �ϴ¹�. 3.���������ƴ� �迭�� ���� �ϴ°�찡 �ִµ� 
            // 2���� ��� while�� �� ���� ���ϱ� �ӵ����� ������ �ٶ����Ѱ��� 3������, �������� �� �� �迭�� ������� �ʴ��̻� �ڵ������ ���������. 
            while(board[x][y]== '��' || board[x][y] == '��') { 
               if(board[x][y]== '��' || board[x][y] == '��') {
                  System.out.printf("�� �ߺ� �ٽ� �ֶ� >> ");  
               }
               x = scan.nextInt();  
               y =scan.nextInt();
            }

            int cnt =0; //���ӵǴ� ���� �� 
            //x�� �Ϸ�
            for(int b=0; b<board.length-1; b++) {
               if(board[x][b]==board [x][b+1])
               {
                  cnt++;  //cnt�� 4�� ���ϴ� ��� ���� ���� ������ �� ���� ���� ���Ƽ� �̹� cnt�� ������ ���̱� ������ 4���Ǹ� ������ ����Ǿ� ������.

                  if(cnt==4&&board[x][b] == '��' ) {
                     System.out.println("�׸� �μ��� ���� �� ����");
                     break exit;
                  }
                  else if(cnt==4&&board[x][b] =='��') {
                     System.out.println("�׸� �μ��� �� �� ����");
                     break exit;
                  }
               }
            }

            int cnt1 = 0;
            //y�� �Ϸ�
            for(int c=0; c<board.length-1; c++) {
               if(board[c][y]==board [c+1][y])
               {  cnt1++;

                  if(cnt1==4&&board[c][y] == '��' ) {
                     System.out.println("�׸� �μ��� �� �� ����");
                     break exit;
                  }
                  else if(cnt1==4&&board[c][y] =='��') {
                     System.out.println("�׸� �μ��� �� �� ����");
                     break exit;
                  }
               }
            }


            //���������� ������ ��
            int cnt2 = 0;
            for(int d=0; d<board.length-1; d++) {
               if(board[d][d]==board [d+1][d+1])
               {
                  cnt2++;

                  if(cnt2==4&&board[d][d] == '��' ) {
                     System.out.println("�׸� �μ��� ���� �� ����");
                     break exit;
                  }
                  else if(cnt2==4&&board[d][d] =='��') {
                     System.out.println("�׸� �μ��� �� �� ����");
                     break exit;
                  }
               }
            }

//            //�����ʿ��� ���� ��
//            int cnt3 = 0;
//            //y�� �Ϸ�
//            for(int e=1; e<=board.length-1; e++) {
//               if(board[e][e]==board[e+1][e-1])
//               {
//                  cnt3++;
//
//                  if(cnt3==4&&board[e][e] == '��' ) {
//                     System.out.println("�׸� �μ��� ���� �� ����");
//                     break exit;
//                  }
//                  else if(cnt3==4&&board[e][e] =='��') {
//                     System.out.println("�׸� �μ��� �� �� ����");
//                     break exit;
//                  }
//               }
//            }



            // �� �� ���� ��
            if(current%2!=0)
               board[x][y] = '��'; 
            else
               board[x][y] = '��';


            current  +=1;



         }
   }
}