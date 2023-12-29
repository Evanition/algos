import java.util.*;

public class Sort {
    // In-place merge sort

    // Heapsort
    public static int[] heapSort(int[] input) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] out = new int[input.length];
        for (int x : input) {
            pq.add(x);
        }
        for (int i = 0; i < out.length; i++) {
            out[i] = pq.peek() != null ? (pq.poll()) : 0;
        }
        return out;
    }

    // Introsort

    // Merge sort

    // Tournament Sort

    // Tree Sort

    // Block Sort

    // SmoothSort

    // Timsort

    // PatienceSort

    // Cubesort

    // QuickSort

    // LibrarySort

    // ShellSort

    // CombSort

    // Insertion sort

    // Bubblesort

    // Cocktail shaker sort

    // GnomeSort

    // odd-even sort

    // simple panacake sort

    // strand sort

    // selection sort

    // exchange sort

    // cycle sort

    // pigeon hole sort

    // bucket sort (uniform keys)

    // bucket sort (non-uniform keys)

    // counting sort
    static int max(int[] input) {
        int out = input[0];
        for (int x : input) {
            out = Math.max(x, out);
        }
        return out;
    }
    public static int[] countingSort(int[] input) {
        int max = max(input);
        int[] intermediate = new int[max + 1];
        int[] out = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            intermediate[input[i]]++;
        }
        for (int i = 1; i < intermediate.length; i++) {
            intermediate[i] += intermediate[i - 1];
        }
        for (int i = input.length - 1; i >= 0; i--) {
            out[intermediate[input[i]] - 1] = input[i];
            intermediate[input[i]]--;
        }
        return out;
    }

    // LSD Radix Sort

    // MSD Radix Sort

    // MSD Radix Sort (in place)

    // Spreadsort

    // burst sort

    // flash sort

    // POstman sort

    // bread sort

    // merge-insertion sort

    // bogosort

    // double bogosort

    // bogobogo sort

    // bozosort

    // quantum bogosort

    // miracle sort

    // worst sort

    // stooge sort

    // sleep sort

    // exclusion sort

    // divine sort

    // stalin sort

    // stack sort

    // hitchiker's sort

    // conway sort

    public static void main(String[] args) {
        int[] a = {5, 4, 6, 2, 7, 9, 2, 1, 10, 20};
        int[] test = countingSort(a);

        System.out.println(Arrays.toString(test));
    }
}
