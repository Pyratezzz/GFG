package Arrays.Arrangement_Rearrangement;

/**
 *
 * Rearrange an array such that arr[i] = i
 */
public class Problem1 {
    public static void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] args) {
        int a[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };

        int n = a.length;
        for (int i = 0; i < n; i++) {
            while (a[i] != i && a[i] != -1) {
                swap(a, i, a[i]);
            }
        }

        for (int i = 0; i < n; i++)
            System.out.println(a[i]);

    }
}
