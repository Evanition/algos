import javafx.scene.layout.Priority;

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
        int[] a = {5, 43, 6, 2, 7, 9, 2, -1, 100, -2000};
        int[] test = heapSort(a);

        System.out.println(Arrays.toString(test));
    }
}
