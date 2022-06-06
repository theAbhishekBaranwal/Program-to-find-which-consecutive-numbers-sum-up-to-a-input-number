import java.io.*;
class TheGreatProgram
{
   public static void main(String args[])throws IOException
   {
       DataInputStream in=new DataInputStream(System.in);
       int s=0;
       System.out.print("Enter a no.=");
       int n=Integer.parseInt(in.readLine());
       
       for(int i=1;i<=n;i++)
       {
           for(int j=i;j<n;j++)
           {
               s=s+j;
               
               if(s==n)
               {
                   display(i,j,n);
                System.out.println();
                }
            }
            s=0;
            }
    }
    
    static void display(int a,int b,int n)
    {
        for(int i=a;i<=b;i++)
        {
            System.out.print(i);
            
            if(i==b)
            System.out.print("="+n);
            
            if(i!=b)
            System.out.print("+");
        }
    }
}
            