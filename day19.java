public class day19 {


public static int linear(int number[],int key)
{
    
    for(int i=0; i<number.length; i++)
    {
        if(number[i]==key)
        {
            return i;
        }
         
    }
    return -1;
}

public static int binary(int number[],int key)
{
    int start=0;
    int end=number.length-1;
    while(start<=end)
    {
        int mid=(start+end)/2;
        if(number[mid]==key)
        {
            return mid;
        }
        else if(number[mid]<key)
        {
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return -1;

    
}

public static void pair(int pai[])
{
for(int i=0; i<pai.length; i++)
{
   for( int j=i+1; j<pai.length; j++)
   {
    System.out.print("("+pai[i]+","+pai[j]+")");
   }
   System.out.println("");
}
}





public static void subarray(int pai[])
{
for(int i=0; i<pai.length; i++)
{
   for( int j=i; j<pai.length; j++)
   {

    for(int k=i; k<=j; k++)
    {
        System.out.print(pai[k]);
    }
    System.out.println("");

   }
   System.out.println("");

}
}




public static void subsum(int pai[])
{
    
    int maxs=Integer.MIN_VALUE;
for(int i=0; i<pai.length; i++)
{
   for( int j=i; j<pai.length; j++)
   {
       int curr=0;
    for(int k=i; k<=j; k++)
    {

     curr+=pai[k];
    }
    System.out.println(curr);
    if(maxs<curr)
    {
        maxs=curr;
    }

    }
}
System.out.println("maxsum="+maxs);
}







    public static void main(String []args)
    {
              int number[]={2,4,6,8,10,12,14,16};
              int key=10;
             /*  int index=linear(number,key);
              if(index==-1)
              {
                System.out.println("key not found");
              }
              else
              {
                System.out.println("key is at"+index);
              }*/
              //System.out.println(binary(number,key));

              int pai[]={2,4,6,8,10};
             //  pair(pai);
               //subarray(pai);
               subsum(pai);
    }
}
