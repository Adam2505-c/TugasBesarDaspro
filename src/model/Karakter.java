package model;

public class Karakter {
    
    private String idKarakter;
    private String namaKarakter;
    private boolean Ada;

    public String getIdKarakter() {
        return idKarakter;
    }

    public Karakter setIdKarakter(String idKarakter) {
        this.idKarakter = idKarakter;
        return this;
    }

    public String getNamaKarakter() {
        return namaKarakter;
    }

    public Karakter setNamaKarakter(String namaKarakter) {
        this.namaKarakter = namaKarakter;
        return this;
    }

    public boolean isAda() {
        return Ada;
    }

    public Karakter setAda(boolean Ada) {
        this.Ada = Ada;
        return this;
    }
}
