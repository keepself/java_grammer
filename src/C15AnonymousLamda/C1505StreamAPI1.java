package C15AnonymousLamda;

import com.sun.source.tree.UsesTree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C1505StreamAPI1 {
    public static void main(String[] args) throws Throwable {

//        int[] arr = {20, 10, 4, 12};
//       전통적인 방식의 데이터 접근방식
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println((arr[i]));
//        }

//        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
//        java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> streamApi
//        foreach : 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a));
//
//        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));


//        스트림의 생성
//        String[] stArr = {"HTML", "CSS", "JSVA", "PYTHON"};
//        stream<객체> : 제네릭타입으로 stream객체가 생성
//        Stream<String> stStream = Arrays.stream(stArr);

//        int[] intArr = {10,20,30,40,50};
//        IntStream intStream = Arrays.stream(intArr);
//        int[] intArr2 = intStream.filter(a ->a>20).toArray();
//        참조변수의 스트림변환의 경우 제네릭의 타입소거 문제 발생.
//        제네릭의 타입소거란 java버전의 호환성을 위해 제네릭 타입을 런타임시점에 제거하는 것을 의미.
//        String[] stArr2 = stStream.filter(a -> a.length()<=4).toArray(a->new String[a]);
//            메소드 참조 방식으로 표현한는 것이 더 일반적
//            메소드 참조 방식 : 클래스 ::메서드
//        String[] stArr2 = stStream.filter(a -> a.length() <= 4).toArray(String[]::new); //new는 메서드 참조방식
//        System.out.println(Arrays.toString(stArr2));

//      stream 중개연산 : filter, map, sorted, distinct

//        distinct : 중복제거 후 스트림반환
//        int[] intArr = {10,10,30,30,50};
////        중복제거후 총합 반환
//        int answer = Arrays.stream(intArr).distinct().sum();
//
//        System.out.println(answer);
//
//        String[] stArr3 = {"java", "java", "python", "C++"};
////        중복제거후 새로운 배열 생성
//        String[] stArr4 = Arrays.stream(stArr3).distinct().toArray(String[]::new);
//        System.out.println(Arrays.toString(stArr4));
////        중복제거하고 길이가 3개 이하인것으로 제한하고, 남은배열의 길이의 총합.
////        mapToInt를 통해 IntStream으로 변환
//      IntStream myStream = Arrays.stream(stArr).distinct().filter(a ->a.length()<=3).mapToInt(a->a.length());
//
//      sorted : 정렬된 스트림반환
//        int[] arr = {4,1,2,7,5,7};
////      내림차순 정렬된 숫자 신규 배열 반환
//        int[] new_arr = Arrays.stream(arr).sorted().toArray();
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(6,1,2,3,1,6));
////        collect(구츠체적인 컬렉션객체명시)
//        List<Integer> myList2 = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        List<String> stList = new ArrayList<>(Arrays.asList("java", "python", "C++", "javascript"));
////        streamAPI를 사용해서 문자열의 길이 4개 이상인 , 문자열의 길이를  기준으로 정렬후 신규LIST생성
//
//        List<String> stList2 = new ArrayList<>((Arrays.asList("aaaa","bbbbb","cccccc","ddddd","aaaa","bbbbb")));
//        List<String> mylist = stList2.stream()
//                .filter(a ->a.length()<=4).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(stList2);
////        List<String> stList = stList2.stream()
////                .filter(a ->a.length()<=4).sorted(((o1, o2) -> o2.length()-o1.length()).collect(Collectors.toList());
//
////        map(a->a
//                int[] arr_plus10 ={10,20,20,30,40,};
//                int[] arr_plus11 =Arrays.stream(arr).map(a->a+10).toArray();
//
////                arr에서 짝수만 골라서 해당 수의 제곱의 총합을 구하라. sum()
//               int arr_zzak =Arrays.stream(arr).filter(a-> a%2==0).map(a->a*a).sum();
//        System.out.println(arr_zzak);


//        reduce : 누적연산
//      스트림소모 : forEach, reduce
//        int[] arr =  {10,20,30,40};
//        Arrays.stream(arr).forEach(System.out::println);
//
////        String a = null;
//        System.out.println(a.length());
//        Optional<String> myOptional = Optional.ofNullable("hello");
//        if(myOptional.isPresent())
//                myOptional.get().length();{
//            System.out.println(myOptional.get().length());
//        }


//        초기값을 지정하지 않으면 Optional객체 return
//        Optional객체 : 값이 있을수도 있고, 없을수도있다는 것을 명시한 타입(java8이후 추가)
//        int result = Arrays.stream(arr).reduce(1,(a,b) -> a*b);
//        int result2 = Arrays.stream(arr).reduce((a, b) -> a+b);
//
        String[] stArr = {"hello", "java", "world"};
        String result = Arrays.stream(stArr).reduce((a, b) -> a + ", " + b).get();
        System.out.println(stArr);


        Optional<String> result2 = Arrays.stream(stArr).reduce((a, b) -> a + ", " + b);
        if (result2.isPresent()) {
            System.out.println(result2.get());
        }

//        최소/최대/평균/총합 : min/max/average/sum
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(myList.stream().mapToInt(x -> x).min().getAsInt());
        System.out.println(myList.stream().mapToInt(x -> x).max().getAsInt());
        System.out.println(myList.stream().mapToInt(x -> x).average().getAsDouble());
        System.out.println(myList.stream().mapToInt(x -> x).sum());
        System.out.println(myList.stream().count());
//               .filter(a ->a.length()<=4).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(new Student("kim", 25));
        myStudents.add(new Student("lee", 32));
        myStudents.add(new Student("park", 31));
        myStudents.add(new Student("choi", 28));
        myStudents.add(new Student("um", 26));


        Student s1 = myStudents.stream().filter(a -> a.getAge() > 30).findFirst().get();
        System.out.println(myStudents.stream().mapToInt(x -> x.getAge()).min().getAsInt());
        System.out.println(myStudents.stream().mapToInt(x -> x.getAge()).average().getAsDouble());
        System.out.println(myStudents.stream()
                .filter(x -> x.getAge() <= 39 && x.getAge() > 29)
                .count()
        );
        System.out.println(myStudents.stream()
                .filter(x -> x.getAge() < 30)
                .findFirst()
                .get()
                .getName()
        );

//      기존의 java의 null

        String st = null;
        if (st != null) {
            System.out.println(st.compareTo("abc"));
        }
//        java8이훙에 나온 Optional객체를 통해 특정 객체에 값이 없을지도 모른다는것을 명시적으로 표현
//        Optional객체에 반값을 명시적으로 넣는 방법 : Optional.empty
        Optional<String> opt1 = Optional.empty();
//        반값인지 아닌지 check하는 메서드 : isPresent()
        if(opt1.isPresent()){
            System.out.println(opt1.get().compareTo("abc"));
        }else{
            System.out.println("값이 없습니다.");
        }

//        optional 객체생성
        Optional<String> opt2 = Optional.ofNullable("hello");// null있을수도 있음을 의미.

//        orElseh관련 메서드 사용하여 ㅇnull/반갑처리
//        orElse, orElsGet, orElseThrow()
//        orElse(): 값이 잇으면 해당값 return 없으면 default 지정값 return

        System.out.println(opt1.orElse("").compareTo("abc"));
//        orElseGet(); 값이있으면 해당값 return 없으면 람다함수 또는 메서드 참조 실행
        System.out.println(opt1.orElseGet(()->new String()).compareTo("abc"));
//        opElseThrow() : 값이 있으면 해당값 return 없으면 지정된 예외 강제 발생
       opt1.get();
        int result4 = opt1.orElseThrow(()-> new NoSuchElementException("객체에 값이 없습니다.")).compareTo("abc");
//        System.out.println(result);


//        Optionalnt , OptionalDouble
//        Optional oi =new ArrayList<>(Arrays.asList(1,2,3,4)).stream().max();
//        if(oi.isPresent()) {
//        }else{
//        }
////        orelse 등의 방법 활용
//        System.out.println(oi.orElseThrow(()->new NoSuchElementException("no value")));
//
//
//





    }
}
