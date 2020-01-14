package Arrays.Rotation;

/**
 * Problem: Given a sorted and rotated array, find if there is a pair with a given sum
 */
public class Problem3 {
    public static int findPivot(int a[], int low, int high){
        if(high<low)
            return -1;
        int mid = low + (high-low)/2;
        while(high>low)
        {
            if(mid<high && a[mid]>a[mid+1]){
                return mid;
            }
            if(mid>low && a[mid]<a[mid-1]){
                return mid-1;
            }
            if(a[mid]<a[high]){
                high=mid-1;
            }
            else
                low=mid+1;
            mid = low + (high-low)/2;
        }

        return -1;
    }
    public static void main(String[] args){
        int a[]= new int[]{6,7,8,1,2,3,4,5};
        int sum=13;
        int n= a.length;
        int pivot = findPivot(a,0,n-1);
        int i = (pivot+1)%n;
        int l =(pivot+n)%n;
        while (i!=l)
        {
            if(a[i]+a[l]==sum){
                System.out.println("found: "+a[i]+" & "+a[l]);
                i=(i+1)%n;
             }
            else if(a[i]+a[l]>sum)
                l=(l-1+n)%n;
            else if(a[i]+a[l]<sum)
                i=(i+1)%n;
        }
    }
}
