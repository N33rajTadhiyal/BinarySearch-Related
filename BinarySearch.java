
import java.util.*;
public class BinarySearch{
  public static void main(String[] args) {
    int a[]={1,2,3,4,5,6,7,8,9,11,12,21,22,32,34,39,65,75,77};
    System.out.println("Enter the number you wanna find");
    Scanner input = new Scanner(System.in);
    int key = input.nextInt();
    int ans = Search(a, key);
    if(ans==-1)
    {
      System.out.println("number isnt present in the array");
    }
    else{
      System.out.println(ans+" is the position of the element");
    }
  }
  public static int Search(int a[],int k)
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
}