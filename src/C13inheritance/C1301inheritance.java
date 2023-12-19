package C13inheritance;

//extends 키워드를 통해 상속관계를 표현

public class C1301inheritance extends Parents {
    int c =30;
    public static void main(String[] args) {
        C1301inheritance ih = new C1301inheritance();
        System.out.println(ih.c);
        System.out.println(ih.a);
//   자식클래스라도 private변수는 상속 및 접근이 불가
//        System.out.println(ih.b);


    }


    void childMethod() {
        System.out.println("자식 클래스입니다.");
    }

        void parentMethod(){
            System.out.println("부모클래스가 아니라 자식클래스입니다.");


    }
}
// 부모클래스의 메서드명을 동일하게 사용함으로서 메소드 오버라이딩(덮어쓰기)헸다.

class Parents {
    int a = 10;
    private int b = 20;

    void parentMethod() {
        System.out.println("부모클래스입니다.");


    }
}