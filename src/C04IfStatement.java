import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04IfStatement {
    public static void main(String[] args) {
//        if문
//    if(조건식){
//        조건식의 결과가 참일 때 실행하고자 하는 ㅁ명령문;
//
//    }
//
//    if/else문
//
//    if(조건식) {
//        조건식의 결과가 참일 때 실행하고자 하는 명령문;
//        else
//             조건식의 결과가 거짓일 때 실행하고자 하는 명령문;
//
//        if 가 있다고 반드시 else 가 있어야 ㄷ하는 것은 아님
//비밀번호 => 1234
//스캐너를 써서 사용자의 input int 로 받아서
//만약에 비밀번호와 사용자의 input 일치하면 문이열렸습니다
//            일치하지 않으면 비밀번호가 틀렷습니다 출력

//도어락 if 문 예제
//
//        String answer = "0234";
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("비밀번호를 입력하세요");
//        String input = sc.nextLine();
//        if (answer == input) {
//            System.out.println("문이 열렸습니다.");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다");
//        }
//                묵시적 타입변환
//          a: 97 , A : 65,
////        사용자한테 알파벳을 아무거나 입력받고, 그 알파벳이 대문자인지 소문자인지 판별
////        "a" -> 'a'
//        sc.nextLine().charAt(0);

//        Scanner sc = new Scanner(System.in);
//        char input = sc.nextLine().charAt(0);
//        if(input >= 'a' && input<='z') {
//            System.out.println("소문자입니다.");
//        }else if(input >= 'A'  && input<='Z'){
//            System.out.println("대문자입니다.");
//        }else{
//            System.out.println("알파벳이 아닙니다");
////        }
////    버스카드 예제
//         내 돈 이 얼마있는지를 입력
//                버스요금 1500이다
//            돈이더 적으면 탑승불가, 돈이 더많으면 정상처리 출력.
//            도난여부 boolean 설정(입력x)

//        int myMoney = 10000;
//        boolean isStolen = false;
//        System.out.println("도난카드입니까? 예/아니오로 대답하시오");
//        Scanner sc = new Scanner(System.in);
//        if (sc.nextLine().equals("예")) {
//            isStolen = true;
//        }
//        if (myMoney < 1500 || isStolen == true) {
//            System.out.printf("탑승불가입니다.");
//        } else {
//            System.out.println("정상 탑승입니다.");
//        }
//        if (myMoney >= 1500 && isStolen == false) {
//            System.out.println("정상 탑승되었습니다.");
//        } else {
//            System.out.println("탑승불가입니다.");
//        }
//문법
//=결과값=조건식 ? 반환값1 : 반환값2
//물음표 앞의 조건식에 따라 결과값이 참 이면 반환값이
//삼항연상자
//
//        String answer = "0234";
//        System.out.println("비밀번호를 입력하세요");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String result = answer.equals(input) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다.";
//        System.out.println(result);
//// myMoney 10000
////        택시요금 10000
////            버스요금 3000
////            걷기 0원
////            킥보드 2000원
////
//        int myMoney = 10000;
//        int texiFee = 10000;
//        int busFee =3000;
//        int kickBoardFee =2000;
//
//        if(myMoney >= texiFee){
//            System.out.println("택시를 타시오");
//        } else if (myMoney >= kickBoardFee ){
//            System.out.println("킥보드를 타시오");
//        } else if (myMoney >= busFee) {
//            System.out.println("버스를 타시오");
//        } else {
//            System.out.println("걸어가시오");
//        }

//  int input =sc.nextint();
//        switch(input) {
//            case1:
//                    println("1번을 입력했습니다")
//                    break;// switch 문을 빠져나가는 문구
//            case 2: 조건 값이 값2일 때 실행하고자 하는 명령문;
//            break;
//            default:
//                조건 값이 어떠한 case 절에도 해당하지 않을 때 실행하고자 하는 명령문;
//                break;
//        }
//  switch 고객센터 출력 예제
//        원하시는 번호를 입력주세요
//                1. 대출 서비스 입니다. 2. 예금. 3.적금 0.상담사연결입니다. 그외: 잘못누르셨습니다.


        System.out.println("원하시는 서비스 번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println("대출 서비스 입니다.");
                break;

            case 2:
                System.out.println("예금입니다");
                break;


            case 3:
                System.out.println("적금입니다");
                break;


            case 0:
                System.out.println("상담사연결입니다.");
                break;

            default:
                System.out.println("잘못 누르셨습ㄴ다.");
                break;


//        }
//    a = 0; 0/9 => 10번
//    while (a>1){조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;
//        a --;
    }
//        조건식을 변화시키는 구문
//
//    while 사용해서 2~10까지 출력

        int a=2 ;





    }
}