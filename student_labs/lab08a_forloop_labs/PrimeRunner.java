package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class PrimeRunner {

    public static void main(String[] args) {
        Prime test = new Prime();
        test.setPrime(24);
        System.out.println(test);
        
        test.setPrime(7);
        System.out.println(test);
        
        test.setPrime(100);
        System.out.println(test);

        test.setPrime(113);
        System.out.println(test);

        test.setPrime(65535);
        System.out.println(test);

        test.setPrime(2);
        System.out.println(test);

        test.setPrime(7334);
        System.out.println(test);

        test.setPrime(7919);
        System.out.println(test);

        test.setPrime(1115125003);
        System.out.println(test);

        //add test cases
    }
}