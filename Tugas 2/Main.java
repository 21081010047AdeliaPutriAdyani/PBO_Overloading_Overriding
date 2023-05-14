package overriding;

/**
 *
 * @author ADELIA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bioskop hollywood1 = new Hollywood("Hollywood", "Avengers: Endgame", "2 jam", "Anthony dan Joe Russo", 30000);
        Bioskop bollywood1 = new Bollywood("Dilwale Dulhania Le Jayenge", "Shah Rukh Khan dan Kajol", "2 jam", "Aditya Chopra", 30000);
        Bioskop animasi1 = new Animasi("Frozen", "Musikal", " Chris Buck dan Jennifer Lee","Walt Disney Pictures", "2 Jam", 30000);
        
        
        System.out.println(hollywood1.toString());
        System.out.println(bollywood1.toString());
        System.out.println(animasi1.toString());
        
        System.out.println();

    }
    
}
