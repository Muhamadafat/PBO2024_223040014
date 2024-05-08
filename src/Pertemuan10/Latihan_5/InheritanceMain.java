package Pertemuan10.Latihan_5;

public class InheritanceMain {

    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen = new Dosen("0000000000", "Muhamad Alfath Septian", "Bandung");
        
        // Menampilkan Informasi Dosen
        System.out.println("NIDN: " + dosen.getNidn() +
                "\nNama: " + dosen.getNama() +
                "\nAlamat: " + dosen.getAlamat());
    }
}
