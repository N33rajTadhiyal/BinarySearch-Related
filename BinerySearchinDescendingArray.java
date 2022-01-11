import java.util.*;
public class BinerySearchinDescendingArray {
    public static void main(String[] args) {
        int a[]={9,8,7,6,5,4,3,2,1};
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();

        int ans= Search(a, key);

        if(ans==-1)
        {
            System.out.println("element is not presrnt in the array");
        }
        else{
            System.out.println(ans+"is the positon of the array");
        }

        
    }
    public static int Search(int a[],int k)
    {
        int low =0,high=a.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
          if(a[mid]==k)
          {
              return mid;
          }
          if(k>a[mid])
          {

          }
          if(k<a[mid])
          {
              low=mid+1;
          }
          if(k>a[mid])
          {
              high=mid-1;
          }

        }
        return -1;
    }
    
}
