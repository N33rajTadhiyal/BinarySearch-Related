public class AllocatePagesOfBooks {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int k =2;
        int l=High(a);
        int h=sum(a);
      
        int ans =Minmax(a, l, h, k);
        if(ans!=-1)
        {
            System.out.println(ans+": is the max min no of books");
        }
        

    }

    public static int High(int a[])
    { 
        int x=a[0];
        for(int i =1;i<a.length;i++)
    {         
        if(a[i]>x)
        {
            x=a[i];
        }
    }
        return x;
    }
    public static int sum(int a[])
    {
        int s=0;
      for(int i =0;i<a.length;i++)
      {
          s+=a[i];
      }
        return s;
    }

    public static int Minmax(int a[],int l,int h,int k)
    {
        int res=-1;
        while(l<=h)
        {
            int mid =(l+h)/2;
            if(isValid(a, k, mid))
            {
                res=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return res;
    }

    public static boolean isValid(int a[],int k ,int m)
    {
        int stdent =1;
        int sum=0;

        for (int i =0;i<a.length;i++)
        {
         sum +=a[i];
         if(sum>m)
         {
             stdent++;
             sum=a[i];   
         }
         if(stdent>k)
         {
             return false;
         }
        }
        return true;
    }    
}
