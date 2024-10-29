public class KamarStandar extends Kamar { // Inheritance
    public KamarStandar(String nomorKamar) {
        super(nomorKamar, 300000); // Menggunakan constructor superclass
    }

    @Override
    public double hitungTotalBiaya(int lamaInap) {
        double biayaDasar = super.hitungTotalBiaya(lamaInap); // Panggil metode dari kelas induk
        double biayaAdminStandar = 3000; // Biaya tambahan khusus untuk standar
        return biayaDasar + biayaAdminStandar;
    }
}
