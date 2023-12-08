//import java.math.BigDecimal;
//import java.sql.SQLOutput;
//
//public class C02Variable {
//        public static void main(String[] args) {
////               byte로 썻을때 -128~127까지의 표현이 가능하고, 그 이상을 세팅할때 오버/언더 플로우 발생.
//                byte num1 = 127;
//                byte num2 = -128;
//                num1++;
//                num2--;
//                System.out.println(num1);
//                System.out.println(num2);
//
//
////      실수 : float, double(기본)
//                float f1 = 1.123456789f;
//                double b1 = 1.123456789;
//                System.out.println("f1 : " + f1);
//                System.out.println("b1 : " + b1);
////               부동소수점 오차 테스트
////                double double_uum = 0.1;
////                미세오차는 조정되어 정상적으로 출력
////                        System.out.println(double_uum);
////               반복적인 연산시 오차가 확대되어 오차확인가능
////                for(int i=0;i<100;i++){
////                        System.out.println(i);
////                }
////                double double_uum = 0.1;
////                for(int i=0; i<1000; i++){
////                        System.out.println(i);
//////              반복적인 연산시 오차가 확대되어 오차 확인가능
////                double total = 0;
////                for (int i = 0; i < 100; i++) {
////                        total = total + 0.1 * 10;
////                }
////                System.out.println(total/10);
////
////                double d1 = 1.03;
////                double d2 = 0.42;
////                System.out.println(d1-d2);
////////
//////                저장할때는 문자열 -> 연산할때는 정수로 변환 -> 최종결과는 실수로 반환
////                BigDecimal myBig = new BigDecimal("1.03");
////                BigDecimal myBig2 = new BigDecimal("0.42");
//
////                문자 : char
//
////                        char my_char = '가';
////                        System.out.println(my_char);
////
//////                      boolean : true(1) or false(0)
////                boolean my_bool = true;
////                System.out.println(my_bool);
////                if(my_bool==true){
////                        System.out.println("조건식이 참입니다.");
////
////                        int bool_num1 = 20;
////                        int bool_num2 = 10;
////                        if(bool_num1 > bool_num2){
////                                System.out.println("조건식이 참입니다");
////                        }
//
////                      묵시적 타입변환
//                char ch1 = 'a';
//                int ch1_num = ch1;
//                System.out.println(ch1_num);
//
////                char형 알파벳 비교를 위한 묵시적 타입변환 일어난다.
//                System.out.println('A' > 'a');
//
//                int my_int1 = 10;
//                double my_double1 = my_int1;
//                System.out.println(my_double1);
//
////
////                int my_int1 = 10;
////                double my_double1 = my_int1;
////                System.out.println(my_double1);
//// 에러 발생 : my_int1 = my_double1;
////                double -> int 명시적 타입은 가능 : 소수점값 손실발생 가능성이 있다.
////                my_int1 = (int)my_double1;
////        double my_double2 = 7.2f;
////                System.out.println(my_double2);
////
////
////
//////      명시적 타입변환
////                char my_char2 ='b';
////                int char_num =(int)my_char2;
////       int a 가 1 int b가 4일때 둘을 나눈값을 int에 답아 출력 . double에 담아 출력
//
//                int a = 1;
//                int b = 4;
//                int c = a / b;
//                double d = a / b;
//
//                System.out.println(c);
//                System.out.println(d);
//                double d2 = (double)a/(double)b;
//                System.out.println(d2);
//
////              변수와 상수
////              선언과 동시에 초기화
//                int a1 = 10;
////              변수값 변경
//                a1 = 20;
////              선언만 한 뒤에 나중에 초기화
//                int a2; //지역변수는 선언만 됐을때는 값이 0으로 초기화되지 않으나 객체로 선언될때는 0으로 초기화 된다
//////                System.out.println(a2);
//                a2 = 20;
////                  객체로 만들때는 0으로 초기화
//int[] arr =nsw int[5];
//
////                상수는 값의 재할당이 불가능
//                final int AGES = 20 ;
////                상수는 값의 변경이 불가능AGES = 30;  (파이널붙음)
////                상수는 선언만 한 뒤에 나중에 초기화 하는 방식이 java8이전에는 안됏엇지만, 이후 가능해짐
//                final int AGES2;
//                AGES2 = 20;

//              비트연산자 : : & , 각자리수가 모두 1일경우만 1
//               0000101             // 0000110
//                ^ : 대응되는 비트가 서로 다르면 1을 반환함
//                int n1 = 5; int n2 =6;
//                  System.out.println(n1 & n2 ); //4 =>0000100
////                비트연산자 : : & , 각자리수가 하나라도 1일경우만 1
////              System.out.println(n2 | n2); // 7 =>0000111
//                비트연산자 : : & , 각자리수가 일치하지 않는 경우에 1
//                System.out.println(n1 ^ n2); // 3 =>0000011
//                ~ : not연산 , 각자리마다 반대의 숫자 반환
//                System.out.println(~ n1);// 첫째 자리가 음/양인데, 음으로 변환//
////                        시프트연산자 : <<,>> => 곱셈과  나눗셈의 효과 발생
//
//                System.out.println(n1 << 1);

//                int a 13; //00001101
//                int b= 9; //00001011
//
//                while (b!= 0){
//                        int same_index = a & b; // and 연산으로 구한 carry 생성
//                        a = a ^ b //XOR 연산으로 구한 비트값 a에 할당
//                        b = same_index << 1
////              첫번째 반ㅂ
//                                -
