import java.util.Arrays;
import java.util.HashSet;

public class CommonElements {
    //to find the common elements between two arrays in string values)
    //main method
    public static void main(String[] args) {

        //create array1 and array2
        String[] array1 = new String[]{"Mohan", "Nirav", "Vihan"};
        String[] array2 = new String[]{"Mohan", "Nirav", "Vihan", "Raj", "Rohan"};

        //print array1 and array2
        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    //add common elements
                    set.add(array1[i]);
                    break;
                }
            }
        }
        //find the common elements
        System.out.println("Common element : " + (set));
    }
}
