// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
    int m[]=   {5,4,-1,7,8};
    int max =Integer.MIN_VALUE;
    for(int st=0;st<m.length;st++)
    {
         int currentsum=0;
        for(int end =st;end<m.length;end++)
         {  
           
          currentsum+=m[end];

        }
    max=Math.max(max,currentsum);


    }
    System.out.println(max);

        
    }
}
