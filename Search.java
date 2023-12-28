import java.util.NoSuchElementException;

public class Search {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    // Linear search
    public static int linearSearch(int [] arr, int target) {
        for(int index = 0; index < arr.length; index++) {
            if (arr[index] == target){
                System.out.println(ANSI_GREEN+arr[index]+ANSI_RESET);
                return index;
            }
            System.out.print(ANSI_RED+arr[index]+ " -> "+ANSI_RESET);
        }
        throw new NoSuchElementException("Not in Array");
    }


    // Sentinel Linear Search

    // Binary Search

    // Meta Binary Search

    // Ternary Binary Search

    // Jump Search

    // Interpolation Search

    // Exponential Search

    // Fibonacci Search

    // The Ubiquitious Binary Search

    public static void main(String [] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 0;
        System.out.println("The index was found at "+ linearSearch(arr, target));
    }


}
