package C13inheritance;

//Import java.util.* : util 하위의 모든 클래스/인터페이스 파일 import가능

import java.util.ArrayList;
import java.util.Comparator;


//final클래스는 상속 불가
//public class C1305Others extends FinalClass{
public class C1305Others {
    public static void main(String[] args) {
        C1305Animal myDog = new C1305Dog();
        myDog.makesound1();
        myDog.makesound2();

        {

        }
    }

    ;
}


final class FinalClass {

}

abstract class C1305Animal {
    abstract void makesound();

    abstract void makesound1();

    void makesound2() {
        System.out.println("makesound2");

    }
}

class C1305Dog extends C1305Animal {
    @Override
    void makesound() {

    }

    @Override
    void makesound1() {

    }
//    final메서드는 오버라이딩 불가
//
//    @Override
//    void makesound(){
//        System.out.println("멍멍");
//
//
//
//    }
}
