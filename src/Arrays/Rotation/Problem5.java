package Arrays.Rotation;

/**
 * Find a rotation with maximum hamming distance
 */
public class Problem5 {
    public static void main(String[] args){
        int a[] ={1,4,1};
        int n=a.length;
        int copy[]=new int[2*n+1];
        for(int i=0;i<n;i++)
        {
            copy[i]=a[i];
            copy[n+i]=a[i];
        }

        int max=0;
        int cur=0;

        for(int i=1;i<copy.length;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[j]!=copy[i])
                    cur++;
            }
            if(cur>max)
                max=cur;
            cur=0;
        }
        System.out.println(max);
    }
}
