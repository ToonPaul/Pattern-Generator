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
                do{
                    System.out.print(num);
                } while(/*something*/);
                rows--;
                System.out.println("");
                num += 1;
            }
    }
    public static void odds(int start){

    }
    public static void even (int maxE){

    }
    public static void pyramid(int rows){

    }
    public static void main (String [] args){
        //stars(5);
        triangle(5);
    }
}
