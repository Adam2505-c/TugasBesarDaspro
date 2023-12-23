package model;

public class Barang {

    private String idBarang;
    private String namaBarang;
    private int hargaBarang;
    private boolean Ada;

    public String getIdBarang() {
        return idBarang;
    }
    public Barang setIdBarang(String idBarang) {
        this.idBarang = idBarang;
        return this;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public Barang setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
        return this;
    }
    public int getHargaBarang() {
        return hargaBarang;
    }
    public Barang setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
        return this;
    }
    public boolean isAda() {
        return Ada;
    }
    public Barang setAda(boolean Ada) {
        this.Ada = Ada;
        return this;
    }
}
