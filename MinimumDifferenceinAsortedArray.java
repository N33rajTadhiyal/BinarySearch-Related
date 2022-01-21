public class MinimumDifferenceinAsortedArray {
    public static void main(String[] args) {
        //we have to find the number jise minus kr k key k saath differenc sb se km aaye.
        int a[]={1,3,5,7,8,10,13,15,16};
        int k=14;
        int ind = Search(a, k);
        int diff = Math.abs(a[ind]-k);
        int num=a[ind];
        if(ind!=999)
        {
           System.out.println("the minimum difference is "+diff+" , the element is :"+num);
        }
    }
    public static int Search(int a[],int k)
    {
        int r=999,r1=999;
        int l=0;
        int h=a.length-1;
        int index=0;
        while(l<=h)
        {
            int mid = (l+h)/2;
            if(a[mid]==k)
            {//agr key present hai to use he return kr do kyuke diff 0 hoga or isse km kya he hoga.
                return mid;
            }
            if(k<a[mid])
            {
                //vrna difference store krte jao
                r=a[mid]-k;
                r1=Math.min(r1, r);
                index=mid;
                h=mid-1;
            }
            if(k>a[mid])
            {
                r=k-a[mid];
                r1=Math.min(r1, r);
                index=mid;
                l=mid+1;
            }
        }


        return index;
    }
    
}
