package Arrays.Order_Statistics;

import static Arrays.Arrangement_Rearrangement.Problem1.swap;


public class MinHeap {

    public static int left(int i){
        return (2*i+1);
    }
    public static int right(int i){
        return (2*i+2);
    }
    public static void minheapify(int a[], int i, int length)
    {
        int left =left(i);
        int right = right(i);
        int smallest=i;
        if(left<length && a[left]<a[i]){
            smallest=left;
        }
        if(right<length && a[right]<a[smallest]){
            smallest =right;
        }
        if(smallest!=i){
            swap(a,i,smallest);
            minheapify(a,smallest,length);
        }
    }
    public static void print(int []a){
        int l =a.length;
        for(int i=0;i<l;i++){
            System.out.println(a[i]);
        }
    }
  public static int extractMin(int a[], int length){
        length =length -1;
        int t= a[0];
        swap(a,0,length);
        minheapify(a,0,length);
        return t;
  }

    public static void main(String[] args){
        int [] a= {111,2,4,5,8,3,45,1,0,9};
        int i =(a.length-1)/2;
        while(i>=0){
            minheapify(a,i,a.length);
            i--;
        }
        int l =a.length;
        for(i =0;i<4;i++){
            int t = extractMin(a,l);
            l--;
            System.out.println(t);
        }
    }
}
