import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatement {
    public static void main(String[] args) {


//    a = 0; 0/9 => 10번
//    while (a>1){조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
//        a --;

//        조건식을 변화시키는 구문
//
//    while 사용해서 2~10까지 출력

//    int a=2 ;
//    while(a <=10) {
//        System.out.println(a);
//        a++;
//    }
//
//    int a = 1;
//    while(a < 10){
//        a++;
//        System.out.println(a);
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("구구단 단수를 입력해주세요");
//            int input = sc.nextInt();
//            int a = 0;
//            while (a < 10) {
//                System.out.println(input + " X " + a + " = " + input * a);
//                a++;
//
//        while(true){
//            String answer = "0234";
//            Scanner sc = new Scanner(System.in);
//
//            System.out.println("비밀번호를 입력하세요");
//            String input = sc.nextLine();
//            if (answer.equals(input)) {
//                System.out.println("문이 열렸습니다.");
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");

//            }
//        int a = 0;
//        while (true) {
//            String answer = "0234";
//            Scanner sc = new Scanner(System.in);
//        }
//
//        System.out.println("비밀번호를 입력하세요");
//        String input = sc.nextLine();
//        if (answer.equals(input)) {
//            System.out.println("문이 열렸습니다.");
//        }
//        break;
//        else
//
//  {
//       System.out.println("비밀번호가 틀렸습니다.");   }a++;         if(a==5) {
//            System.out.println("입력횟수를 초과했습니다");
//            breakout;
//            int a = 1;
//            do {
//                a++;
//                System.out.println(a);
//            } while (a < 10);
//
////      for 문을 통해2~ 10
//            for (int i = 2; i < 11; i++) {
//                System.out.println(i);
//
////a % 2! = 0 홀수만출력하기
//        for(int i = 1; i<11; i++){
//                if(i % 2 == 0) {
//                    continue;
//                }
//            System.out.println(i);

//        }
//      배열과 enhance for문
//      int[] myArr ={1,5,7,9,10};
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
//
//        for(int i=0; i<5; i++){
//            System.out.println(myArr[i]);
//        }
////            enhanced for 문
//
//            for(int a : myArr){
//                System.out.println(a);
//            }
//        int a=10;
////        int b=20;
//
//// 일반 for 문을 통해 myArr의 값ㅇ에 10씩 더한뒤에 출력
//        int[] myArr ={1,3,5,7,9};
//        for (int i = 0; i<myArr.length; i++){
//            myArr[i] +=10;
//
//        }
//        System.out.println(Arrays.toString(myArr));
//
//        for (int e : myArr){
//            e +=10;
//        }
//        System.out.println(Arrays.toString(myArr));
//
//        //          자바 변수의 유효범위 :{}
//        int num = 10;
//        if(num > 1) {
//            int abc = 20;
//            num = 20;
//
//
//
//        }
//        System.out.println(num); // if문 밖에서 선언된 변수값을 if안에서 접근하여 변경하는것은 가능 .
//        System.out.println("abc");// if문 안에서 정의된 변수는 밖에서 인지 불가
//
////        다중반복문
//
//
//// 2~9단 전부 출력 =
////  => 2단입니다.
////    2X1
////    2X2
//
////3단입니다
//
//        int a = 1;
////    while(a < 10){
//        a++;
//        System.out.println(a);
//        while (true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("구구단 단수를 입력해주세요");
//            int input = sc.nextInt();
//            int a = 0;
//            while (a < 10) {
//                System.out.println(input + " X " + a + " = " + input * a);
//                a++;
//
//        for (int num = 2; num < 10; num++){
//            System.out.println(num + "단 입니다.");
//            for (int i = 1; i < 10; i++) {
//                System.out.println(num + " X " + i + " = " + num * i);

//          2중 for 문을 통해 배열접근
        int[][] arr = { {1,2,3,4}, {5,6,7,8} } ;
        System.out.println(arr[1][0]);

        for(int k = 0; k<arr.length; k++){
            for(int i =0; i<arr[k].length; i++) {
                System.out.println(arr[k][i]);
            }
        }

//        trim,strip

        String trimSt = " hello world ";
        String new_trimSt = trimSt.trim();
        String stripSt = trimSt.strip();
        System.out.println(new_trimSt);
        System.out.println(trimSt);

//       TOUPPER

        String a = "Hello";
        String a1 = a.toUpperCase();
        String a2 = a.toLowerCase();








    }
}


