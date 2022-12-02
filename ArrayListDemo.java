import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many element do you want to insert");
        int size = sc.nextInt();
        System.out.println("enter " + size + " element in an array");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}
