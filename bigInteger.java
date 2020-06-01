import java.io.*;
import java.util.*;
import java.math.BigInteger; 


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner (System.in);

        BigInteger bi1 = new BigInteger(in.next());
            BigInteger bi2 = new BigInteger(in.next());

            BigInteger bi3,bi4;
            bi3 = bi1.add(bi2);
            bi4 = bi1.multiply(bi2);

            System.out.println(bi3);
            System.out.print(bi4);
    }

    }
