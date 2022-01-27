public class FindAnElementinBitonicArray {
    public static void main(String[] args) {
        int a[]={1,3,5,7,8,9,10,6,4,2};
        int k=3;
        int ans=PeakSearch(a);
        int assend= Assending(a, k,0,ans);
        int dess = Descinding(a, k,ans,a.length-1);
        if(assend != -1)
        {
            System.out.println(assend+" : is the index of the key "+a[assend]);
        }
        if(dess != -1)
        {
            System.out.println(dess+" : is the index of the key "+a[dess]);
        }
        if(assend == -1 && dess ==-1)
        {
            System.out.println("key is not present");
        }



    }
    public static int PeakSearch(int a[])
    {
        int l=0;int h =a.length-1;

        while(l<=h)
        {
            int mid=(l+h)/2;
            if((mid==0 || a[mid]>a[mid-1]) && (mid==a.length-1 || a[mid]>a[mid+1]))
            {
                return mid;
            }
            if(a[mid]<a[mid+1])
            {
                l=mid-1;
            }
            else{
               h=mid+1;
            }
        }

        return -1;
    }
    public static int Assending(int a[],int k,int l,int h)
    {
       
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
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static int Descinding(int a[],int k,int l ,int h)
    {
        
        while(l<=h)
        {
            int mid =(l+h)/2;
            if(a[mid]==k)
            {
                return mid;
            }
            if(k<a[mid])
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
