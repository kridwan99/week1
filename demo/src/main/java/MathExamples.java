public class MathExamples {
    public static void main(String[] args) {
       /* int score1 = - 6;
        int score2 = 3;

       int diff = Math.abs(score1 - score2);
        System.out.println(diff);  */
            //1
        int num = - 45;
        System.out.println(Math.abs(num));
            //2
        double a = 3.5;
        double b = 7.8;
        System.out.println(Math.max(a, b));
            //3
        int x = 99;
        int y = 23;
        System.out.println(Math.min(x, y));


        //4
        double val = 8.9;
        System.out.println(Math.floor(val));

        //5
        double val1 = 5.2;
        System.out.println(Math.ceil(val1));

            //6
        double val2 = 9.6;
        System.out.println(Math.round(val2));


                //7
        double morningTemp = -3.7;
        double afternoonTemp = 12.4;

// Absolute difference
        System.out.println(Math.abs(morningTemp - afternoonTemp)); // 16.1

// Max temp
        System.out.println(Math.max(morningTemp, afternoonTemp)); // 12.4

// Min temp
        System.out.println(Math.min(morningTemp, afternoonTemp)); // -3.7

// Round afternoon temp
        System.out.println(Math.round(afternoonTemp)); // 12

// Floor morning temp
        System.out.println(Math.floor(morningTemp)); // -4.0

            //Bonus Challenges
        //1. Rounding Money Challenge

        double price = 10.876;
        double roundedPrice = Math.round(price * 100.0) / 100.0;
        System.out.println("Rounded price: " + roundedPrice); // 10.88

                //2. Time Challenge with Ceil
        int seconds = 320;
        int realMinutes = seconds / 60;
        int shownMinutes = (int)Math.ceil(seconds / 60.0);

        System.out.println("Real minutes: " + realMinutes);   // 5
        System.out.println("Show as: " + shownMinutes + " minutes"); // 6 minutes

                //3. Rounding Down Money to Nearest 5 Cents
        double price1 = 3.87;
        double rounded = Math.floor(price1 * 20) / 20.0;
        System.out.println("Rounded price: " + rounded); // 3.85


        //4. Crazy Casting Output
        double x3 = 5.9;
        int y3 = (int)x3 + 3; // x becomes 5, then +3 = 8
        System.out.println(y3); // 8

        int z = (int)(x + 3); // x + 3 = 8.9, then cast to int = 8
        System.out.println(z); // 8



            //5. Max-Min Battle
        int ab = 17;
        int bc = 42;
        int cd = 9;

        int max = Math.max(ab, Math.max(bc, cd));
        int min = Math.min(ab, Math.min(bc, cd));

        System.out.println("Max: " + max); // 42
        System.out.println("Min: " + min); // 9



                //6. Rounding Total Price Up to Whole Euro
        double total = 17.23;
        int pay = (int)Math.ceil(total);
        System.out.println("Pay€: " + pay + " euros");




                //7. Casting Overflow Trap

        int x2 = 150;
        byte y2 = (byte)x2;
        System.out.println(y2);



            //8. Big Final Boss: Mixed Math

        double start = -12.8;
        double end = 7.3;

        double distance = Math.abs(end - start);
        double roundedUp = Math.ceil(distance);
        int result = (int)roundedUp;

        System.out.println("Absolute distance = " + result);





    }
}
