class findingTheMinimumElementInASortedRotatedArray{
    public static void main(String[] args) {
        int a[]={6,7,8,9,1,2,3,4,5};
        System.out.println(Search(a));

    }
    public static int Search(int a[])
    {
        int res=a[0];
        int l=0;int h=a.length-1;
        while(l<h)
        {
            int mid =(l+h)/2;
            if(a[mid]<res)
            {
                res=mid;
                h=mid-1;
            }
            if( a[l]<a[mid])
            {
                h=mid-1;
            }
            else{

                l=mid+1;
            }
            
        }

        return res;
    }
}
