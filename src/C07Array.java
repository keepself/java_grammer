import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        //표현식1
//        int[] int_arr1 = {1, 2, 3, 4};
//        //표현식2
//        int[] int_arr2 = new int[4];
//        int_arr2[0] = 1;
//        int_arr2[1] = 2;
//        int_arr2[2] = 3;
//        int_arr2[3] = 4;
//표현식 3
//        int[] int_arr = new int[]{1,2,3,4};
//표현식4는 불가 : java의 배열은 반드시 길이가 지정되어야함.
//        int[] int_arr4 = new int[];
//        String[] arr_st = new String[5];
//        for (int i = 0; i < arr_st.length; i++) {
//            if (arr_st[i].isEmpty()) {
//                System.out.println("비어있습니다.");
//            }
//        }


//  85,65,90 int 배열을 선언한뒤, 총합 , 평균값
//    int[] int_arr3 = {85,65,90};
//        sum+= arr3[];
//    for(int i=0; i<int_arr3.length; i++){
//        int sum = 0;
//    int averge = sum/arr3.length;
//    }

//    최댓값, 최소값
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//
//                for (int i = 0; i < arr.length; i++) {
//                    if (min > arr[i]) {
//                        min = arr[i];
//
//        배열의 순서바꾸기
//        int[] arr ={10,20};
//        int temp =arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;;
//        System.out.println(Arrays.toString(arr));


//        int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
//        int temp = 0;
//        for (int i = 1; i < arr2.length; i++) {
//            if(arr2[i-1]<arr2[i]){
//                temp = arr2[i-1];
//                arr2[i-1] = arr2[i];
//                arr2[i] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr2));
//

//        배열뒤집기
//        int[] arr={1,2,3,4,5};
////        신규배열 선언 : arr2
//        int[] arr2 = new int[arr.length];
//        int index = 0;
//        for (int i = arr.length; i > 0 ; i--) {
//            arr2[index] = arr[i-1];
//            index++;
//        }
//        System.out.println(Arrays.toString(arr2));

//        배열뒤집기2

//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr2 = new int[arr.length];
//
//        for (int i = 0; i < arr.length / 2; i++) {
//            int tmp2 = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = arr[i];
//            arr[i] = tmp2;
//        }
//        System.out.println(Arrays.toString(arr));

        //정렬 sort() 함수 사용
        int[] arr = {1, 4, 23, 25, 23};
//        오름차순
//        정렬이 기본
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        내림차순
//        방법1.Comparatior클래스 사용
//    객체타입인 경우에만 Comparator객체 사용 가능
        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
        Arrays.sort(st_arr);
        System.out.println(Arrays.toString(st_arr));
        Arrays.sort(st_arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(st_arr));
        Integer[] arr_integer = {1, 4, 23, 25, 23};
        Arrays.sort(arr_integer, Comparator.reverseOrder());
//      Comparator클래스는 기본형타입은 처리불가
//      Arrays.sort(arr, Comparator,reverse0rder());
//      방법2. 배열뒤집기
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp2 = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = tmp2;

//      StreamApi, lambda를 활용한 내림차순 정렬
            int[] arr2 = {4, 5, 7, 3, 7, 4, 2, 3};
            int[] new_arr2 = Arrays.stream(arr2) //arr2를 대상으로 stream객체 생성
                    .boxed() // Integer 형변환한 스트림객체생성
                    .sorted(Comparator.reverseOrder()) // 내림차순정렬
                    .mapToInt(a -> a) //Integer를 int로 변환
                    .toArray(); //배열로 변환


        }
    }







}
