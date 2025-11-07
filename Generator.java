//Name: Paul Hudalla
//Date: 11/7/25
//This program draws various shapes using while, do while, and for loops

public class Generator {
    //Precondition: makes sure to pass a number argument to rows when calling this method
    public static void stars(int rows) {
        String star = "*";
        while (rows > 0) {
            System.out.print(star);
            rows--;
            System.out.println("");
            star += "**";
        }
    }
    //Postcondition: draws a triangle made out of * symbols

    //Precondition: makes sure to pass a number argument to rows when calling this method
    public static void triangle(int rows) {
        int num = 1;
        while (rows > 0) {
            int counts = num;
            do {
                System.out.print(num);
                counts--;
            } while (counts > 0);
            rows--;
            System.out.println("");
            num += 1;
        }
    }
    //Postcondition: makes a triangle out of numbers that represent the row number

    //Precondition: makes sure to pass a number argument to start when calling this method
    public static void odds(int start) {
        // for loop
        int counts = start;
        int num = start;
        for (int i = start; i > 0; i--) {
            counts = num;
            if (i % 2 == 1) {
                do {
                    System.out.print(i);
                    counts--;
                } while (counts > 0);
                System.out.println("");
            }
            num--;
        }
    }
    //Postcondition: makes a triangle out of decending odd numbers

    //Precondition: makes sure to pass a number argument to maxE when calling this method
    public static void eo(int maxE) {
        // choose any type of loop
        int printOut = 1;
        int storage;
        String letter = "E";
        for (int i = maxE; i > 0; i--) {
            storage = printOut;
            if (i % 2 == 1) {
                letter = "E";
            } else {
                letter = "O";
            }
            do {
                System.out.print(letter);
                storage--;
            } while (storage > 0);
            System.out.println("");
            printOut += 1;
        }
        printOut -= 2;
        maxE--;
        for (int i = maxE; i > 0; i--) {
            storage = printOut;
            if (i % 2 == 1) {
                letter = "E";
            } else {
                letter = "O";
            }
            do {
                System.out.print(letter);
                storage--;
            } while (storage > 0);
            System.out.println("");
            printOut -= 1;
        }
    }
    //Postcondition: makes an isoscles triangle using the letter E and O, depending on if the row is even or odd

    //Precondition: makes sure to pass a number argument to rows when calling this method
    public static void pyramid(int rows) {
        // choose any type of loop
        int num = 1;
        int counts = rows * 2 - 1;
        while (rows > 0) {
            counts = rows * 2 - 1;
            int spaces = num-1;
            while(spaces > 0){
                System.out.print(" ");
                spaces--;
            }
            do {
                System.out.print(num);
                counts--;
            }while(counts > 0);
            System.out.println("");
            num++;
            rows--;
        }
    }
    //Postcondition: makes a pyramid with the lowest digit on top and the highest digit on the bottom
    public static void main(String[] args) {
        stars(5);
        triangle(5);
        odds(9);
        eo(5);
        pyramid(5);
    }
}
