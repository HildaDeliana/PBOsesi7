import java.util.ArrayList;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");
        arrayList.add("Element 3");

        System.out.println("ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // Contoh penggunaan ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(1);
        arrayDeque.push(2);
        arrayDeque.push(3);

        System.out.println("\nArrayDeque:");
        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.pop());
        }
    }
}
