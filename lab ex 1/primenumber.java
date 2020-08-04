

import java.util.Scanner;
public class prime {

     public static void main(String[] args) {
        int n,p;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=obj.nextInt();
        for(int i=2;i<n;i++)
        {
            p=0;
            for(int j=2;j<i;j++)
            {
               if(i%j==0)
               {
                   p=1;
               }
            }
            if(p==0)
            {
                System.out.println(i);
            }
        }
        // TODO code application logic here
    }
    
}