package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2 {

    static String readLine() throws IOException, SecurityException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine(); 
        // IOException is an checked exception while the time of compile time itself it will throw 
        // it must be enclosed by try catch
        // we can make throws to thow that exception to calling method they can handle
        bf.close();
        return s; 
    }

    public static void main(String[] args) throws IOException{
        // try resource
         try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            String s = bf.readLine();// Ip: test
            System.out.println(s); // Op: test
            //bf.close(); // no need
        } catch(IOException e) {
            System.out.println(e.toString());
        }

        try {
            String s = readLine();
            System.out.println(s);
        } catch (IOException e) { // handle part
            System.out.println("Io exception handle part");
        }

        try {
            if(1 == 1) {
                throw new ArithmeticException("Operation blocked");
            }
        } catch (ArithmeticException e) {
            System.out.println("Airthmetic exception : "+e.toString());
        }

        
    }
}
