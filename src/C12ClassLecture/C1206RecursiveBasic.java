package C12ClassLecture;

import java.util.Arrays;

public class C1206RecursiveBasic {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 10; i >= 1; i--) {
            total += i;
        }
        System.out.println(total);
        System.out.println(add_acc(10));

//        피보나치
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;

        for (int i = 0; i < 10; i++) {
            num3 = num1 + num2;
            System.out.print("," + num3);

            num1 = num2;
            num2 = num3;
        }
        System.out.println(fibonacci(9));

            int n = 10;
            int[] arr = new int[n];
//            fibonacci for문으로만 (배열활용)
//            메모이제잉션(기억알고리즘  - DP)
//            단계마다 계산결과값이 필요할때 메모이제이션 활용
        arr[0] =1;
        arr[1] =1;
        for (int i = 2; i <n ; i++) {
            arr[1] =arr[i-1] + arr[i-2];
            System.out.println(arr[n-1]);
        }
    }

//                피보나치 재귀함수
    static int fibonacci(int n){
        if(n<=1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }



//메서드가 자기자신을 호출하는 메서드를 재귀함수라고하고 , 이러한 호출방식을 재귀호출이라고 한다.

    static int add_acc(int n) {
        if (n == 1) {
            return 1;
        }
        return n + add_acc(n - 1);
    }

    //        누적곱하기값 : 팩토리얼 ,

    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * add_acc(n - 1);
    }
}


