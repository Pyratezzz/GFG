package Arrays.Rotation;

/**
 *
 * Queries on Left and Right Circular shift on array
 * @param
 * bias
 * sum[]
 *
 */
public class Problem6 {

    public static int newBias(int[]query,int bias,int n){
        if(query[0]==1)
            return (bias-(query[1]%n)+n)%n;
        if(query[0]==2)
            return (query[1]+bias)%n;
        return bias;
    }

    public static void main(String []args){
        int a[] = { 1, 2, 3, 4, 5 };
        int k=4;
        int q1[] = {1,3};
        int q2[] = { 3, 0, 2 };
        int q3[] = { 2, 1 };
        int q4[] = { 3, 1, 4 };

        int q[][]={q1,q2,q3,q4};

        int n = a.length;
        int sum[] = new int[n];
        sum[0]=a[0];
        for(int i=1;i<n;i++)
            sum[i]=a[i]+sum[i-1];
        int bias = 0;

        for(int x=0;x<k;x++){
            int l=q[x].length;
            if(l==2)
            {
                bias=newBias(q[x],bias,n);
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[(i+bias)%n]);
                }
                System.out.println("");
            }
            else {

                //index i in rotated matrix is index i+bias in original matrix
                int start=(q[x][1]+bias)%n ;
                int end=(q[x][2]+bias)%n;
                if(start<end)
                System.out.println(sum[end] - sum[start] + a[start]);
                else{
                    System.out.println( sum[n-1]-(sum[start]-sum[end])+a[start]);
                }
            }

        }
    }
}
