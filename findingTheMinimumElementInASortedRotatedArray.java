class findingTheMinimumElementInASortedRotatedArray{
    public static void main(String[] args) {
        int a[]={5,6,7,8,1,2,3,4};

        System.out.println(Search(a)+" : is the position of the smallest element in the array");

    }
    public static int Search(int a[])
    {
        int n =a.length;
        int l=0;
        int h=a.length-1;
        while(l<=h)
        {
            int mid =(l+h)/2;
            int next =(mid+1)%n;
            int pre =(mid+n-1)%n;
            if(a[mid]<a[next] && a[mid]<a[pre])
            {
                return mid;
            }
            if( a[mid]>a[h])
            {
                l=mid+1;
            }
            else if(a[mid]<a[l]){

                h=mid-1;
            }            
        }
        return -1;
    }
}
