package Pertemuan12.Latihan2.Tugas;

public class InterfaceMain {
    public static void main(String[] args) {
        Handphone handphone1 = new Spesifikasi("Apple", "Iphone 11", 2019, 8000000, "Hitam", "SmartPhone");
        handphone1.displayInfo();

        Handphone handphone2 = new Spesifikasi("Apple", "Iphone 12", 2020, 10000000, "Putih", "SmartPhone");
        handphone2.displayInfo();

        Handphone handphone3 = new Spesifikasi("Apple", "Iphone 13", 2021, 13000000, "Green", "SmartPhone");
        handphone3.displayInfo();
    }
}

