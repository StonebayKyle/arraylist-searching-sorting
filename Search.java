import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        String[] data = {"apple", "banana", "banana", "cherry", "lemon", "lime", "mango", "orange", "pear", "strawberry", "watermelon"};
        ArrayList<String> haystack = new ArrayList<>();
        for (String str : data) {
            haystack.add(str);
        }

        System.out.println(search(haystack, "blueberry"));
    }

    public static int search(ArrayList<String> haystack, String needle) {
        for (int i = 0; i < haystack.size(); i++) {
            if (haystack.get(i).equals(needle)) return i;
        }

        return -1;
    }
}