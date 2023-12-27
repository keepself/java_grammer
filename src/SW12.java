import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class SW12 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        sc.nextLine();
//        List<String> cs = new ArrayList<>();
//        for (int i = 0; i < size; i++) {
//            cs.add(sc.nextLine());
//        }
//        System.out.println(cs);
        solution(new int[]{3, 4, 5, 2, 1});
        solution(new int[]{5, 7, 8, 3});


    }

    public static int solution(int[] num_list) {
//        정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

        int plus = 0 ;
        int times = 0 ;

        for (int i = 0; i < num_list.length; i++) {
            plus = plus + num_list[i];
            times = times * num_list[i];
        }

        if(plus*plus>times){
            return 1;
        }else{
            return 0;
        }








        int answer = 0;
        return answer;

    }
}




