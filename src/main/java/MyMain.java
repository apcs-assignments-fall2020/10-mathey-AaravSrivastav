import java.util.Scanner;

public class MyMain {

    public static int someMethod() {
        return 1;
    }

    public static void main(String[] args) {
        int one = (int)(Math.random() * 11)+10;
        int two = (int)(Math.random() * 11)+10;
        int three = (int)(Math.random() * 11)+10;
        System.out.println("the three random numbers are " + one + ", " + two + ", and " + three);
        int smallest = 0;
        int largest = 0;
        smallest = Math.min(one, Math.min(two, three));
        System.out.println("The smallest number is " + smallest);
        largest = Math.max(one, Math.max(two, three));
        System.out.println("The largest number is " + largest);
    }

}


