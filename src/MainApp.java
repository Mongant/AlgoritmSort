import com.algoritm.sort.SelectionSort;

public class MainApp {

    private static int[] arrRandom = {1, 5, 88, 0, 6, 70, 15, 20, 35, 65, 53, 11};

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("SelectionSort: " + selectionSort.sort(arrRandom));
    }
}
