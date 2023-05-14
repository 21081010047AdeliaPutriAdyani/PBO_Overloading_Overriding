package overriding;

/**
 *
 * @author ADELIA
 */
public class Bioskop {
    String judul, durasi, sutradara;
    int harga;
    
    public Bioskop(String judul, String durasi, String sutradara, int harga){
        this.judul = judul;
        this.durasi = durasi;
        this.sutradara = sutradara;
        this.harga = harga;
    }
    
    @Override
    public String toString(){
        return
        "-------Bioskop XXI-------"+
        "\nJudul      : " +judul+
        "\nDurasi     : " +durasi+
        "\nSutradara  : " +sutradara+
        "\nHarga      : " +harga;
    }
}

