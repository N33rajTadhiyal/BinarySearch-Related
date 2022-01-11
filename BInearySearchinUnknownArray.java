import java.util.*;
public class BInearySearchinUnknownArray {
    public static void main(String[] args) {
        /*
        we dont know that in what order the given array is sorted 
        so first we have to find out weather it is in Assending order or dessending order
        */
        //int a[]={1,2,3,4,5,6,7,8,9,11,12,21,22,32,34,39,65,75,77};

        int a[]={9,8,7,6,5,4,3,2,1};
        System.out.println("Enter the number you wanna find");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int ans=0;
        if(a[0]<a[a.length-1])
        {
            ans=SearchAssend(a, k);
        }
        if(a[0]>a[a.length-1])
        {
         ans=SearchDessend(a, k);

        }

        if(ans==-1)
        {
            System.out.println("element is not presrnt in the array");
        }
        else{
            System.out.println(ans+" is the positon of the array");
        }        
        
    }
    public static int SearchAssend(int a[],int k)
    {
      int l=0;
      int h=a.length -1;
      while(l<=h)
      {
        int mid = (l+h)/2;
        if(a[mid]==k)
        {
          return mid;
        }
        if(k<a[mid])
        {
          h = mid-1;
        }
        if(k>a[mid])
        {
          l = mid+1;
        }
      }
      return -1;
    }
    public static int SearchDessend(int a[],int k)
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
