
package uri_adhoc_1026;

import java.util.Scanner;


public class Uri_AdHoc_1026 {

    
    public static void main(String[] args){ 
    
        tesT();
  
    }
    
    public static void tesT(){
        Scanner sc = new Scanner(System.in);
         while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int z = a^b;
            System.out.println(z); 
        }
        
    }
    
    
}
