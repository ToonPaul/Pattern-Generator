//Name: Paul Hudalla
//Date:
//This program draws shapes using loops

public class Generator {
    public static void stars(int rows) {
        String star = "*";
        while (rows > 0) {
            System.out.print(star);
            rows--;
            System.out.println("");
            star += "**";
        }
    }

    // hint: the following functions require more than one loop - Mr. M
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

    public static void eo(int maxE) {
        // choose any type of loop
        int printOut = 1;
        int storage;
        String letter = "E";
        for(int i = maxE; i > 0; i--){
            storage = printOut;
            if (i % 2 == 1) {
                letter = "E";
            } else {
                letter = "O";
            }
            do{
                System.out.print(letter);
                storage--;
            } while(storage > 0);
            System.out.println("");
            printOut += 1;
        }
        maxE+=1;
        for(int i = maxE; i > 0; i--){
            storage = printOut;
            if (i % 2 == 1) {
                letter = "O";
            } else {
                letter = "E";
            }
            do{
                System.out.print(letter);
                storage--;
            } while(storage > 0);
            System.out.println("");
            printOut -= 1;
        }
    }

    public static void pyramid(int rows) {
        // choose any type of loop
        rows = rows * 2 - 1;
    }

    public static void main(String[] args) {
        // stars(5);
        // triangle(5);
        // odds(9);
        eo(6);
    }
}
