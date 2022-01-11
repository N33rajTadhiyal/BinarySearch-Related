public class LatOccuranceofElementinSortedArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,5,5,5,6,7,8,9,11,12,12,12};
        int k=12;
        int ans = Search(a,k);
        if(ans==-1)
        {
            System.out.println("Key is not present");
        }
        else{
            System.out.println(ans+" :is the position of the element,s first occurance");
        }
        
    }
    public static int Search(int a[],int k)
    {
        int l=0,h=a.length-1;
        int res=-1;

        while(l<=h)
        {
            int mid = (l+h)/2;
            if(k==a[mid])
            {
                res = mid;
                l=mid+1;
            }
            if(k<a[mid])
            {
                h=mid-1;

            }
            if(k>a[mid])
            {
                l=mid+1;
            }

        }

        return res;
    }
    
}
