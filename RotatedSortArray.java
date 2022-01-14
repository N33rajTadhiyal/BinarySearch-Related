public class RotatedSortArray {
    public static void main(String[] args) {
        //find the number of times the sort array have been rotated
        //for anti clockwise if we substract the index of smallest element from the length of the array we will find it
        //and for clock wise the index of the minimum element is the number of time the array have been rotated

        int a[]={2,3,4,5,6,1};
        int n =Search(a);
        int rotated = a.length-n;
        System.out.println(rotated+": times the array have been rotated anti clockwise");
        System.out.println(n+" :times have been rotated clockwise");
        
    }
    public static int Search(int a[])
    {
        int l =0;
        int h = a.length-1;
        int n =a.length;
        while(l<=h)
        {
            int mid =(l+h)/2;
            int next=(mid+1)%n;
            int pre=(mid+n-1)%n;
            if(a[mid]<a[next] && a[mid] <a[pre])
            {
                return mid;
            }
            if(a[mid]>a[h])
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
