import java.util.*;
public class BinearySearchViaRecursion {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,11,12,21,22,32,34,39,65,75,77};
        System.out.println("Enter the number you wanna find");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int low =0,high=a.length-1;
       int ans= Search(a, k, low, high);
       
       if(ans==-1)
       {
           System.out.println("element is not presrnt in the array");
       }
       else{
           System.out.println(ans+"is the positon of the array");
       }

        
    }
    public static int Search(int a[],int k,int low,int high)
    {
        
        while(low<=high)
        {
            int mid =(low+high)/2;
            if(a[mid]==k)
            {
                return mid;
            }
            if(k<a[mid])
            {
               return Search(a, k, low, mid-1);
            }
            if(k>a[mid])
            {
               return Search(a, k,mid+1, high);
            }
        }

        return -1;
    }
    
}
