package model;

public class Makanan {
    
    private String idMakanan;
    private String namaMakanan;
    private int hargaMakanan;
    private boolean Ada;
    public String getIdMakanan() {
        return this.idMakanan;
    }
    public Makanan setIdMakanan(String idMakanan) {
        this.idMakanan = idMakanan;
        return this;
    }
    public String getNamaMakanan() {
        return this.namaMakanan;
    }
    public Makanan setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
        return this;
    }
    public int getHargaMakanan() {
        return this.hargaMakanan;
    }
    public Makanan setHargaMakanan(int hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
        return this;
    }
    public boolean isAda() {
        return Ada;
    }
    public Makanan setAda(boolean Ada) {
        this.Ada = Ada;
        return this;
    }
    
    }

