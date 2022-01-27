public class FindingPEakElementInbitonicArray {
    public static void main(String[] args) {
        
     //   int a[]={1,3,5,6,4,2};
        int a[]={1,3,5,7,8,9,10,6,4,2};
        int ans = Search(a);
        if(Search(a)!=-1)
        {
            System.out.println(a[ans]+" is the peak");
        }
        else{
            System.out.println("it isnt working");
        }


    }
    public static int Search(int a[])
    {
        int l=0;
        int h=a.length-1;

        while(l<=h)
        {
          int mid=(l+h)/2;
          if((mid==0 || a[mid]>a[mid-1]) && (mid==a.length-1 || a[mid]>=a[mid+1]))
          {
              return mid;
          }
         if(a[mid]>a[mid+1])
         {
             h=mid-1;
         }
         else{
             l=mid+1;
         }
        }
        return -1;

    }
    
}
