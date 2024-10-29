public class Kamar {
    private String nomorKamar; // Encapsulation
    private double hargaPerMalam; 

    public Kamar(String nomorKamar, double hargaPerMalam) { // Constructor
        this.nomorKamar = nomorKamar; 
        this.hargaPerMalam = hargaPerMalam; 
    }

    public String getNomorKamar() { // Getter
        return nomorKamar; 
    }

    public void setNomorKamar(String nomorKamar) { // Setter
        this.nomorKamar = nomorKamar;
    }

    public double getHargaPerMalam() { // Getter
        return hargaPerMalam;
    }

    public void setHargaPerMalam(double hargaPerMalam) { // Setter
        this.hargaPerMalam = hargaPerMalam;
    }

    // Method ini dapat dioverride oleh subclass
    public double hitungTotalBiaya(int lamaInap) { 
        return hargaPerMalam * lamaInap; 
    }

    public void tampilkanInfoKamar() {
        System.out.println("Kamar No: " + nomorKamar + ", Harga per malam: Rp " + hargaPerMalam);
    }
}
