package chapter2.ex1.cutting;

//다음 코드는 오목 프로그램의 절차를 함수로 나누어 놓은 코드이다.
//절차에서 호출되고 있는 함수의 이름을 정의하고 그 함수를 구현하시오.


//
//참고) 구현의 난이도를 낮추기 위해 함수들이 공유해야 할 모든 변수들은 전역변수로 선언한 상태이므로 반환값이나 넘겨줘야 할 인자가 없다.
//그냥 호출 절차만 보면 된다.


public class HomeWork{

    static int WIDTH = 20;
    static int HEIGHT = 10;
    static char[][] board = new char[HEIGHT][WIDTH];
    static int[] xs = new int[WIDTH*HEIGHT];

    public static void main(String[] args){
        
        // 이차원 배열 board 배열에 격자형의 바둑판 문양의 문자를 채우시오. (단. 바둑판 모양은 다음과 같아야 한다.)
        f1();
        /*
        ┌┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┬┐
        ├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤
        ├┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┤
        */



        // board 배열을 화면에 격자형으로 출력하시오.
        f2();

        // board에 (3,4) 위치에 '●' 문자를 두시오.
        f3();


        // board 배열을 화면에 격자형으로 출력하시오.
        f2();

    }

    private static void f1(){
    
    }

    private static void f2(){
    
    }

    private static void f3(){
    
    }
}