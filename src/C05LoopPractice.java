public class C05LoopPractice {
    public static void main(String[] args) {
        //짝수의 합 계산하기
//        1~20 까지 짝수의합 출력
//        int sum = 0;
//        for (int i = 1; i <= 20; i++) {
//            if ((i % 2) == 0) {
//                sum += i;
////                sum = sum +i;
//            }
//        }
//        System.out.println(sum);

//// 숫자뒤집기
//        int num = 1234;
//        int result = 0;
//        while (true) {
//            int temp = num % 10;
////            result = result * 10 + temp;
////            num /= 10;
////            if (num == 0) {
////                break;
////            }
////            System.out.println(result);
////        }
////        System.out.println(result);
////최대공약수 찾기
//            int a = 24; int b = 36;
//            int num = a > b ? b : a;
//            int maxNum = 0;
//            for(int i = 1; i<=num; i++){
//                if(a % i ==0 && b % i ==0){
//                    maxNum = i;
//                }
//    }
//        int minNum = a/maxNum * b/maxNum * maxNum;
//        System.out.println(maxNum);
//
////        라벨문 : 첫번째 for문 0~4까지, 2번째 for 0~4,
//
//        loop1:
//        for(int i=0; i<5; i++) {
//            loop2:
//            for (int j = 0; j < 5; j++) {
//                System.out.println("hello world");
//                if (j == 2) {
//                    break loop1; //break; 하는것과 비교
//                }
//// 라벨문 활용1
//                int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9}, {10, 11, 12, 13}};
//                int target = 11;
//                loop1:
//            {for(int i = 0; i<matrix.length; i++);
//
//                }
//                  { for(int j=0; j<matrix[i].length; j++);
//
//                    }
//        { if(matrix[i][j]) == target)
//                System.out.println(i + ", " + j + "번째에 있습니다.");
//                break l1;

        loop1:
        for (int i = 1; i <= 20; i++) {
            int count = 0;
            System.out.println(i + "의 약수 ");
            loop2:
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {

                    System.out.println(j);
                    count++;
                }
            }
            System.out.println("약수의 갯수 : "+ count);
        }







    }
}




































