// SortingAlgorithm interface defining different sorting methods
interface SortingAlgorithm {
    void bubbleSort(int[] array);
    void mergeSort(int[] array);
    void quickSort(int[] array);
}

// BubbleSort class implementing SortingAlgorithm
class BubbleSort implements SortingAlgorithm {
    @Override
    public void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void mergeSort(int[] array) {}

    @Override
    public void quickSort(int[] array) {}
}

// MergeSort class implementing SortingAlgorithm
class MergeSort implements SortingAlgorithm {
    @Override
    public void mergeSort(int[] array) {
        if (array.length < 2) return;
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    @Override
    public void bubbleSort(int[] array) {}

    @Override
    public void quickSort(int[] array) {}
}

// QuickSort class implementing SortingAlgorithm
class QuickSort implements SortingAlgorithm {
    @Override
    public void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    private void quickSortHelper(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSortHelper(array, low, pi - 1);
            quickSortHelper(array, pi + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    @Override
    public void bubbleSort(int[] array) {}

    @Override
    public void mergeSort(int[] array) {}
}

// Main class to test sorting algorithms
public class Sorting {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};

        SortingAlgorithm sorter;

        sorter = new BubbleSort();
        sorter.bubbleSort(array.clone());
        System.out.println("BubbleSort: " + java.util.Arrays.toString(array));

        sorter = new MergeSort();
        sorter.mergeSort(array.clone());
        System.out.println("MergeSort: " + java.util.Arrays.toString(array));

        sorter = new QuickSort();
        sorter.quickSort(array.clone());
        System.out.println("QuickSort: " + java.util.Arrays.toString(array));
    }
}

