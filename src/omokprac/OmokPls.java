package omokprac;
import java.util.InputMismatchException;
import java.util.Scanner;
public class OmokPls {
   public static void main(String[] args) {

      //1-1. 아이템 조커 기능  1-2. 중복 좌표 에러 설정  1-3. 승패 설정  1-4.3*3 오목은 막아놓기 
      //2. 보드를 이쁘게 꾸며주세요
      //3. 출력에 배열을 이용한다 = 출력 버퍼를 이용한다. -좌표 개념이 생긴다. 
      Scanner scan = new Scanner(System.in);

      final int HEIGHT =10;
      final int WIDTH =15;
      int size = 100;

      int[] xs = new int[size] ;
      int[] ys = new int[size] ;
      int current =0;

      //   int[] joker = new int[5]; //조커 다섯개 

      char[][] board = new char[HEIGHT][WIDTH];
      for(int a=0; a<HEIGHT; a++) {  //판 배열에 ┼를 모두 저장
         for(int b=0; b<WIDTH; b++) { 
            board[a][b] = '┼';
         }
      }

      exit:
         while(true) {//오목판 출력

            for (int i = 0; i < board.length; i++) { 
               System.out.println(); //위에 판이 붙어있어서 한칸 뛰고 시작
               for (int j = 0; j < board[i].length; j++) { 
                  if(i==0&&j==0)
                     System.out.printf("%c",'┌');
                  else if(i==0 && j==WIDTH-1)   //WIDTH-1의 이유는 WIDTH는 15, 배열의 경우 0~14까지 
                     System.out.printf("%c",'┐');
                  else if(i==HEIGHT-1&&j==0)
                     System.out.printf("%c",'└');
                  else if(i==HEIGHT-1&&j==WIDTH-1)
                     System.out.printf("%c",'┘');

                  else if(i==0)   //0행
                     System.out.printf("%c",'┬');
                  else if(j==0) //0열
                     System.out.printf("%c",'├');
                  else if(i==HEIGHT-1) //마지막 행
                     System.out.printf("%c",'┴');
                  else if(j==WIDTH-1) //마지막 열
                     System.out.printf("%c",'┤');
                  else    //┼ 출력 
                     System.out.print(board[i][j] );   
               }
            }

            System.out.println("\n");

            //오목 입력
            System.out.println("x와 y좌표를 스페이스로 구분해서 입력>");
            int x = 0; 
            int y = 0;
            
            xs[current]=x;
            ys[current]=y;
            
            // 숫자 외 문자 입력시
            try {
               x = scan.nextInt();  
               y =scan.nextInt();
            }catch(InputMismatchException ime){
               System.out.println("정수만 입력");
               scan = new Scanner(System.in);     // Scanner의 버그를 해결하기 위한 코드
            } 
 

            // 알 중복검사 다시입력                                               -> 이렇게1. while을 따로 사용하는 것과 전체 2.while문 안에 중복 검사를 한 후 continue를 하는법. 3.판을보고가아닌 배열을 보고 하는경우가 있는데 
            // 2번의 경우 while을 한 번만 도니까 속도면이 좋지만 바람직한것은 3번으로, 응용기술을 들어갈 때 배열을 사용하지 않는이상 코드수정이 어려워진다. 
            while(board[x][y]== '☆' || board[x][y] == '★') { 
               if(board[x][y]== '☆' || board[x][y] == '★') {
                  System.out.printf("알 중복 다시 둬라 >> ");  
               }
               x = scan.nextInt();  
               y =scan.nextInt();
            }

            int cnt =0; //연속되는 돌의 수 
            //x축 일렬
            for(int b=0; b<board.length-1; b++) {
               if(board[x][b]==board [x][b+1])
               {
                  cnt++;  //cnt를 4로 정하는 경우 가던 길이 막혀도 앞 뒤의 수가 같아서 이미 cnt는 더해진 값이기 때무에 4만되면 게임이 종료되어 버린다.

                  if(cnt==4&&board[x][b] == '★' ) {
                     System.out.println("그만 두세요 검은 돌 성공");
                     break exit;
                  }
                  else if(cnt==4&&board[x][b] =='☆') {
                     System.out.println("그만 두세요 흰 돌 성공");
                     break exit;
                  }
               }
            }

            int cnt1 = 0;
            //y축 일렬
            for(int c=0; c<board.length-1; c++) {
               if(board[c][y]==board [c+1][y])
               {  cnt1++;

                  if(cnt1==4&&board[c][y] == '★' ) {
                     System.out.println("그만 두세요 검 돌 성공");
                     break exit;
                  }
                  else if(cnt1==4&&board[c][y] =='☆') {
                     System.out.println("그만 두세요 흰 돌 성공");
                     break exit;
                  }
               }
            }


            //왼쪽위에서 오른쪽 밑
            int cnt2 = 0;
            for(int d=0; d<board.length-1; d++) {
               if(board[d][d]==board [d+1][d+1])
               {
                  cnt2++;

                  if(cnt2==4&&board[d][d] == '★' ) {
                     System.out.println("그만 두세요 검은 돌 성공");
                     break exit;
                  }
                  else if(cnt2==4&&board[d][d] =='☆') {
                     System.out.println("그만 두세요 흰 돌 성공");
                     break exit;
                  }
               }
            }

//            //오른쪽에서 왼쪽 밑
//            int cnt3 = 0;
//            //y축 일렬
//            for(int e=1; e<=board.length-1; e++) {
//               if(board[e][e]==board[e+1][e-1])
//               {
//                  cnt3++;
//
//                  if(cnt3==4&&board[e][e] == '★' ) {
//                     System.out.println("그만 두세요 검은 돌 성공");
//                     break exit;
//                  }
//                  else if(cnt3==4&&board[e][e] =='☆') {
//                     System.out.println("그만 두세요 흰 돌 성공");
//                     break exit;
//                  }
//               }
//            }



            // 흰 돌 검은 돌
            if(current%2!=0)
               board[x][y] = '☆'; 
            else
               board[x][y] = '★';


            current  +=1;



         }
   }
}