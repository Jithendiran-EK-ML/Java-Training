public class Constructor {
    Constructor() {
        System.out.println("Default constructor");
    }

    Constructor(int i) {
        System.out.println("Int Constructor");
    }

    Constructor(float f) {
        System.out.println("Float Constructor");
    }
    public static void main(String[] args) {
        new Constructor(); // Default constructor
        new Constructor(1); // Int Constructor
        // new Constructor(null); // Error
    }
}