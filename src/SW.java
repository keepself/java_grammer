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

    class Solution {
        public int solution(int angle) {
            int answer = 0;
            if (angle < 90) {
                answer = 1;

            } else if (90 == angle) {
                answer = 2;

            } else if (angle < 180) {
                answer = 3;

            } else if (angle == 180) {
                answer = 4;
            }

            return answer;
        }


    }



        }

