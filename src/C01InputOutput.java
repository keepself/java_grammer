import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class C01InputOutput {
    public static void main(String[] args) {

//        출력
//        int a = 20;
//        print 는 출력후 줄바꿈 없음. println은 출력후 줄바꿈
//        System.out.print(a);
//        String myString = "hello world";
//        문자열과 숫자를 합하면 문자가 된다-5
//        System.out.println(myString + a);    }
//          숫자와 숫자를 더하면 더하기 () -> 연산된다
                System.out.println(10+20);

        //        입력 : System.in(키보드입력) + Scanner(입력을위한클래스)
        Scanner myScan = new Scanner(System.in);
//        System.out.println("아무 문자열을 입력해주세요");
////          nextLine은 입력 받은 데이터를 한 줄 읽어서, String으로 리턴
//        String inputs = myScan.nextLine();
//        System.out.println("사용자가 입력한 문자열 : " + inputs);
//
////          nextLine은 입력 받은 데이터를 한 줄 읽어서, int으로 리턴
//        int inputs_int = myScan.nextInt();
//        System.out.println("사용자가 입력한 숫자는 : " + inputs_int);

//        System.out.println("더하기할 두 숫자를 입력해주세요");
//        int a1 = myScan.nextInt();
//        int a2 = myScan.nextInt();
//        int sum = a1+a2;
//        System.out.println("두 수를 더한 값은 "+(a1+a2)+"입니다. ");

        System.out.println("실수를 입력해주세요");
        double input_double = myScan.nextDouble();
        System.out.println("입력하실 실수는 : " + input_double);

        System.out.println("true 또는 false를 입력해주세요");
        boolean input_boolean = myScan.nextBoolean();
        System.out.println("입력하신 참/거짓은 : "+input_boolean);

//        입출력 시스템 메모리 해제
        myScan.close();


    }
}
