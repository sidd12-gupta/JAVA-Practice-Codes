public class CreatingArrays {

    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 11;
        a[2] = 12;
        a[3] = 78;
        a[4] = 56;

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
