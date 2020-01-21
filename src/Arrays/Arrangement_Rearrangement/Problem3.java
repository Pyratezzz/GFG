package Arrays.Arrangement_Rearrangement;

import static java.lang.Math.pow;


/**
 *
 * Rearrange positive and negative numbers in O(n) time and O(1) extra space
 */
public class Problem3 {
    public static void main(String[] args){

        int a[]={1, 2, -3, 4, 5, 6, -7, 8, 9};
        int j=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(a[j]*(pow(-1,i))>0){
                j++;
            }
            else{
                while( i<n && a[i]*(pow(-1,j))<0)
                    i++;
                if(i<n) {
                   a[i]=a[j]+a[i];
                   a[j]=a[i]-a[j];
                   a[i]=a[i]-a[j];
                    j=j+2;
                }
            }
        }
        for (int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}

