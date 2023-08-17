package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CustomException extends Exception {
    CustomException() {
        super();
    }

    CustomException(String s) {
        super(s);
    }

    CustomException(String s, Throwable err) {
        super(s, err);
    }
}

class CustomAirthmeticException extends ArithmeticException {
    CustomAirthmeticException() {
        super();
        System.out.println("default");
    }

    CustomAirthmeticException(String s) {
        super(s);
        System.out.println("Sring param");
    }
}

class CustomIOException extends IOException {
    CustomIOException() {
        super();
    }

    CustomIOException(String s) {
        super(s);
    }
}

public class Sample3 {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4 };
        try {

            // System.out.println(1 / 0);
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String s = bf.readLine(); 
            
        } catch (CustomIOException e) {
            System.out.println("Custom IO");
        }  catch(CustomAirthmeticException e) {
            System.out.println("Custom Airth"); // not catching
        } catch(IOException e) {
            System.out.println("Io exe");
        } 
        // catch(CustomException e) {
        //     System.out.println("Custom Exception");
        // }

        try {
            if(1 == 1 ) {
                throw new CustomAirthmeticException(null);
            }
        } catch (CustomAirthmeticException e) {
            System.out.println("custom airth");
        }
    }
}
