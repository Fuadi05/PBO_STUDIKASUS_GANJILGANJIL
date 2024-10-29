public class Tamu {
    private String nama; // Encapsulation
    private String id; 

    public Tamu(String nama, String id) { // Constructor
        this.nama = nama; 
        this.id = id; 
    }

    public String getNama() { // Getter
        return nama; 
    }

    public void setNama(String nama) { // Setter
        this.nama = nama;
    }

    public String getId() { // Getter
        return id; 
    }

    public void setId(String id) { // Setter
        this.id = id;
    }

    public void tampilkanInfoTamu() {
        System.out.println("Nama Tamu: " + nama + ", ID: " + id);
    }
}
