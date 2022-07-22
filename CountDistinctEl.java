import java.util.*;

public class CountDistinctEl {

    public static void countdistinct(int arr[]) {
        Scanner sc = new Scanner(System.in);
        int k;
        System.out.print("Enter the window size: ");
        k = sc.nextInt();
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < k; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);

        }

        System.out.println(m.size());

        for (int i = k; i < arr.length; i++) {
            if (arr[i - k] == 1) {
                m.remove(arr[i - k]);
            } else {
                m.put(arr[i - k], m.get(arr[i - k]) - 1);

            }

            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
            System.out.println(m.size());
        }

        sc.close();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 2, 1, 3, 1, 1, 3 };

        countdistinct(arr);
    }
}
