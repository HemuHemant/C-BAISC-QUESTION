public class lec5_dele {
    public static void main(String[] args) {
        int a[]={4,3,8,6,9};
        int del=3;
        for(int i=0;i<a.length;i++)
        {
            if(del==a[i])
            {
                for(int j=i;j<a.length-1;j++)
                {
                    a[j]=a[j+1];
                }
                //it will not work for duplicate array
            }
        }
        System.out.println();
        for(int i=0;i<a.length-1;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
