import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SW {
//    정수 리스트 num_list가 주어질 때,
//    첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요.
//    음수가 없다면 -1을 return합니다.
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);x
//
//        solution(new int[]{-1, 4, 15, 46, 38, -2, 15});
//        solution(new int[]{13, 22, 53, 24, 15, 6});
//    }


//
//    public static int solution(int[] num_list) {
//        int answer = -1;


//
//        for (int i = 0; i < num_list.length; i++) {
//            if(num_list[i] < 0){
//                answer = i;
//                break;
//            }
//        }
//
//        System.out.println(answer);
//        return answer;
//    }

//    public static int solution(int[] num_list) {
//        int answer = 0;
//
//        for (int i = 0; i < num_list.length; i++) {
//            if(num_list[i] < 0){
//                answer = i;
//                break;
//            }else{
//                answer = -1;
//            }
//        }
//
//        System.out.println(answer);
//        return answer;
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int YEAR = sc.nextInt();
//
//        if (YEAR % 400 == 0){
//            System.out.println("윤년입니다");
//        }else if(YEAR % 100 ==0) {
//            System.out.println("윤년이x");
//        }else if(YEAR % 4 ==0) {
//            System.out.println("윤년입니다");
//        }else {
//            System.out.println("윤년이x");
//        }

//    class Solution {
//        public int solution(int angle) {
//            int answer = 0;
//            if (angle < 90) {
//                answer = 1;
//
//            } else if (90 == angle) {
//                answer = 2;
//
//            } else if (angle < 180) {
//                answer = 3;
//
//            } else if (angle == 180) {
//                answer = 4;
//            }
//
//            return answer;
//        }
//
//
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] size1 = new int[size];
        System.out.println(Arrays.toString(size1));

        int total = 0;
        int total2 = 0;

        for (int i = 0; i < size; i++) {
            size1[i] = sc.nextInt();
//            System.out.println("i = " + i);
            if ((i + 1) % 2 == 0) {
//                System.out.println("i+1 = " + (i + 1));
                total2 = total2 + size1[i];
            } else {
                total = total + size1[i];

            }
            System.out.println(total);
//            System.out.println(Arrays.toString(size1));
            System.out.println(total2 - total);
        }
//
//        int total = 0;
//        int total2 = 0;

//        for (int i = 0; i < size; i++) {
//            size1[i] = sc.nextInt();
//            System.out.println("i = "+i );
//            if((i+1)%2==0) {
////                System.out.println("i+1 = "+(i+1));
//                total2=total2+size1[i];
//            }else{
//                total = total+size1[i];
//            }
//            System.out.println("total2 = "+ total2);
//            System.out.println("total = "+ total);
//        }
//        System.out.println(Arrays.toString(size1));
//    }


// if(size%2==0){
//     for (int i = 0; i < size; i++) {
//
//     }
// }else{size%2 !=0;
// {

//    size1[size] = 0;
//
//        System.out.println(siz  e);
//
//        System.out.println("");


        //
//        for (int i = 1 ; i <= 9; i++) {
//
//            System.out.println(NUM*i);

//            }


//        for (int i = 0; i < num ; i++) {
//
//            for (int j = 0; j <= i ; j++) {
//                System.out.print("*");
//
//
//            }
//            System.out.println();
//        }

//
//        for (int i = 0; i < num; i++) {
//            for (int j = num-i; j > 0 ; j--) {
//                System.out.print("*");
//
//
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < num; i++) {
//             for (int j = 1; j < num-i; j++) {    //공백을 담당하는 for문
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {    //별을 담당하는 for문
//                System.out.print("*");
//            }
//            System.out.println();
//
//
//        }


//
//        String[] arr = {"홍신애","심재혁","조경남","이창선"};
//        System.out.println(arr[num-1]);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length ; i++) {
//
//            System.out.println("조원"+arr[i]+"입니다.");
//        }

//        arr[0] = num/500;
//        num = num%500;
//        arr[1] = num/100;
//        num = num%100;
//        arr[2] =num/50;
//        num = num%50;
//        arr[3] =num/10;
//
//        System.out.println("500원은" + arr[0] +"개 입니다.");
//        System.out.println("100원은" + arr[1] +"개 입니다.");
//        System.out.println("50원은" + arr[2] +"개 입니다.");
//        System.out.println("10원은" + arr[3] +"개 입니다.");


// for (int i = 0; i < num; i++) {
//        for (int j = 0; j < i; j++) {    //공백을 담당하는 for문
//        System.out.print(" ");
//        }
//        for (int j = 0; j < num - i; j++) {    //별을 담당하는 for문
//        System.out.print("*");
//        }
//        System.out.println()

//for (int i = 1; i < 10; i++) {
//
//    System.out.println(i*num);


    }
}
