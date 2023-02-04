package Class;

public class ArraySort {
    
    public int[] mergeSort(int[] array){

        int start = 0;
        int stop = array.length - 1;

        sort(array, start, stop);

        return array;
    }

    private void sort(int[] array, int start, int stop){
        
        if (start == stop){

            return;

        } else {

            int midIndex = start + (stop - start) / 2;
            sort(array, start, midIndex);
            sort(array, midIndex + 1, stop);
            merge(array, start, midIndex, stop);
        }

    }

    private void merge(int[] array, int start, int mid, int stop){

        int[] left = new int[mid - start + 2];

        for (int i = start; i <= mid; i++) {

            left[i - start] = array[i];

        }

        left[mid - start + 1] = Integer.MAX_VALUE;
        int[] right = new int[stop - mid + 1];

        for (int i = mid + 1; i <= stop; i++) {

            right[i - mid - 1] = array[i];

        }

        right[stop - mid] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;

        for (int k = start; k <= stop; k++) {

            if (left[i] <= right[j]) {

                array[k] = left[i];
                i++;

            } else {

                array[k] = right[j];
                j++;

            }

        }

    }

    public void printArray(int[] array){

        for (int i : array) {

            System.out.print(i + " ");
            
        }

        System.out.println("");

    }

}
