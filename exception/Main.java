package exception;

public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };

        // start
        try {
            System.out.println("BF");
            System.out.println(1 / 0);
            System.out.println("AF");
        } catch (ArithmeticException ae) {
            try {
                System.out.println(2/0);
            } catch (Exception e) {
                System.out.println("Inner exception");
            }
            System.out.println("Fall in Airthmetic exception");
        } finally {
            // this must be last
            System.out.println("Will run always");
        }
        //end

        //start
        try {
            System.out.println(2/1);
            try{ // try must end with either catch or finally
                System.out.println(2/0);
            } finally{
                System.out.println("inner finally");
            }
        } catch (ArithmeticException e) {
           System.out.println("Outer exception");
        } finally{
            System.out.println("Outer finally");
        }
        // end

        //start
        try {
            System.out.println(a[10]);
        } catch (ArithmeticException ae) {
            System.out.println("Fall in Airthmetic exception");
        } 
        // catch(Exception e) {
        //     System.out.println("base exception");
        // } 
        finally {
            // after executing this line the control will terminalte
            System.out.println("Will run always 2");
        }
        System.out.println("Last"); // it will not run
        //end
    }
}
