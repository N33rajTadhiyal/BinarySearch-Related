public class FindingAnElementInrotatedSortedArray {
    public static void main(String[] args) {
        int a[]={5,6,7,8,1,2,3,4};
        int k =4;
        int ans=Search(a, k);
        if(ans==-1)
        {
            System.out.println("not found");
        }else{
            System.out.println(ans+" :is the pos of element");
        }
    }
    
    public static int Search(int a[],int k){
        int l =0;int h=a.length-1;
        while(l<=h)
        {
            int mid =(l+h)/2;
            if(k==a[mid])
            {
                return mid;
            }
            if(a[l]<a[mid])
            {
                if(k<a[mid] && k>=a[l])
                {
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            if(a[mid]<a[h])
            {
                if(k>a[mid] && k<=a[h])
                {
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }

        return -1;
    }
    
}
