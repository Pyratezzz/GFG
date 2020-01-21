package Arrays.Arrangement_Rearrangement;

import java.util.Arrays;


/**
 *
 * Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
 */
public class Problem2 {
    public static void main(String[] args){

        int a[]=new int[]{1, 2, 1, 4, 5, 6, 8, 8};
        int n = a.length;

        int temp[]=new int[n];
        for (int i=0;i<n;i++)
            temp[i]=a[i];

        Arrays.sort(temp);
        int odd =n/2;
        int even = n-odd;

        int j = even-1;
        for(int i=0;i<n;i=i+2)
        {
            a[i]=temp[j];
            j--;
        }
        j = odd;

        for(int i=1;i<n;i=i+2)
        {
            a[i]=temp[j];
            j++;
        }
        for (int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
