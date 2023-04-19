import java.lang.reflect.Array;
import java.util.Arrays;

public class EqualityArrays {
    public static void main(String[] args) {
        //Arrays initialization and instantiation
        int n1[] = {10, 11, 12, 14};
        int n2[] = {10, 11, 12, 13};
        //checking two arrays with equals inbuilt method
        if (Arrays.equals(n1, n2)) {
            System.out.println("It is Equal");
        } else {
            System.out.println("Its not Equal");
        }
        char st1[] = new char[3];
        st1[0] = 'a';
        st1[1] = 'b';
        st1[2] = 'c';
        char st2[] = new char[3];
        st2[0] = 'a';
        st2[1] = 'b';
        st2[2] = 'c';
        //checking two arrays with equals
        if (Arrays.equals(st1, st2)) {
            System.out.println("Character is Equal");
        } else {
            System.out.println("Character is not Equal");
        }


    }
}
