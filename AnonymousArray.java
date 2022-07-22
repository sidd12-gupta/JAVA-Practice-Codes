public class AnonymousArray {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        printArray(new int[] { 33, 45, 56, 2, 3 });
    }
}
