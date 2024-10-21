import java.util.*;
public class Main
{
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int start = (n*2)/2+1;
       int end = (n*2)/2+1;
    //   System.out.print(start);
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=n*2;j++)
           {
               if (j>=start && j<=end)
               {
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           start--;
           end++;
           System.out.println();
       }
     
       
	}
}
