package C15AnonymousLamda;

import java.awt.font.ShapeGraphicAttribute;
import java.util.*;

public class C1504ComparableComparator {
    public static void main(String[] args) {

        System.out.println("main 의 쓰레드 입니다.");

        Thread t1 = new Thread(() -> System.out.println("새로 만든 쓰레드 입니다."));
        t1.start();
//똑같음 람다처리//= new Thread(() -> System.out.println("새로 만든 쓰레드 입니다.")).start();

//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공 : Comparable, Comparatorr
//        Comparable 인터페이스에는 compareTo메서드가 선언, 그리고 java의 많은 클래스에서 구현하고 있음
//        Comparator 인터페이스에는 compare메서드가 선언0.

//        두 문자열의 각 문자를 앞에서부터 순차적으로 비교
//        무나졍릐 자릿수의 차이가 발생할때, 그문자의 유니코드 값의 차이를 ㄹ반환


//Student객체 정렬
//        List<Student> studentList = new ArrayList<>();
//
//        studentList.add(new Student("a", 5));
//        studentList.add(new Student("b", 4));
//        studentList.add(new Student("c", 3));
//        studentList.add(new Student("d", 2));
//        studentList.add(new Student("e", 1));
//
//
//        for (int i = 0; i < studentList.size(); i++) {
//            System.out.println(studentList.get(i).getAge());
//            System.out.println(studentList.get(i).getName());

    }
//      방법 : Comparable인터페이스 implements 후 compareTo메서드 구현


//      방법 : Comparator를 익명객체 방식으로 활용하여 정렬 , 매개변수 2개
//        나이로
//        studentList.sort((o1, o2) -> o1.getAge()- o2.getAge());
//        System.out.println(studentList);

//     이름으로 정렬


//        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//        System.out.println(studentList);
//      글자길이수로 정렬
//        String[] stArr = {"hello", "java", "C++", "world2"};
//        Arrays.sort(stArr, new Comparator<>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();

//                Queue<String> myQue = new PriorityQueue<>((o1,o2) -> o2.length() - o1.length());
//            }
//        });

//쓰레드 구현방식 :쓰레드상속, Runnalbe방식


}
//        }


class Student implements Comparable<Student> {
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //  조상클래스인 Object클래스의 toString을 overriding하여 객체호출시 자동으로 toString메서드 호출
    @Override
    public String toString() {
        return "이름은 " + this.name + "나이는 " + this.age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
