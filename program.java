import java.util.*;

import Class.ArraySort;
import Class.OddNumber;

class program{

    public static void main(String[] args) {
        
        ArraySort arraySorter = new ArraySort();
        int[] array = {1, 4, 3, 2, 5};
        int[] newArray = arraySorter.mergeSort(array);
        arraySorter.printArray(newArray);

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < newArray.length; i++) {
            
            list.add(newArray[i]);

        }

        OddNumber.printList(list);
        list.removeIf(x -> (x % 2 == 0));
        OddNumber.printList(list);
        
        System.out.println((OddNumber.findMaximal(list)));
        System.out.println((OddNumber.findMinimal(list)));
        System.out.println((OddNumber.findAverage(list)));
    }
}