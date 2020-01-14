package Arrays.Rotation;

/**
 * Problem: Search an element in a sorted and rotated array
 */
public class Problem2 {

    public static int indexInSortedArray(int a[], int low, int high, int key){
        if(high<low)
            return -1;
        int mid = low+(high-low)/2;
        while(high>=low){
            if(a[mid]==key)
                return mid;
            if(a[mid]>key)
                high=mid-1;
            else
                low=mid+1;
            mid = low+(high-low)/2;
        }
        return -1;
    }

    public static int findPivot(int a[], int low, int high) {
        if (low == high)
            return low;
        if (high < low)
            return -1;
        int mid = low + (high - low) / 2;

        if (mid < high && a[mid] > a[mid + 1])
            return mid;
        if (mid > low && a[mid] < a[mid - 1])
            return mid - 1;
        if (a[mid] >= a[low])
            return findPivot(a, mid + 1, high);
        return findPivot(a, low, mid);
    }
        public static void main (String[] args){

        int a[] = new int []{4,5,6,7,8,9,1,2,3};
        int key =9;
        int pivot = findPivot(a,0,a.length-1);
        if (pivot==-1)
           System.out.println( indexInSortedArray(a,0,a.length-1,key));
        else{
            int ans = indexInSortedArray(a,0,pivot,key);
            if (ans ==-1)
                ans = indexInSortedArray(a,pivot+1,a.length-1,key);
            System.out.println(ans);
        }


        }
    }


