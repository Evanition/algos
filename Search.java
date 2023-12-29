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
    public static int sentienelLinearSearch(int [] arr, int target) {
        int temp = arr[arr.length-1];
        arr[arr.length-1] = target;
        int index = 0;
        while(arr[index] != target) {
            System.out.print(ANSI_RED+arr[index]+ " -> "+ANSI_RESET);
            index++;
        }
        arr[arr.length-1] = temp;
        if ((index < arr.length-1) || (arr[arr.length-1] == target)){
            System.out.println(ANSI_GREEN+arr[index]+ANSI_RESET);
            return index;
        } else{
            throw new NoSuchElementException("Not in Array");
        }
    }
    // Binary Search
    public static int binarySearch(int[] arr, int left, int right, int target)
    {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                System.out.println(ANSI_GREEN+arr[mid]+ANSI_RESET);
                return mid;
            }

            if (arr[mid] > target){
                System.out.print(ANSI_RED+arr[mid]+ " -> "+ANSI_RESET);
                return binarySearch(arr, left, mid - 1, target);
            }

            System.out.print(ANSI_RED+arr[mid]+ " -> "+ANSI_RESET);
            return binarySearch(arr, mid + 1, right, target);
        }

        throw new NoSuchElementException("Not in Array");
    }
    // Meta Binary Search

    // Ternary Binary Search

    // Jump Search

    // Interpolation Search

    // Exponential Search

    // Fibonacci Search

    // The Ubiquitious Binary Search

    public static void main(String [] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 19;
        System.out.println("Linear Search");
        System.out.println("The index was found at "+ linearSearch(arr, target));
        System.out.println("Sentinel Linear Search");
        System.out.println("The index was found at "+ sentienelLinearSearch(arr, target));
        System.out.println("Binary Search");
        System.out.println("The index was found at "+ binarySearch(arr, 0, arr.length-1, target));
    }


}
