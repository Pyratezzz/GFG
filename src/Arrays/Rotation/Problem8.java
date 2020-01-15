package Arrays.Rotation;

/**
 *
 * Split the array and add the first part to the end
 */
public class Problem8 {
    public static void reverse(int a[], int start, int end)
    {
        while(end>start)
        {
            a[start]=a[end]+a[start];
            a[end]=a[start]-a[end];
            a[start]=a[start]-a[end];
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int a[]= {1,2,3,4,5,6,7,8,9};
        int k=3;

        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
