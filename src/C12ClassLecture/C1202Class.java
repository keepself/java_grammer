package C12ClassLecture;

public class C1202Class {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(10,20));
        System.out.println(Calculator.sum(10));
    }
}



//내부클래스
class Calculator {
    static int total = 0;

    //    매개변수2개 받아서 더한값 return : sum
    static int sum(int a, int b) {
        return a + b;
    }

    static <MyCalInstance> int sum(int a) {
        total = a;
        return total;

////    A부서의 매출
//        MyCalInstance myCalA = new MyCalInstance();
//        myCalA.sum_acc(10);
//        myCalA.sum_acc(20);
//        myCalA.sum_acc(30);
////    B부서의 매출
//        MyCalInstance myCalB = new MyCalInstance();
//        myCalB.sum_acc(10);
//        myCalB.sum_acc(20);
//        myCalB.sum_acc(30);


        //    this 객체 그 자신을 의미
//    static이 붙어있는 변수는 클래스변수, static이 붙어있지 않으면 객체 변수





    }
}

