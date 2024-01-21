package AuthorException;

import java.util.HashMap;
import java.util.Map;

public class Minus {
    public static void main(String[] args) {
        int c = minus(4, 1);
//id값을전달해서 id값에 런치메뉴를 반환받는 method findbyid를만들자
        String value = findById(1);
        System.out.println(value);
    }


    public static int minus(int a, int b) {

        return a - b;
    }
        //a=key값
        public static String findById(int key) {

        String result = "";
        Map<Integer,String> lunch = new HashMap<>();
                lunch.put(1,"coffee");
                lunch.put(2,"coffee2");

            result=lunch.get(key);
        return result;
    }
}