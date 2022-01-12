public class findingTheOccuranceinAsortedArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,4,4,4,5,6,7,7};
        int k=7;
        int first=FirstOccurance(a, k);
        if(first==-1)
        {
            System.out.println("Element is not present");
        }
        else{
            int second=last(a, k);
            int ans = (second-first)+1;
            System.out.println(ans+": number of times Element is present in the array");
        }
                         
    }
    public static int FirstOccurance(int a[],int k)
    {
        int res=-1;
        int l=0;int h=a.length-1;
        while(l<=h)        
        {
            int mid =(l+h)/2;
            if(k==a[mid])
            {
                res=mid;
                h=mid-1;
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
    public static int last(int a[],int k)
    {
        int res=-1;
        int l=0;int h=a.length-1;
        while(l<=h)        
        {
            int mid =(l+h)/2;
            if(k==a[mid])
            {
                res=mid;
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
