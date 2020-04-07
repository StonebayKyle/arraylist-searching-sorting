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

        selectionSort(list);

        System.out.println(Arrays.toString(list.toArray()));
    }
    
    public static void selectionSort(ArrayList<String> list) {
        String minStr = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int swap = getMinIndex(list, minStr, i);
            System.out.println("Swap: " + swap);
            if (swap != -1) {
                minStr = list.get(swap);
    
                String temp = list.get(i);
                list.set(i,minStr);
                list.set(swap,temp);
            }
        }
    }

    private static int getMinIndex(ArrayList<String> list, String minStr, int minIndex) {
        String currentMinStr = "";
        int currentMinIndex = -1;

        for (int i = minIndex+1; i < list.size(); i++) {
            if (list.get(i).compareTo(currentMinStr) < 0 && minStr.compareTo(currentMinStr) > 0) {
                currentMinStr = list.get(i);
                currentMinIndex = i;
            }
        }

        return currentMinIndex;
    }

    
}