
package uri_adhoc_1026;

import java.util.Scanner;
import java.io.IOException;

public class Uri_AdHoc_1026 {

    public static void main(String[] args) throws IOException {
    	Scanner scann = new Scanner(System.in);
    	while (scann.hasNext()) {
    		long u = scann.nextLong();
    		long m = scann.nextLong();
    		System.out.println(u ^ m);
    	}
    }
    
}
