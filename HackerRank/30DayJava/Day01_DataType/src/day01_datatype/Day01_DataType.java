
package day01_datatype;

import java.util.Scanner;


public class Day01_DataType {

   
 public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        String inputString;
        int a;
        double b;
        
        a = scan.nextInt();
        b = scan.nextDouble();
        scan.nextLine();
        inputString = scan.nextLine();
        
        //i = (int) (i+d);
        //d = d*d;
        System.out.println((i+a));
        System.out.println(d+b);
        System.out.println(s+inputString);
        
        
        scan.close();
    }
}
