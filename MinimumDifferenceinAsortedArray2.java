public class MinimumDifferenceinAsortedArray2 {
    public static void main(String[] args) {
        //I have used a different aproach in this one
        int a[]={1,3,5,7,8,10,13,15,16};
        int k=14;
        int ans = Search(a, k);
        if(ans!=-1)
        {
            System.out.println(ans+" :the minimum difference");
        }
    }
    public static int Search(int a[],int k)
    {
        int l=0;
        int h =a.length-1;
        int ans=1;
        int kaa=0;
        
        while(l<=h)
        {
            int mid =(l+h)/2;
            if(a[mid]==k)
            {
                return kaa;
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

        int diff1=Math.abs(a[l]-k);
        int diff2 =Math.abs(a[h]-k);

        return ans ;
    }
    
}
