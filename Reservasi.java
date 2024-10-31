public class Reservasi {
    private Tamu tamu; // Encapsulation
    private Kamar kamar; 
    private int lamaInap; 
    private FasilitasTambahan fasilitasTambahan; 

    public Reservasi(Tamu tamu, Kamar kamar, int lamaInap, FasilitasTambahan fasilitasTambahan) { // Constructor
        this.tamu = tamu; 
        this.kamar = kamar; 
        this.lamaInap = lamaInap; 
        this.fasilitasTambahan = fasilitasTambahan; 
    }

    public double hitungBiayaTotal() { // Menggunakan getter
        double biayaKamar = kamar.hitungTotalBiaya(lamaInap); // Polymorphism
        double biayaFasilitas;
        if (fasilitasTambahan != null) {
            biayaFasilitas = fasilitasTambahan.getBiaya();
        } else {
            biayaFasilitas = 0;
        }
        return biayaKamar + biayaFasilitas; 
    }

    public void tampilkanStatusReservasi() {
        tamu.tampilkanInfoTamu(); 
        kamar.tampilkanInfoKamar(); 
        System.out.println("Lama Inap: " + lamaInap + " malam");
        
        if (fasilitasTambahan != null) {
            System.out.println("Fasilitas Tambahan: " + fasilitasTambahan.getNamaFasilitas() + " - Rp " + fasilitasTambahan.getBiaya()); // Getter
        } else {
            System.out.println("Tidak ada fasilitas tambahan.");
        }
        
        System.out.println("Total Biaya: Rp " + hitungBiayaTotal()); // Menggunakan metode di dalam kelas ini
    }
}
