import java.io.*;
import java.util.*;
public class happy {
    public static void main(String args[])
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int ns,sum=0;
        while(n>9)
        {
            sum=0;
        while(n!=0)
        {
           ns=n%10;
           n=n/10;
           sum=sum+ns;
          }n=sum;}
        if(sum==1 || n==1){
            System.out.println("happy no");
        }else
        {
            System.out.println("not a happy no"); 
        }
    }
    
}
