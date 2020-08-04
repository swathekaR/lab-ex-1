
import java.util.*;

public class Searchelement {

    
    public static void main(String[] args) {
        int i,n,search,arr[];
        System.out.println("Enter the Size of array");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        arr =new int[n];
        System.out.println("Enter the number in array");
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter the number to Search :");
        search=obj.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("The number "+search+ " found at"+i+1);
                break;
            }
        }
        if(i==n)
        {
            System.out.println(search+" isn't present in array");
        }
             
        
        // TODO code application logic here
    }
    
}
