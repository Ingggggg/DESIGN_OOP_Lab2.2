public class Ex2_2 {
    public static void main(String[] args) {
        SortingAlgorithm selectionSort =  new SelectionSort();
        selectionSort.sort();

        SortingAlgorithm mergeSort = new MergeSort();
        mergeSort.sort();

        SortingAlgorithm insertionSort = new InsertionSort();
        insertionSort.sort();
    }
}