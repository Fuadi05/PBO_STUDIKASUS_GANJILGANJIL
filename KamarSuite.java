public class KamarSuite extends Kamar { // Inheritance
    public KamarSuite(String nomorKamar) {
        super(nomorKamar, 500000); // Menggunakan constructor superclass
    }

    @Override
    public double hitungTotalBiaya(int lamaInap) {
        double biayaDasar = super.hitungTotalBiaya(lamaInap); // Panggil metode dari kelas induk
        double biayaAdminSuite = 5000; // Biaya tambahan khusus untuk suite
        return biayaDasar + biayaAdminSuite;
    }
}
