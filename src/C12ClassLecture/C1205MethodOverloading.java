package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;

public class C1205MethodOverloading {
    public static void main(String[] args) {
        C1205MethodOverloading mto = new C1205MethodOverloading();
//        메서드 오버로딩을 통해 같은 메서드명 재활용
        System.out.println(mto.sum(10, 20));
        System.out.println(mto.sum(10, 20));
        System.out.println(mto.sum(10.0, 20.0));
//        제네릭을 통해 타입재활용
        List<Integer> myList = new ArrayList<>();
    }

    double sum(double a, double b) {
        return a + b;
    }

        int sum(int a, int b){
            return a + b;
        }

        int sum ( int a, int b, int c) {
            return a + b + c;
        }


        }










