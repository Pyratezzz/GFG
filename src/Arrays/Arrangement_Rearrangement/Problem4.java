package Arrays.Arrangement_Rearrangement;

/**
 *
 * Move all zeroes to end of array
 */
public class Problem4 {

    public static void main(String[] args){
        int a[] ={1, 2, 0, 4, 3, 0, 5, 0};
        int n=a.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if( a[i]>0){
                if(i!=j) {
                    a[i] = a[j] + a[i];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
                j++;
            }
        }
        while(j<n){
            a[j]=0;
            j++;
        }
        for (int i=0;i<n;i++)
            System.out.println(a[i]);
    }

}
