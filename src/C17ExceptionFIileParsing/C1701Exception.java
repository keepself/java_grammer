package C17ExceptionFIileParsing;

import java.util.Scanner;

public class C1701Exception {
    public static void main(String[] args) throws IllegalAccessException {
//        ArithmeticException : 0으로 나눌때
        System.out.println("나눗셈 프로그램입니다. 숫자 10에 나눌 분모값을 입력해주세요");
        int num = 10;

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
//        예외가 발생할것으로 예상되는 코드에 try catch 감싸준다.
        try {
            System.out.println("10에 " + input + "을 나누면 ");
            System.out.println(num / input + "입니다.");
//         catch에는 try구문안에서 발생가능한 예외사항을 적어야 정상적으로 catch가 된다.
        } catch (IllegalArgumentException e) {
            System.out.println("정상적이지 않은 입력값을 넣었습니다.");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누시면 안됩니다.");
//            'e'안에 예외관련된 정보들이 들어있음
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("알수 없는 예외가 발생했습니다.");

        } finally {
//             반드시 실행되어야 하는 구문 삽입
        }
        System.out.println("감사합니다.");

//        throw와 throws예제
        String password = "1234";
        try {
            login(password);
        }catch (IllegalArgumentException e){
//            e.getMessage는 login메서드에서 throw new한 곳에서 넘어온 메세지.
            System.out.println(e.getMessage());
        }

    }
//     unchecked exception에서 throws를 하지 않더라도 예외는 호출한곳으로 전파
//    이때 throws를 하는 이유는 명시적으로 예외가 발생할수 있음을 알리는 것이 뿐.

//     checked exception은 예외처리가 강제되고 , 해당메서드에서 예외처리를 하든지 throws 통해 호출한곳에 위임
//    이때에 호출한 쪽에서는 예외처리가 강제된다.

    static void login(String password) throws IllegalArgumentException {
        if (password.length() < 10) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");

        }


    }
}
