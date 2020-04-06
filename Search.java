import java.util.ArrayList;
import java.util.Collections;

public class Search {
    public static void main(String[] args) {
        String[] data = {"apple", "banana", "banana", "cherry", "lemon", "lime", "mango", "orange", "pear", "strawberry", "watermelon"};
        ArrayList<String> haystack = new ArrayList<>();
        for (String str : data) {
            haystack.add(str);
        }
        
        Collections.sort(haystack); // sort haystack alphabetically
        String needle = "blueberry";

        System.out.println("Basic search: " + search(haystack, needle));
        
        System.out.println("Binary Search: " + binarySearch(haystack, needle));
    }

    public static int search(ArrayList<String> haystack, String needle) {
        for (int i = 0; i < haystack.size(); i++) {
            if (haystack.get(i).equals(needle)) return i;
        }

        return -1;
    }

    public static int binarySearch(ArrayList<String> haystack, String needle) {
        int low = 0, high = haystack.size()-1;

        int current = (high+low)/2;
        while (high-low > 2) {
            current = (high+low)/2;

            int compare = needle.compareTo(haystack.get(current));
            if (compare == 0) return current;
            
            if (compare < 0) { // needle is before
                high = current;
            } else { // needle is after
                low = current;
            }
        }

        return haystack.get(current).equals(needle) ? current : -1; // return current if true, -1 if false
    }
}