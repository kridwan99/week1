package week2;

public class Assessment1 {
    public static void main(String[] args) {

        // Question 1: True or False: The equalsIgnoreCase method compares strings ignoring case
        String input = "hello";
        String destination = "Hello";
        System.out.println("Question 1: " + input.equalsIgnoreCase(destination)); // True or False

        // Question 2: What is the output if x is less than 10?
        int x = 5;
        System.out.print("Question 2: ");
        if (x < 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Question 3: Comparing strings using '==' and 'equals()'
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        System.out.println("Question 3: " + s1 == s2); // true
        System.out.println("Question 3: " + s1 == s3); // false
        System.out.println("Question 3: " + s1.equals(s3)); // true

        // Question 4: What will be printed when y is compared to 5 and 15?
        int y = 10;
        System.out.print("Question 4: ");
        if (y < 5) {
            System.out.println("Low");
        } else if (y < 15) {
            System.out.println("Medium"); // Medium
        } else {
            System.out.println("High");
        }

        // Question 5: What is the output when printing the string "counter"?
        String counter = "counter";
        System.out.println("Question 5: " + counter); // Output: counter

        // Question 6: What does the 'this' keyword refer to in Java?
        // The 'this' keyword refers to the current instance of the class
        System.out.println("Question 6: This refers to the current instance of the class.");

        // Question 7: What is the value of z after incrementing it?
        int z = 5;
        z++;
        System.out.println("Question 7: " + z); // 6

        // Question 8: What will be printed while decrementing i by 2 in a while loop?
        int i = 10;
        System.out.print("Question 8: ");
        while (i > 0) {
            System.out.print(i + " ");
            i -= 2; // Output: 10 8 6 4 2
        }
        System.out.println();

        // Question 9: What will be printed if a is incremented and compared with 10?
        int a = 9;
        System.out.print("Question 9: ");
        if (a++ < 10) {
            System.out.println("Low"); // Output: Low
        } else {
            System.out.println("High");
        }

        // Question 10: What is the result of the expression b + c / 2?
        int b = 5, c = 2;
        System.out.println("Question 10: " + (b + c / 2)); // 5

        // Question 11: What is the output of the switch statement based on value?
        int value = 10;
        System.out.print("Question 11: ");
        switch (value) {
            case 10:
                System.out.println("Value is 10");
                break;
            case 20:
                System.out.println("Value is 20");
                break;
            default:
                System.out.println("Default case");
        }

        // Question 12: What is the purpose of the 'class' keyword in Java?
        System.out.println("Question 12: class is a keyword to define class in Java");

        // Question 13: What are constructors used for in Java?
        System.out.println("Question 13: Constructors are used to create objects");

        // Question 14: What will be printed after adding 3 to p?
        int p = 5;
        p += 3; // 8
        System.out.println("Question 14: " + p);

        // Question 15: What is the length of the array?
        int[] array = new int[4]; // 1D array example
        System.out.println("Question 15: " + array.length);

        // Question 16: What is the value of q after the addition operation?
        int q = 5;
        q += 3; // 8
        System.out.println("Question 16: " + q); // 8

        // Question 17: What will be printed when iterating over the array?
        int[] arr = {1, 2, 3, 4};
        System.out.print("Question 17: ");
        for (int j : arr) {
            System.out.print(j + " "); // Output: 1 2 3 4
        }
        System.out.println();

        // Question 18: What is the JVM and what does it do?
        System.out.println("Question 18: The JVM is a software application that executes Java programs");

        // Question 19: What is the invalid comparison operator in Java?
        System.out.println("Question 19: => is not a valid comparison operator");

        // Question 20: What is the output of the equality check for x?
        int x1 = 50;
        System.out.print("Question 20: ");
        if (x1 == 50) {
            System.out.println("x is equal to 50");
        } else {
            System.out.println("x is not equal to 50");
        }

        // Question 21: What will be printed when comparing hello and HELLO using equals()?
        String hello = "hello";
        String helloUpper = "HELLO";
        System.out.println("Question 21: " + hello.equals(helloUpper)); // false

        // Question 22: Why are constructors important in Java?
        System.out.println("Question 22: Constructors are used to create objects in Java");

        // Question 23: What is the result of converting the string to uppercase?
        String str = "hello world";
        System.out.println("Question 23: " + str.toUpperCase()); // HELLO WORLD

        // Question 24: What will be printed when checking the value of n in if-else statements?
        int n = 5;
        System.out.print("Question 24: ");
        if (n < 5) {
            System.out.println("Low");
        } else if (n == 5) {
            System.out.println("Medium"); // Medium
        } else {
            System.out.println("High");
        }

        // Question 25: Is string a primitive data type in Java?
        String s = "string"; // string is not a primitive type
        System.out.println("Question 25: string is not a primitive data type in Java");
    }
}
