package overriding;

/**
 *
 * @author ADELIA
 */
public class Bollywood extends Bioskop{
    String pemeran;
    
    public Bollywood(String judul, String pemeran, String durasi, String sutradara, int harga){
        super(judul, durasi, sutradara, harga);
        this.pemeran = pemeran;
    }
    
    @Override
    public String toString(){
        return 
        "-------Bioskop XXI-------"+
        "\nJudul      : " +judul+
        "\nPemeran    : " +pemeran+
        "\nDurasi     : " +durasi+
        "\nSutradara  : " +sutradara+
        "\nHarga      : " +harga;
    }
}