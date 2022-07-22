
import java.util.Scanner;

public class ArrayMult {

    public void multiplierdiv(int arr[], int n) {
        int product = 1;

        for (int i = 0; i < n; i++) {
            product = product * arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = product / arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // TBS(Without Divide Operation)...!!
    public void multiplierwithoutdiv(int arr[], int n) {
        int product = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                for (int j = i + 1; j < n; j++) {
                    product = product * arr[j];

                }

                arr[i] = product;

            }

            else if (i == n - 1) {
                for (int j = 0; j < n - 1; j++) {
                    product = product * arr[j];
                }

                arr[i] = product;
            }

            else {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        continue;
                    } else {
                        product = product * arr[j];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        ArrayMult a = new ArrayMult();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Updated Array: ");
        a.multiplierwithoutdiv(arr, n);

        sc.close();

    }
}