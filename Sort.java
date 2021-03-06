import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        String[] data = {"apple", "banana", "banana", "cherry", "lemon", "lime", "mango", "orange", "pear", "strawberry", "watermelon"};
        ArrayList<String> list = new ArrayList<>();
        for (String str : data) {
            list.add(str);
        }

        Collections.shuffle(list); // shuffle list

        // selectionSort(list);
        // insertionSort(list);
        bubbleSort(list);

        System.out.println(Arrays.toString(list.toArray()));
    }
    
    public static void selectionSort(ArrayList<String> list) {
        String minStr;
        for (int i = 0; i < list.size(); i++) {
            minStr = list.get(i);
            int swap = getMinIndex(list, minStr, i);
            System.out.println("Swap: " + swap);

            list.set(i,list.get(swap));
            list.set(swap,minStr);
        }
    }

    private static int getMinIndex(ArrayList<String> list, String minStr, int minIndex) {
        String currentMinStr = minStr;
        int currentMinIndex = minIndex;

        for (int i = minIndex+1; i < list.size(); i++) {
            if (currentMinStr.compareTo(list.get(i)) > 0) {
                currentMinStr = list.get(i);
                currentMinIndex = i;
            }
        }

        return currentMinIndex;
    }

    public static void insertionSort(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i++) { // all indexes
            for (int j = i; j > 0 && list.get(j-1).compareTo(list.get(j)) > 0; j--) { // repeat downward while out of order
                //swap
                String temp = list.get(j-1);
                list.set(j-1,list.get(j));
                list.set(j,temp);
            }
        }
    }

    public static void bubbleSort(ArrayList<String> list) {

        int swapCount = -1;
        while (swapCount != 0) {
            swapCount = 0;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).compareTo(list.get(i+1)) > 0) {
                    swapCount++;
                    String temp = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,temp);
                }
            }
        }
    }
}