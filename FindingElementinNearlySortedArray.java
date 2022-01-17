public class FindingElementinNearlySortedArray {
    public static void main(String[] args) {
        //a nearly sorted array is the item which was supose to be at ith pos could be either at i or i-1 or i+1 position
        int a[]={2,1,4,3,6,5};
        int k =1;
        int ans =Search(a, k);
        if(ans!=-1)
        {
            System.out.println(ans+" :is the position of the element");
        }
        else{
            System.out.println("it does not exist");
        }
    }

    public static  int Search(int a[],int k)
    {
        int l =0;
        int h= a.length-1;
        while(l<=h)
        {
            int mid =(l+h)/2;
            if(k==a[mid])
            {
                return mid;
            }
            if(l<=mid-1 && k==a[mid-1])
            {
                return mid-1;
            }
            if(h>=mid+1 && k==a[mid+1])
            {
                return mid+1;
            }
            if(k<a[mid])
            {
                h=mid-2;
            }
            if(k>a[mid])
            {
                l=mid+2;
            }
        }
        return -1;
    }
    
}
