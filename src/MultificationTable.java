import java.util.Scanner;

public class MultificationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user input
        System.out.println("Enter Any Number to see Multiplication Table");
        int multi =scanner.nextInt();
        int i=1;

        do {
            System.out.println(multi+"*"+i+"="+i*multi);
            i++;
        }
        while (i<=12);

            }
}
