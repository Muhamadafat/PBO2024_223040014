
package Pertemuan12.Latihan2.Tugas;

public abstract class Handphone{
    protected String merk;
    protected String model;
    protected int tahun;
    protected double harga;

    public Handphone(String merk, String model, int tahun, double harga) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.harga = harga;
    }

    public abstract void displayInfo();
}
