package C15AnonymousLamda;

public class C1503LamdaExpresion {
    public static void main(String[] args) {
//        실행문이 1개일때는 return 생략가능
//        실행문 2개일때는 return 필요
//        매개변수를 순서로 인지하므로, 타입을 지정해줄필요는 없다.

        LambdaInterface zz = (a, b, c) -> {

            String answer = a +b;
            return a + b;
        };
    }
}


interface LambdaInterface{

    String makeString(String a, String b, int c);

}