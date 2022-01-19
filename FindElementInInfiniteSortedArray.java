public class FindElementInInfiniteSortedArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,10,111,112,113,114,115,116,117,118,119,221,222,223};
        int k = 221;
        int l=0;
        int h =1;
        while(h<a.length && k>=a[h])
        {
            l=h;
            h=2*h;

        }
        if(Search(a, k, l, h)!=1)
        {
            System.out.println(Search(a, k, l, h)+" : is the position of the Element");
        }
        else{
            System.out.println("Element is not present");
        }
      
    }
    public static int Search(int a[],int k,int l,int h)
    {
        while(l<=h)
        {
            int mid = (l+h)/2;
            if(a[mid]==k)
            return mid;

            if(k<a[mid])
            {
                return Search(a, k, l, mid-1);
            }
            if(k>a[mid])
            {
                return Search(a, k, mid+1, h);
            }
        }
        return -1;
    }    
}
