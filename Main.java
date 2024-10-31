import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Tamu tamu = new Tamu("Nama Default", "ID Default");

        System.out.print("Masukkan ID tamu: ");
        tamu.setId(input.nextLine()); // Menggunakan setter untuk mengatur ID tamu

        System.out.print("Masukkan nama tamu: ");
        tamu.setNama(input.nextLine()); // Menggunakan setter untuk mengatur nama tamu

        System.out.println("Pilih tipe kamar:");
        System.out.println("1. Standar");
        System.out.println("2. Suite");
        System.out.print("Pilihan: ");
        int pilihanKamar = input.nextInt();

        Kamar kamar; 
        if (pilihanKamar == 1) {
            kamar = new KamarStandar("Nomor Kamar Default"); 
        } else {
            kamar = new KamarSuite("Nomor Kamar Default"); 
        }
       
        System.out.print("Masukkan nomor kamar: ");
        kamar.setNomorKamar(input.next()); // Menggunakan setter untuk mengatur nomor kamar

       
        System.out.print("Masukkan lama menginap (malam): ");
        int lamaInap = input.nextInt();

        
        System.out.println("Pilih fasilitas tambahan (masukkan 0 jika tidak ingin menambah fasilitas):");
        System.out.println("1. WiFi - Rp 50,000");
        System.out.println("2. Air Panas - Rp 75,000");
        System.out.print("Pilihan: ");
        int pilihanFasilitas = input.nextInt();
        
        FasilitasTambahan fasilitasTambahan = null; 
        if (pilihanFasilitas == 1) {
            fasilitasTambahan = FasilitasTambahan.wifi(); // Memanggil method statis
        } else if (pilihanFasilitas == 2) {
            fasilitasTambahan = FasilitasTambahan.airPanas(); // Memanggil method statis
        }

        Reservasi reservasi = new Reservasi(tamu, kamar, lamaInap, fasilitasTambahan); // Menggunakan constructor
        
       
        System.out.println("\n--- Detail Reservasi ---");
        reservasi.tampilkanStatusReservasi(); // Menggunakan metode dari kelas Reservasi

        input.close();
    }
}
