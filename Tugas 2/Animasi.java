package overriding;

/**
 *
 * @author ADELIA
 */
public class Animasi extends Bioskop{
    String genre, studio;
    
    public Animasi(String judul, String genre, String sutradara, String studio, String durasi, int harga){
        super(judul, durasi, sutradara ,harga);
        this.genre = genre;
        this.studio = studio;
    }
    
    @Override
    public String toString(){
        return 
        "-------Bioskop XXI-------"+
        "\nJudul      : " +judul+
        "\nGenre      : " +genre+
        "\nStudio     : " +studio+
        "\nDurasi     : " +durasi+
        "\nHarga      : " +harga;
    }
}
