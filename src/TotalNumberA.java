import java.util.Scanner;

public class TotalNumberA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please Enter Any String");
      String name= scanner.nextLine();
        int a = name.length() - (name.replaceAll("a", "").length());
        //From total string length replacing 'a' with empty string and getting length,which is showing answer
        System.out.println( "Total Number of a in the String is:"  + a);
    }
}

