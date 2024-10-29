import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan nama tamu: ");
        String namaTamu = input.nextLine();
        System.out.print("Masukkan ID tamu: ");
        String idTamu = input.nextLine();
        Tamu tamu = new Tamu(namaTamu, idTamu); // Menggunakan constructor

        
        System.out.println("Pilih tipe kamar:");
        System.out.println("1. Standar");
        System.out.println("2. Suite");
        System.out.print("Pilihan: ");
        int pilihanKamar = input.nextInt();
        Kamar kamar; 
        if (pilihanKamar == 1) {
            kamar = new KamarStandar("101"); 
        } else {
            kamar = new KamarSuite("201"); 
        }

        
        System.out.print("Masukkan lama menginap (malam): ");
        int lamaInap = input.nextInt();

       
        System.out.println("Pilih fasilitas tambahan (masukkan 0 jika tidak ingin menambah fasilitas):");
        System.out.println("1. WiFi - Rp 50,000");
        System.out.println("2. Air Panas - Rp 75,000");
        System.out.print("Pilihan: ");
        int pilihanFasilitas = input.nextInt();
        
        FasilitasTambahan fasilitasTambahan = null; // Mendeklarasikan variabel fasilitas
        if (pilihanFasilitas == 1) {
            fasilitasTambahan = FasilitasTambahan.wifi(); // Memanggil method statis
        } else if (pilihanFasilitas == 2) {
            fasilitasTambahan = FasilitasTambahan.airPanas(); // Memanggil method statis
        }

        // Membuat reservasi
        Reservasi reservasi = new Reservasi(tamu, kamar, lamaInap, fasilitasTambahan); // Menggunakan constructor
        
       
        System.out.println("\n--- Detail Reservasi ---");
        reservasi.tampilkanStatusReservasi(); // Menggunakan metode dari kelas Reservasi

        input.close();
    }
}
