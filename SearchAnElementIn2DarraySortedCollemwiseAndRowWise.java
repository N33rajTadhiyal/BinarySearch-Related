public class SearchAnElementIn2DarraySortedCollemwiseAndRowWise {
    public static void main(String[] args) {
        int a[][]={
                   {10,20,30,40},
                   {15,25,35,45},
                   {17,27,37,47},
                   {19,29,39,49}
                  };
        int k = 49;
       
        Search(a, k);
       

    }
  public static void Search(int a[][],int k)
  {
    String st ="";
    int i =0;
    int j=a.length-1;

    while(i>=0 && i<a.length && j>=0 && j<a.length )
    {
      if(a[i][j]==k)
      {
          System.out.println("found at "+i+" "+j);
          return;
      }
      else if(a[i][j]>k)
      {
          j--;
      }
      else if(a[i][j]<k)
      {
          i++;
      }

    }
   System.out.println("it is not present");
    return ;

  }
    
}
