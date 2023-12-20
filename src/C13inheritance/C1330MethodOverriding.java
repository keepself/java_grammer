package C13inheritance;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1330MethodOverriding {
    public static void main(String[] args) {
//        상속관계일때 부모클래스타입을 자식클래스객체의 타입으로 지정가능
//        Animal클래스에 정의된 메서드만 사용가능하도록 제약이 발생.
        Animal doggy = new Dog();
        Animal Caat  = new Cat();

       doggy.sound();
       Caat.sound();


       List<String> myList = new LinkedList<>();
        Queue<String> myList1 = new LinkedList<>();





    }
}
class Animal {
    void sound() {
        System.out.println("동물은 소리를 냅니다.");

    }
}
class Dog extends Animal {
    void sound(){
        System.out.println("개 : 멍멍");
    }
}
class Cat extends  Animal{

    void sound(){
        System.out.println("고냥이 : 야옹");
    }
}