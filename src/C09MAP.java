import java.sql.Array;
import java.util.*;


public class C09MAP {
    public static void main(String[] args) {

// <String, String> ->Map
 Map <String, String> myMap =new HashMap<>();
 myMap.put("basketball", "농구");

        myMap.put("soccer", "축구");
        myMap.put("baseball", "야구");
        System.out.println(myMap);
//        System.out.println(myMap.get("basketball"));
//        System.out.println(myMap.get("baseball"));

//        System.out.println(myMap.remove("soccer"));
//        System.out.println(myMap.size());
////
////        size(), isEmpty() 사용가능
////        이미 key가 있을경우 put을하면 덮어쓰기
//
//        myMap.put("baseball", "배구");
////         없으면 put이 putIfAbsent
//        myMap.putIfAbsent("baseball", "배구");
////          get0rdefault : key가 없으면 default값 return
//        System.out.println(myMap.getOrDefault("tennis", "스포츠"));
//        System.out.println(myMap.containsKey("tennis"));
//
        myMap.remove("baseball");
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());

////        enhanced for: key값 하나씩 출력.
//        int total = 0;
//        for(String a : myMap.keySet()){
//            System.out.println(myMap.get(a));
//        }


//
//        Map <String, String> myMap =new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//
//        System.out.println(myMap);
////      iterartor를 통해 key 값 하나씩 출력.
//       Iterator<String> myIter = myMap.keySet().iterator();
//
////       next()메서드는 데이터를 소모시키면서 return
////       System.out.println(myIter.next());
////        System.out.println(myIter);
////      hasNext() : iterator 값이 있는지 없는지.
//
//        while(myIter.hasNext()){
//            System.out.println(myIter.next());
//        }
//
        List<String> myList = new ArrayList<>();
        myList.add("basketball");
        myList.add ("baseball");
//        for (int i = 0; i < myList.size(); i++) {



            String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
            String[] completion = {"josipa", "filipa", "marina", "nikola"};
            String answer ; //vinko
            Map<String, Integer> participant_map = new HashMap<>();
            for(String a : participant){
                participant_map.put(a, participant_map.getOrDefault(a, 0)  +1);
            }
            for(String a :completion){
                if(participant_map.get(a) >1){
                    participant_map.put(a, participant_map.get(a)-1);
                    continue;
                }
                if(participant_map.get(a) == 1){
                        participant_map.remove(a);

                }
            }
//            1명남음
//        String answer ="";
            for(String a : participant_map.keySet()){
                answer =a;

//  LinkHashMap : 데이터 삽입순서 유지
                Map<String, Integer> myMap1 = new LinkedHashMap<>();
                myMap1.put("hello5", 1);
                myMap1.put("hello4", 1);
                myMap1.put("hello3", 1);
                myMap1.put("hello2", 1);
                myMap1.put("hello1", 1);
                System.out.println(myMap1);
//h=    TREEMAP KEY
                Map<String, Integer> myMap2 = new TreeMap<>();
                myMap1.put("hello5", 1);
                myMap1.put("hello4", 1);
                myMap1.put("hello3", 1);
                myMap1.put("hello2", 1);
                myMap1.put("hello1", 1);
                System.out.println(myMap2);










            }
            }











        }





