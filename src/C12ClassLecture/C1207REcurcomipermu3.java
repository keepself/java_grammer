package C12ClassLecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C1207REcurcomipermu3 {

    static boolean[] visited;

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); //1,2,3,4
        List<List<Integer>> combination_list = new ArrayList<>();
        for (int n = 1; n < myList.size(); n++) {
//            permutation(myList, combination_list, new boolean[myList.size()], new ArrayList<>(), n);}

            System.out.println(combination_list);
        }
    }

//    static void permutation(List<Integer> myList, List<List<Integer>> combination_list, boolean[] visited, List<Integer> temp, int n) {
//
//        for (int i = 0; i < myList.size(); i++) {
//            if (visited[i] == false) {
//                visited[i] = true;
//                temp.add(myList.get(i));
//                permutation(myList, combination_list, temp, n);
//                temp.remove(temp.size() - 1);
//                visited[i] = false;
//            }
//        }
//    }
}
