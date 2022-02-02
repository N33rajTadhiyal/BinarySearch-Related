public class MinimumElementInSortedROtatedArray {
   public static void main(String[] args) {
       int a[]={1,2,3,5,6,7,8,9,10};
       int ans=Search(a);
       if(ans!=-1)
       {
           System.out.println(a[ans]+" ");
       }else{
           System.out.println("baka");
       }
   }
   public static int Search(int a[])
    {
        int l=0;
        int h=a.length-1;
        int n=a.length;
        while(l<=h)
        {
            int mid=(l+h)/2;
            int next=(mid+1)%n;
            int pre=(mid+n-1)%n;
            if(a[mid]<a[next] && a[mid]<a[pre])
            {
                return mid;

            }
            if(a[mid]>a[h])
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
}
