public class ExerciseOperators {
    public static void main(String[] args) {
        int age = 25;
        double height = 5.9;
        char grade = 'A';
        System.out.println(age + ", " + height + ", " + grade);

            //2
        int a = 10, b = 20;
        System.out.println("Sum: " + (a + b));

        //3
        int x = 30, y = 3;
        System.out.println("Int Division: " + (x / y)); // Result is int
            //4
        int m = 10;
        double n = 3.0;
        double result = m / n;
        System.out.println("Double Division: " + result); // Result is double

        //5
        int currentAge = 25;
        System.out.println("In 10 years I will be: " + (currentAge + 10));
            //6
        byte small = 50;
        int sum = small + 28;
        System.out.println("New int: " + sum);
            //7
        double d = 6.7;
        int dInt = (int) d;
        System.out.println("Double: " + d + ", Casted int: " + dInt);
            //8
        float f = 3.2f;
        int i = 6;
        double product = f * i;

        System.out.printf("Result: %.2f%n", product);



        //9
        char ch = 'R';
        ch += 1;
        System.out.println("Next char: " + ch); // Output: B

            //10
        int a10 = 9;
        int b10 = 2;
        System.out.println("a / b = " + (a10 / b10)); // 4
        System.out.println("a % b = " + (a10 % b10)); // 1

            //11
        double weight = 70;
        double heightM = 1.75;
        double bmi = weight / (heightM * heightM);
        System.out.println("BMI: " + bmi);


            //12
        double n1 = 3.5, n2 = 5.5, n3 = 7.0;      // step 12
        double avg = (n1 + n2 + n3) / 3;
        System.out.println("Average: " + avg);



        //13
        int val = 10;
        val += 5;
        System.out.println("After += 5: " + val);
        val *= 2;
        System.out.println("After *= 2: " + val);
        val -= 4;
        System.out.println("After -= 4: " + val);


            //14
        short s = 30000;
        int multiplied = s * 2;
        System.out.println("Fixed result: " + multiplied); // Correct with int


        // 15
        double price = 10.99;
        int quantity = 5;
        int totalCost = (int) (price * quantity);
        System.out.println("Total cost (casted to int): " + totalCost);


        //16
        int bigVal = 130;
        byte r = (byte) bigVal;
        System.out.println("Casted byte: " + r);
            // 17
        char letter = 'z';
        letter -= 2;
        System.out.println("Resulting char: " + letter);

            //18
        long v = 2_000_000_000L;
        v += 1_000_000_000L;
        System.out.println("Total: " + v); // 3000000000


        //19
        double radius = 4.5;
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);



            //20

        byte b1 = 10;
        short s1 = 300;
        int i1 = 5000;
        long l = 100000L;
        float f1 = 2.5f;
        double d1 = 6.75;
        char c = 'C';

        int mix1 = b1 + s1;
        double mix2 = l * f1;
        char nextChar = (char)(c + 1);

        System.out.println("mix1: " + mix1);
        System.out.println("mix2: " + mix2);
        System.out.println("Next char: " + nextChar);



            //  Mini Challenge: Time Calculator

        int totalMinutes = 350;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println("Total minutes: " + totalMinutes);
        System.out.println("That is " + hours + " hour(s) and " + minutes + " minute(s).");

        // Bonus
        double costPerHour = 2.75;
        double totalC = hours * costPerHour;

        // Format with %d for int and %.2f for double
        System.out.printf("%d hour(s) = %.2f euros%n", hours, totalC);

    }
}

