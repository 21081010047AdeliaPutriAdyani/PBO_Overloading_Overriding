package overriding;

/**
 *
 * @author ADELIA
 */
public class Hollywood extends Bioskop {
    String jenis;
    
    public Hollywood(String jenis, String judul, String durasi, String sutradara, int harga){
        super(judul, durasi, sutradara, harga);
        this.jenis = jenis;
    }
    
    @Override
    public String toString(){
        return 
        "-------Bioskop XXI-------"+
        "\nJenis      : " +jenis+
        "\nJudul      : " +judul+
        "\nDurasi     : " +durasi+
        "\nSutradara  : " +sutradara+
        "\nHarga      : " +harga;
    }
}
