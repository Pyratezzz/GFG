package Arrays.Order_Statistics;

/**
 *
 * K maximum sums of overlapping contiguous sub-arrays
 */
public class Problem2 {
    public static int[] insert(int pos, int ele, int [] arr){
        int temp=arr[pos];
        int temp1 = ele;
        for (int i = pos;i<arr.length; i++){
            temp =arr[i];
            arr[i]=temp1;
            temp1=temp;

        }
        return arr;
    }
    public static int[] maxmerge(int [] res, int [] maxi){
        int k =maxi.length;
        int j=0;
        for(int i=0;i<k;i++){
            if(res[j]>maxi[i]){
               maxi = insert(i,res[j],maxi);
                        j++;
            }
        }

        return maxi;
    }

    public static int[] insertMini(int [] mini, int item){
        int k = mini.length;
        for(int i=0;i<k;i++){
            if(item<mini[i]){
              mini = insert(i,item,mini);
              break;
            }
        }
        return mini;
    }
    public static void print (int [] maxi){
        for(int i = 0; i<maxi.length;i++){
            System.out.println(maxi[i]);
        }
    }

    public static int[] pre_sum(int [] arr){
        int sum []=new int [arr.length];
        sum[0]=arr[0];
        for(int i=1;i<arr.length;i++)
            sum[i]=sum[i-1]+arr[i];
        return sum;
    }
    public static void main(String[] args){
        int a[] ={ 4, -8, 9, -4, 1, -8, -1, 6  };
        int k = 4;
        int mini[] = new int[k];
        int maxi[]=new int [k];
        for(int i=0;i<k;i++){
            mini[i]=(int) Double.POSITIVE_INFINITY;
            maxi[i]=(int) Double.NEGATIVE_INFINITY;

        }
        mini[0]=0;
        int sum[] = pre_sum(a);
        int res[]= new int[k];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<k;j++){
                if(sum[i]<0 && mini[j]==(int) Double.POSITIVE_INFINITY)
                    res[j]=(-sum[i]-mini[j]);
                else
                    res[j]=sum[i]-mini[j];
            }
            maxi =maxmerge(res,maxi);
            mini = insertMini(mini,sum[i]);
        }

    print(maxi);

    }
}
