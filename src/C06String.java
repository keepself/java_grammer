import com.sun.source.tree.ParameterizedTypeTree;

import java.sql.SQLOutput;
import java.sql.Wrapper;
import java.util.*;
import java.util.regex.Pattern;


public class C06String {
    public static void main(String[] args) {
//        참조자료형 : 기본 자료형을 제외한 모든 자료형
//        Wrapper class 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스
//          int와  integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
//  오토언방식
//        int c = b;
//  언박싱
//        int d = b.intValue();
//       언박싱 : Integer -> int 형변환

//        오토 박싱
//        Integer e = a;
//    박싱
//        Integer f = Integer.valueOf(a);

//        String과 int의 형변환
        int a = 10;
        String st_a = Integer.toString(a);
        String st_a2 = String.valueOf((a));
        int c = Integer.parseInt(st_a); //10


//        참조자료형에 원시자료형을 담을 때는 wrapper클래스를 써야한다.     ex)컬렉션프레임워크(LSIT
//        List<Integer> list_a = new ArrayList<>();
//
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a);


//        String mySt1 = new String("hello");
//        String mySt2 = new String("hello");
//        String mySt3 = "hello";
//        String mySt4 = "hello";
//        String mySt5 = mySt1;
//        System.out.println(mySt1 == mySt2);
//        System.out.println(mySt1 == mySt3);
//        System.out.println(mySt3 == mySt4);
//        System.out.println(mySt1 == mySt5);
//
//
//        List<String> myList = null;
//        List<String> myList2 = myList;
//        myList2.add("hello mylist2");
//        myList.add("hello mysList1");
//        System.out.println(myList2);
//
//        System.out.println(mySt1.equals((mySt2)));
//        System.out.println(mySt1.equals((mySt3)));
//        System.out.println(mySt3.equals((mySt4)));
//        System.out.println(mySt1.equals((mySt5)));
//

////        문자열의 길이는 : length();
//        String mySt = "hello";
//        System.out.println(mySt.length())th3  ;
//        indexOf : 특정문자열의 위치 반환, 가장먼저 나오는 문자열의 위치 반환
//        String mySt2 = "hello java";
//        int myst2_index = mySt2.indexOf("java");
//        System.out.println(myst2_index);
//
//
//
////        contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        System.out.println(mySt2.contains("hello"));
//
////        charAt 무낮열에서 특정 위치(index)의 문자(char)를 리턴
//        String a = "abscdefghj";
//        char myChar = a.charAt(1);
//        System.out.println(myChar);

//        반목문, charAt, length를 활용한 st안에 문자a의 개수

//        String st = "abcdabcdadj";
//        for (int i = 0; i < st.length(); i++) {
//            if (st.charAt(i) == 'a') {
//                char myChar = st.charAt(2);
//                System.out.println();
//
//            }
//        substring(a,b) : a이상 b미만의 index를 자른다.
//            String st1 = "hello world";


//          touppercase : 대문자, tolowercase : 소문자

//        String a = "hello";
//        a += "world";
//        System.out.println(a);
//
////        char -> String 형변환
//
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//
//        String str = "01abc123한글123";


        //            알파벳만 빼고 문자를 str2에 새롭게 담기
//        String str2 = "";
//        for (int i = 0; i < str.length(); i++) {
//            char temp = str.charAt(i);
//            if (temp < 'a' || temp > 'z') {
//                str2 += Character.toString((temp));
//            }
//
//
//        }
//        System.out.println(str2);

        //특정 문자 제거하기
//        프로그래머스


//        replace(a,b) : a 문자를 b문자로 대체

//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);
//
//        replaceAll(a,b)

//        String st3 = st1.replaceAll("world","python");
//        System.out.println(st3);

//        String str = "01abc123한글123";
////        [a-z] : 소문자 알파벳
//        String str2_hanguel = str.replaceAll("[a-z]", "");
//        System.out.println((str2_hanguel));
//// [가-힣] : 한글
//        String str3 = str.replaceAll("[가-힣]", "");
//        System.out.println(str3);
////        [0-9] : 숫자
//        String str4 = str.replaceAll("[0-9]", "");
//        System.out.println(str4);
////        [A-Za-z] 알파벳 전체
//        String str5 = str.replaceAll("[A-Za-z0-9]", "");
//
////patternc클래스
//        boolean matcher = Pattern.matches("[a-z]", "helloworld");
//        System.out.println(matcher);

//        전화번호 검증
//        boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\{4}$", "010-1234-1234");


//        이메일 검증
//        \d:숫자, {}:연속으로
//        boolean matcher3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", "hello@naver.com");
//        System.out.println(matcher3);


//  split
//        String a = "a:b:c:d" ;
//        String[]stArr= a.split(":");
//        System.out.println(Arrays.toString(stArr));
//        String b= "a  b  c  d";
//        String[]stArr2= b. split("");
//        System.out.println(Arrays.toString(stArr2));
//        String[]stArr3= b. split("\\s+");
//        System.out.println(Arrays.toString(stArr3));

//        isEmpty와 null rnqns
//        String st1 = null;
//        String st2 = "";
//
//        System.out.println(st1==null);
//        System.out.println(st2==null);
//        System.out.println(st2.isEmpty());
//        NUllpointer Exception 예외 발생.
//        System.out.println(st1.isEmpty());
//
//
//        String[] arr = new String[5];
//        arr[0] = "hello";
//        arr[1] = "world";
//        for(int i =0; i<arr.length; i++){
//            System.out.println(arr[i].length());
//        }

//String.join("")


//        String[] 배열명 = {"a","b","c"};
//
//        String[] Arr = {"j","P","C"};
//        String arrSt = String.join("",Arr);
//        System.out.println(arrSt);

//        StringBuffer buf = new StringBuffer("hello");
//        buf.append("java") //마지막자리에 문자열 추가
//        buf.append("world")//마지막자리에 문자열 추가
//        String new_str = buf.toString();//새로운 String문자열로 변환


// StringBuffer 주요 메서드
//        append
//                append 메소드를 사용하여 계속해서 문자열 마지막에 추가대상 문자열을 추가
//                String 경우 +=를 통해 추가하는것처럼 보이나, 추가가 아닌 재선언
//        insert
//                insert 메소드는 특정 n번째 위치에 원하는 문자열을 삽입
//                sb.insert(5,"hello");
//        substring
//                string 자료형의 substring 메소드와 동일하게 사용
//        delete(int start, int end)
//                start부터 end만큼 삭제
//                그외대부분 메서드는 String 과 동일

        StringBuffer sb1 = new StringBuffer("hello");
        System.out.println(sb1);
        sb1.append(" world");
        System.out.println(sb1);
//        sb1.insert(0,"java ");
//        System.out.println(sb1);
        System.out.println(sb1.substring(5,11));
//        sb1.delete(6,10);
//        System.out.println(sb1);

//        성능 : String < StringBuffer < StringBuilder(스레드 safe X)
//        StringBuilder sb2 = new StringBuilder("hello");
//        sb2.append(" world");
//        System.out.println(sb2);

//    String my_string = "hello";
//    int n = 3; //hhheeelllooo
//        StringBuilder sb= new StringBuilder();
//        for(int i=0; i<my_string.length(); i++){
//            for(int j=0; j<n; j++){
//                sb.append(my_string.charAt(i));
//            }
//        }
//
//        class Solution {
//            public int solution(String A, String B) {
//                int answer = 0;
//                StringBuilder sb=new StringBuilder();
//                sb.insert("5","hello")








    }
}