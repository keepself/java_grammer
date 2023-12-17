import java.util.*;

public class C10SET {
    public static void main(String[] args) {

//        중복없고 , 순서없다 = 중복제거할때 Set사용
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("0");
//        System.out.println(mySet);

//        반학생들이 좋아하는 운동종목 : list
//        List<String> myList = new ArrayList();
//        myList.add("tennis");
//        myList.add("soccer");
//        myList.add("soccer");
//        myList.add("soccer");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("basketball");
//        myList.add("soccer");
// list를 인자값으로 받아 초기값 세팅 가능
//        Set<String> mySet = new HashSet<>(myList);
//        System.out.println(mySet.size());

//  배열을 인자값으로 받아 set 초기값 세팅
//        String[] myArr = {"java","java","python","python", "C++"};
//        Set<String> mySet = new HashSet<>(Arrays.asList(myArr));
//        mySet.remove("java");
//        System.out.println(mySet);
//
//        int[] myArrInt = {1,2,3,4,4,3,2};
//        Set<Integer> mySetInt = new HashSet<>();
//        for (int a : myArrInt) {
//            mySetInt.add(a);
//        }
//        System.out.println(mySetInt);
//
//        }

        Set<String> mySet1 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
        Set<String> mySet2 = new HashSet<>(Arrays.asList("java", "html", "css"));


//            교집합 : retainAll
//        Set<String> temp1 = new HashSet<>(mySet1);
//        temp1.retainAll(mySet2);
//        System.out.println(temp1);
//            합집합 : addAll
//        Set<String> temp2 = new HashSet<>(mySet1);
//        temp2.addAll(mySet2);
//        System.out.println(temp2);



//            차집합 : removeAll
//        Set<String> temp3 = new HashSet<>(mySet1);
//        temp3.removeAll(mySet2);
//        System.out.println(temp3);



//        순서가 없어서 enhanced for 문,iterator 사용


//        LinkedHashSet, TreeSet
        Set<String> mySet = new TreeSet<>();
        mySet.add("hello5");
        mySet.add("hello4");
        mySet.add("hello3");
        mySet.add("hello2");
        mySet.add("hello1");
        System.out.println(mySet);

        //두개 뽑아서 더하기
//        int[] numbers = {2,1,3,4,1};
//        Set<Integer> MyTreeSet = new TreeSet<>();
//        for(int i=0; i<numbers.length-1; i++){
//            for(int j=i+1; j<numbers.length; j++){
//                myTreeSet.add(numbers[i]+numbers[j]);
//            }
//        }
//        int[] answer = new int [myTreeSet.size()];
//        int count = 0;
//        for(int a : myTreeSet){
//            answer[count] =a;
//            count++;
//        }
//        System.out.println(myTreeSet);






    }
}

