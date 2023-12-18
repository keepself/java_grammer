package C12ClassLecture;

import java                                                                                                                                                            .util.ArrayList;
import java.util.Arrays;
import java.util.List;;

public class C1207RecurCombiPermu {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); //1,2,3,4
        List<List<Integer>> combination_list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = 2;
        combination(myList, combination_list, temp, n, 0);
        System.out.println(combination_list);


        for (int i = 0; i < myList.size(); i++) {
            temp.add(myList.get(i));
            for (int j = i + 1; j < myList.size(); j++) {

                temp.add(myList.get(i));
                combination_list.add(temp);
                temp.remove(temp.size() - 1);
            }
            temp.remove(temp.size() - 1);


        }
        System.out.println(combination_list);

    }

    static void combination(List<Integer> myList, List<List<Integer>> combination_list, List<Integer> temp, int n, int start)
    {
        if (temp.size() == n) {
            combination_list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < myList.size(); i++) {
            temp.add(myList.get(i));
            combination(myList, combination_list, temp, n, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}






