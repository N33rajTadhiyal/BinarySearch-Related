public class FindFirst1inANInfinityBinarySortedArray {
    public static void main(String[] args) {
        //given an infinite sorte array of binary numbers we have to find the first 1 in the array
        int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int k=1;
        int l=0;
        int h=1;
        while(h<a.length && k>a[h])
        {
            l=h;
            h=h*2;
        }
        if(Search(a, k, l, h)!=-1)
        {
            System.out.println(Search(a, k, l, h)+" is the index of the first 1 in the array");
        }
        else{
            System.out.println("there is not even a single 1 in the array");
        }
    

    }
    public static int Search(int a[],int k,int l ,int h)
    {
        int res =-1;
        while(l<=h)
        {
            int mid =(l+h)/2;
            if(a[mid]==k)
            {
                res=mid;
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
