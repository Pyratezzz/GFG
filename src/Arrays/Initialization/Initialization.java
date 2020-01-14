package Arrays.Initialization;

public class Initialization {

    public static void main(String[] args){
        int a[] =new int[20];

        int b[] =new int[]{1,2,3};
        System.out.println(b);

        int c =b.length;
        System.out.println(c);

        int d[]=b.clone();
        System.out.println(d);

        boolean f = d==b; //false as deep cloning
        System.out.println(f);

        int g[][]= {{1,2,3},{4,5,6}};
        int h[][]=g.clone();

        boolean i= h==g; //false as shallow cloning
        System.out.println(i);

        boolean j = h[1]==g[1]; //true asshallow cloning

        System.out.println(j);
    }

}
