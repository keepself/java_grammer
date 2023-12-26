package C16ETC;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;
import java.util.Arrays;

public class C1603GenericMain {

    public static void main(String[] args) {
        //      0번째와 1번째 자리 change
        String[] stArr = {"java", "python", "C++"};


        String temp = stArr[0];
        stArr[0] = stArr[1];
        stArr[1] = temp;


        //      1번째 2번째 자리 change
        Integer[] intArr = {1, 2, 3, 4, 5};

//        int
        Integer temp_int = intArr[0];
        intArr[0] = intArr[1];
        intArr[1] = temp_int;
        swap(intArr,1,2);

        GenericStudent<String> gs1 = new GenericStudent<>();
        gs1.setAge("123");
        System.out.println(gs1.getAge().getClass());

        GenericStudent<Integer> gs2 = new GenericStudent<>();
        gs2.setAge(123);
        System.out.println(gs2.getAge().getClass());



//        intswap(intArr, 1, 2);
//        System.out.println(Arrays.toString(intArr));


//        String[] 배열 change메서드 생성 : a번째 b번째


    }

    //        String[] 배열 change메서드 생성 : a번째 b번째
//    static void stSwap(String[] stArr, int a, int b) {
//        String temp = stArr[a];
//        stArr[a] = stArr[b];
//        stArr[b] = temp;
//    }
//
//    static void intswap(Integer[] stArr, int a, int b) {
//        Integer temp = stArr[a];
//        stArr[a] = stArr[b];
//        stArr[b] = temp;

//    }

//      제네릭 메서드 생성 : 반환타입 왼쪽에 <T> 선언
//      제네릭은 객체 타입이 들어와야함에 유의

    static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;





    }





}


class GenericStudent<T>{

   String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    T age;











}