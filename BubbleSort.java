public class BubbleSort {

    void BubbleSort1(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 14, 3, 1, 5, 6, 7, 25, 67 };

        BubbleSort b = new BubbleSort();

        b.BubbleSort1(arr);

        b.display(arr);

    }
}