import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int start = 1;
       int end = n*2;
       for(int i = 1;i<=(n*2); i++)
       {
           for(int j=1;j<=n*2; j++)
           {
               if(j<=start || j>=end)
               {
                   System.out.print(j+" ");
               }
               else
               {
                   System.out.print("  ");
               }
           }
           if(i<(n*2)/2)
           {
               start++;
               end--;
           }
           else if( i!=(n*2)/2)
           {
               start --;
               end++;
           }
        //   System.out.print("i"+ i +"start"+ start + "end" + end);
           System.out.println();
       }
      
    }
}
