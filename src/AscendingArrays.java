import java.util.Arrays;
import java.util.Scanner;

public class AscendingArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of elements in Digit you want in array:");
        int noa = scanner.nextInt();
        // //Array Size Initialization
        int arr[] = new int[noa];
        System.out.println("Enter all the Digit of elements:");

        for (int i = 0; i < noa; i++) {
            arr[i] = scanner.nextInt();
        }
        // //Sorts the Array in Ascending Order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
