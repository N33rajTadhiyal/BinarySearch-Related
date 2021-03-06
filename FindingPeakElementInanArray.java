public class FindingPeakElementInanArray {
    public static void main(String[] args) {
        int a[]={9 ,14 ,10 ,10 ,1, 2, 1, 7 ,10, 10 ,14, 19, 9};
        int ind = Search(a);
        if(ind!=-1){
            System.out.println(a[ind]+" is the peak element");

        }
        else{
            System.out.println("it there is no peek element");
        }     


    }
    public static int Search(int a[])
    {
        int res=-1;
        int l =0;
        int h=a.length-1;
       while(l<=h)
       {
           int mid =(l+h)/2;
           if((mid==0 || a[mid]>a[mid-1]) && (mid==a.length-1 || a[mid]>a[mid+1]))
           {
               return mid;
           }
           if(a[mid]>a[mid-1])
           {
               l=mid+1;
           }
           else{
               h=mid-1;
           }

       }
       return res;
    }
}
