public class FindFlorElementinSortedArray {
    public static void main(String[] args) {
        int a[]={0,2,3,4,6,7,9};
        int k=8;
        int ans =Search(a, k);
        if(ans!=-1)
        {
            System.out.println(ans+" :is the position of the element and the element is :"+a[ans]);
        }
        else{
            System.out.println("it does not exist");
        }
    }
    public static int Search(int a[],int k)
    {
        int l=0;int h=a.length-1;
        int res=-1;
        while(l<=h)
        {
         int mid =(l+h)/2;
         if(a[mid]==k)
         {
             return mid;
         }
         if(k<a[mid])
         {
             h=mid-1;
         }
         if(k>a[mid])
         {
            res =mid;
             l=mid+1;
         }
        }


        return res;
    }
    
}
