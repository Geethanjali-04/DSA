 import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int alpha = 65;
      int temp = 0;
      int start = ((n*2)/2);
      int end = ((n*2)/2);
      for(int i=1;i<(n*2);i++)
      {
          for(int j=1;j<n*2;j++)
          {
              if (j>=start && j<=end){
                  System.out.print((char)(alpha+temp));
                //   System.out.print("start"+start+"end"+end);
              }
              else
              {
                  System.out.print(" ");
              }
          }
          if (i<(n*2)/2)
          {
              start--;
              end ++;
              temp++;
          }
          else
          {
             start++;
             end--;
             temp--;
          }
          System.out.println();
      }
      
      
    }
}
