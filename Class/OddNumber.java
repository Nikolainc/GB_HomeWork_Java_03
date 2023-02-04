package Class;

import java.util.*;

public class OddNumber {

    public static void printList(List<Integer> list){

        for (Integer integer : list) {

            System.out.print(integer + " ");

        }

        System.out.println("");

    }

    public static int findMinimal(List<Integer> list){

        int result = list.get(0);

        for (Integer integer : list) {
            
            if(result > integer){

                result = integer;

            }

        }

        return result;

    }

    public static int findMaximal(List<Integer> list) {
        
        int result = list.get(0);

        for (Integer integer : list) {

            if (result < integer) {

                result = integer;

            }

        }

        return result;

    }

    public static float findAverage(List<Integer> list){

        float result = 0f;

        for (Integer integer : list) {

            result += integer;

        }

        result /= list.size();

        return result;

    }
}
