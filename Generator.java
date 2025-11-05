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
    //hint: the following functions require more than one loop
    public static void triangle(int rows){
        
    }
    public static void odds(int start){

    }
    public static void even (int maxE){

    }
    public static void pyramid(int rows){

    }
    public static void main (String [] args){
        stars(5);
    }
}
