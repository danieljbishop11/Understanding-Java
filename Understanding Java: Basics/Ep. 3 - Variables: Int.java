public class Variables {

    public static void main(String[] args) {

        // Here are our integer variable data types
        int a = 5;
        int b = 2;
        int c = b;
        int d = -100;
        int e = 1_000_000;

        // We are able to print out our integers to the console
        System.out.println(c);

        // We can use math operations to add, subtract, multiply, and divide
        System.out.println(a + b);
        System.out.println(c - b);
        System.out.println(a * d);
        System.out.println(a / b);

        // Also, we can assign integers to other defined integer variables
        a = b;

        /*
        Remember, an integer can be a both negative and positive value, however,
        there is a limit to the value before our IDE tells us that it is beyond
        the limit if the data type. We will cover these other data types in the
        next video!
        */
    }
}
