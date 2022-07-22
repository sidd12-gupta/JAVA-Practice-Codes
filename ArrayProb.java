public class ArrayProb {

    public static int MinAr(int arr[], int rem[]) {

        int num = 1;
        boolean numberFound = false;
        while (!numberFound) {

            for (int i = 0; i < arr.length; i++) {
                if (num % arr[i] != rem[i]) {
                    numberFound = false;
                    num++;
                    break;
                }

                else {
                    numberFound = true;
                }

            }
        }

        return num;
    }

    public static void main(String args[]) {

        int arr[] = { 5, 7, 8 };
        int rem[] = { 1, 2, 3 };

        System.out.println("The minimum number is " + MinAr(arr, rem));

    }
}
