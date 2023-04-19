import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask to enter the total number of elements
        System.out.println("enter array size");
        int size = scanner.nextInt();
        int[] a = new int[size];

        // ask to enter the value of elements
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        //ask to enter number of array
        System.out.println("enter array location");
        int location = scanner.nextInt();
        for (int i = location; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;
        for (int i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
