public class FasilitasTambahan {
    private String namaFasilitas; // Encapsulation
    private double biaya; 

    public FasilitasTambahan(String namaFasilitas, double biaya) { // Constructor
        this.namaFasilitas = namaFasilitas; 
        this.biaya = biaya; 
    }

    public double getBiaya() { // Getter
        return biaya; 
    }

    public String getNamaFasilitas() { // Getter
        return namaFasilitas; 
    }

    // Static methods untuk pilihan fasilitas tambahan
    public static FasilitasTambahan wifi() { // Overloading (method)
        return new FasilitasTambahan("WiFi", 50000); 
    }

    public static FasilitasTambahan airPanas() { // Overloading (method)
        return new FasilitasTambahan("Air Panas", 75000);
    }
}
