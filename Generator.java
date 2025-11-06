//Name: Paul Hudalla
//Date:
//This program draws shapes using loops

public class Generator{
    public static void stars(int rows){
        String star = "*";
        while(rows > 0){
                System.out.print(star);
                rows--;
                System.out.println("");
                star += "**";
            }
        }
    //hint: the following functions require more than one loop - Mr. M
    public static void triangle(int rows){
        int num = 1;
        while(rows > 0){
        int counts = num;    
                do{
                    System.out.print(num);
                    counts--;
                } while(counts > 0);
            rows--;
            System.out.println("");
            num += 1;
            }
    }
    public static void odds(int start){
        //for loop
        
        for(int i = start; i > 0;i--){
            int counts = start;
            if(i%2 == 1){
                do{
                    System.out.print(i);
                    counts--;
                } while(counts > 0);
            System.out.println("");
            } 
        }
        }
    public static void eo (int maxE){
        //choose any type of loop
        /*String letter = "E";
        if(maxE%2 == 0){
            letter = "o";
        }*/
    }
    public static void pyramid(int rows){
        //choose any type of loop
    }
    public static void main (String [] args){
        //stars(5);
        //triangle(5);
        odds(9);
    }
}
