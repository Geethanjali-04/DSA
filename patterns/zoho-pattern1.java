import java.util.*;
public class Main
{
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int prev = 0;
       for(int i=1;i<=n;i++)
       { 
           int temp = 1;
           for(int j=1;j<=i;j++)
           {
               if(j==1)
               {  
                   prev = i;
                   System.out.print(i+" ");
               }
               else{
                   
                   System.out.print(prev+n-temp+ " ");
                   prev = prev+n-temp;
                   temp++;
               }
               
           }
           System.out.println();
       }
       
       
	}
}
