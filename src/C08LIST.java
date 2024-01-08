import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class C08LIST {
    public static void main(String[] args) {

//        List<Integer> myList = new ArrayList();
//        myList.add(10);
//        myList.add(20);
////        add(int index int element) : 중간에 값 삽인은 기본적으로 성능저하
//
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(30);
//        myList2.add(40);
//        myList2.add(50);
//
////  addALL(Collection객체) : 특정 리스트의 요소를 모두 ㅁdd
//        myList.addAll(myList2);
//        System.out.println(myList);
//
////        get(int index) : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));
//
////        for문을 돌려 전체출력.
////        size() : 리스트의 개수 반환
//        System.out.println(myList);
//        for (int i = 0; i < 5; i++) {
//             myList.get(i);
//
//        }
////
////        for (int i = 0; i < myList.size(); i++) {
////            myList.get(i);
////
////        }
////          remove : 요소삭제
//
////          remove는 value삭제, index를 통한 삭제
//
////          remove 를 통한 index삭제 : 0번째
////        myList.remove(0);
////        System.out.println(myList);
//
////        객체를 통한 삭제 : Integer.valueof
////        myList.remove(Integer.valueOf(15));
////        System.out.println(myList);
//
//
////        set(int index, E element) : index자리에 값 변경
////        마지막자리값: 100으로 세팅 출력
//        myList.set(myList.size()-1, 100);
//        System.out.println(myList);
//
//
////      contains(E element) : 특정값이 있는지 없는 boolean 리턴
//        System.out.println(myList.contains(30));
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        index0f : 몇번째 index에 위치한지 return, 요소가 없으면 -1 return
//        같은 숫자가 있으면 첫번재 index값 return
//        System.out.println(myList.indexOf(20));
//      전체삭제
//      isEmpty : 값이 비었는지, 안비었는지
//        System.out.println(myList.isEmpty());
//        myList.clear();
//        System.out.println(myList);
//        System.out.println(myList.isEmpty());;

//       리스트 출력

//     List<int[]> myList = new ArrayList<>();
//     myList.add(new int[]{1,2,3});
//     myList.add(new int[2]);
//     myList.add(new int[3]);
//     myList.get(1)[0] = 10;
//     myList.get(1)[1] = 20;
//
//     for(int[] a : myList){
//         System.out.println(a);
//     }
//
//
//
//
//     for (int i = 0; i < myList.size(); i++) {
//            System.out.println(Arrays.toString(myList.get(i)));
//        }

//        List<List<Integer>> myList = new ArrayList<>();
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        for (i = 0;<myList.size();
//        i++)
//        myList.get(i).add(10);
//
////
//        List<int[]> myList = new ArrayList<>();
////
////        myList.add(new int[]{1, 2, 3});
////        myList.add(new int[]{10, 20, 30});
////        myList.add(new int[]{100, 200, 300});
////        for (int[] a : myList) {
////            System.out.println(Arrays.toString(a));
//
//
////       위 list 값 1,2,3 10 ,20 ,30  100,200, 300
//        int value = 1;
//        for (int i = 0; i < myList.size(); i++) {
//            for (int j = 0; j < myList.get(i).length; j++) {
//                myList.get(i)[j] = (j + 1) * value;
//            }
//            value *= 10;

//        List<Integer> myList = new ArrayList<>(asList(5, 3, 2, 1, 5));
////        리스트정렬1 : Collections.sort()
//            Collections.sort(myList);
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//
////        리스트정렬2 : 객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);
//
////       1.String배열을 list로 변경
//
//
//        String[] stArr ={ "java", "spring" ,"django"};
////        1-1.Arrays.asList
//        List<String> stList1 = new ArrayList<>(Arrays,asList(stArr));
////        1-2 for문담기
//            List<String> stList2 = new ArrayList();
//        for(String a : stArr) {
//            stList2.add(a);
//        }
//
////        1-3.streamApi : 참고만
//        List<String> stList3 = Arrays.stream(stArr).collect(Collectors.toList());
////
////
////        2.int배열을 list로 변환
//                int[] intArr = {10,20,30,40};
//                1-1.Arrays.asList사용불가
//                1-2.for문담기 사용가능
//                1-3 streamApi 사용가능


    //        3.String리스트를 String배열로 변환

        List<String> stList = new ArrayList<>();
        stList.add("LEE");
        stList.add("CHANG");
        stList.add("SEON");
        String[] stARR = new String[ stList.size()];
        for (int i = 0; i < stARR.length; i++) {
            stARR [i] =  stList.get(i);
            System.out.println(stList);
        }
//  3-2)streamAPI : 참고만
//        String[] stArr2 = stList.stream().toArray(a->new String[a]);

//  4.int리스트를 int배열로 변환
//  4-1 for문으로 변환
//  4-2 streamAPI로 변환

//   두개뽑아서 더하기 : 리스트

//        int[] numbers ={2,1,3,4,1}; //2,3,4,5,6,7
//        List <Integer> myList = new ArrayList<>();
//        for (int i = 0; i < numbers.length-1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//               if(!myList.contains(numbers[i]+numbers[j]))
//                myList.add(numbers[i] + numbers[j]);
//
//
//
//            }
//
//            Collections.sort(myList);
//            List<Integer> new_list = new ArrayList<>();
//            for (int a : myList) {
//                new_list.add(a);
//            }
//            System.out.println(new_list);

//            n의 배숫고르기
//        int n;
//            int[] numlist = {4,5,6,7,8,9,10,11,12};
//                    List<Integer> myList = new ArrayList<>();
//            for(int a : numlist) {
//                if ((a & n) == 0) {
//                    myList.add(a);
//                }
//            }
//            int[] answer = new int [myList.size()];
//            for (int i=0; i<answer.length; i++) {
//                answer[i] = myList.get(i);
//            }
//            return answer;


        }

        }
























