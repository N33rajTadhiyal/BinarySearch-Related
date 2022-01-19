public class NextAlphabetElement {
    public static void main(String[] args) {
        //in the Question we have to find the next letter which comes  after key  and is present in the array 
        char a[]={'a','b','c','d','e','f'};
        char k='a';
        if(Search(a, k)!='#')
        {
            System.out.println(Search(a, k)+" :is the next Letter");
        }
        else{
            System.out.println("Element is not present in the array");
        }

    }
    public static char Search(char a[],char k)
    {
        char res='#';
        int l=0;
        int h=a.length-1;
        while(l<=h)
        {
            int mid =(l+h)/2;
            if(k==a[mid])
            {
                //we dont return the char itsef as we need the character which comes after the key so it will be present on the left side as it is greater then the kye
                //so we set l = mid+1;
                l=mid+1;
            }
            if(k<a[mid])
            {//if the element is greater then the key then store it ..but it dosnt mean it is the the char which comes after key so we decrease h
                res=a[mid];
                h=mid-1;

            }
            if(k>a[mid])
            {
                l=mid+1;
            }
        }

        return res;
    }
    
}
